package br.senai.futurodev.lab365.miniprojeto.models;

import java.util.List;

public class AreaVerde {
    private Avaliacao avaliacao;
    private Localizacao localizacao;
    private int id;
    private String nome;
    private String atividadeDisponivel;
    private String tipoVegetacao;
    private String horariosFuncionamento;

    public AreaVerde(Localizacao localizacao, int id, String nome, String atividadeDisponivel, String tipoVegetacao, String horariosFuncionamento) {
        this.localizacao = localizacao;
        this.id = id;
        this.nome = nome;
        this.atividadeDisponivel = atividadeDisponivel;
        this.tipoVegetacao = tipoVegetacao;
        this.horariosFuncionamento = horariosFuncionamento;
    }

    public AreaVerde() {

    }

    public Localizacao getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(Localizacao localizacao) {
        this.localizacao = localizacao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAtividadeDisponivel() {
        return atividadeDisponivel;
    }

    public void setAtividadeDisponivel(String atividadeDisponivel) {
        this.atividadeDisponivel = atividadeDisponivel;
    }

    public Avaliacao getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(Avaliacao avaliacao) {
        this.avaliacao = avaliacao;
    }

    public String getTipoVegetacao() {
        return tipoVegetacao;
    }

    public void setTipoVegetacao(String tipoVegetacao) {
        this.tipoVegetacao = tipoVegetacao;
    }

    public String getHorariosFuncionamento() {
        return horariosFuncionamento;
    }

    public void setHorariosFuncionamento(String horariosFuncionamento) {
        this.horariosFuncionamento = horariosFuncionamento;
    }

    public String listarDados() {
        return "Nome: " + nome + "\nLocalizacao: " + localizacao + "\nHorario de funcionamento: " + horariosFuncionamento;
    }

    public String verDetalhes() {
        return "Id: " + id + "\nNome:" + nome + "\nAtividade disponivel: " + atividadeDisponivel + "\nTipo de vegetação: " + tipoVegetacao + "\nHorario de abertura: " + horariosFuncionamento + "\nMédia de avaliações: " + mediaAvaliacoes();
    }

    public double mediaAvaliacoes(){
        return avaliacao.calcularMedia();
    }
}
