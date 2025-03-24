package br.senai.futurodev.lab365.miniprojeto.main;

import br.senai.futurodev.lab365.miniprojeto.models.AreaVerde;
import br.senai.futurodev.lab365.miniprojeto.models.Avaliacao;
import br.senai.futurodev.lab365.miniprojeto.models.Localizacao;
import br.senai.futurodev.lab365.miniprojeto.repositories.AreaVerdeRepository;
import br.senai.futurodev.lab365.miniprojeto.repositories.AvaliacaoRepository;
import br.senai.futurodev.lab365.miniprojeto.repositories.LocalizacaoRepository;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Mapeamento de Áreas Verdes em Joinville: ");
        Scanner entrada = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("\nMENU");
            System.out.println("1- Listar Áreas Verdes");
            System.out.println("2- Avaliar Área Verde");
            System.out.println("3- Detalhes da Área Verde");
            System.out.println("4- Cadastrar nova Área Verde");
            System.out.println("0- Sair");

            opcao = Integer.parseInt(entrada.nextLine());

            switch (opcao) {
                case 1 -> listarAreasVerdes();
                case 2 -> avaliarAreaVerde(entrada);
                case 3 -> verDetalhes(entrada);
                case 4 -> cadastrarArea(entrada);
                case 0 -> System.out.println("Encerrando sessão.");
                default -> System.out.println("Selecione uma opção válida.");
            }
        } while (opcao != 0);
    }

    private static void listarAreasVerdes() {
        for (AreaVerde areaVerde : AreaVerdeRepository.listarAreaVerde()) {
            System.out.println(areaVerde.listarDados());
        }
    }
    private static void avaliarAreaVerde(Scanner entrada) {
        System.out.print("Digite o ID da Área Verde que deseja avaliar: ");
        int id = entrada.nextInt();
        entrada.nextLine();

        AreaVerde areaVerde = AreaVerdeRepository.buscar(id);
        if (areaVerde == null) {
            System.out.println("Área Verde não encontrada.");
            return;
        }
        System.out.println("Quantidade de Árvores no ambiente:");
        int quantidadeArvores = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Qualidade do Ar:");
        int qualidadeAr = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ausência de poluição sonora:");
        int poluicaoSonora = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Quantidade de lixeiras dísponivel no local:");
        int coletaResiduos = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Facilidade para chegar no local utilizando transporte público:");
        int transportePublico = entrada.nextInt();
        entrada.nextLine();

        Avaliacao novaAvaliacao = new Avaliacao(id, quantidadeArvores, qualidadeAr, poluicaoSonora, coletaResiduos, transportePublico);
        AvaliacaoRepository.salvar(novaAvaliacao);
        AreaVerdeRepository.buscar(id).setAvaliacao(novaAvaliacao);
        System.out.print("Área avaliada com sucesso!");
    }

    public static void verDetalhes(Scanner entrada) {
        System.out.print("Informe o ID para ver informações detalhadas: ");
        int id = Integer.parseInt(entrada.nextLine());
        System.out.println(AreaVerdeRepository.buscar(id).verDetalhes());
    }
    private static void cadastrarArea(Scanner entrada) {
        AreaVerde novaAreaVerde = new AreaVerde();

        System.out.println("Digite o nome da área que deseja cadastrar:");
        String nome = entrada.nextLine();
        novaAreaVerde.setNome(nome);

        System.out.println("Digite a latitude:");
        double latitude = entrada.nextDouble();

        System.out.println("Digite a longitude:");
        double longitude = entrada.nextDouble();
        entrada.nextLine();

        System.out.println("Digite o tipo de vegetação da área:");
        String tipoVegetacao = entrada.nextLine();
        novaAreaVerde.setTipoVegetacao(tipoVegetacao);

        System.out.println("Digite o horário de abertura da área:");
        String horarioFuncionamento = entrada.nextLine();
        novaAreaVerde.setHorariosFuncionamento(horarioFuncionamento);

        System.out.println("Digite a atividade disponível na área:");
        String atividadeDisponivel = entrada.nextLine();
        novaAreaVerde.setAtividadeDisponivel(atividadeDisponivel);

        Localizacao novaLoc = new Localizacao(novaAreaVerde.getId(), latitude, longitude);
        LocalizacaoRepository.salvar(novaLoc);
        novaAreaVerde.setLocalizacao(novaLoc);

        AreaVerdeRepository.salvar(novaAreaVerde);
        System.out.println("Área Verde cadastrada com sucesso!");
    }
}