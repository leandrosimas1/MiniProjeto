package br.senai.futurodev.lab365.miniprojeto.models;

public class Avaliacao {
    private int id;
    private int quantidadeArvores;
    private int qualidadeAr;
    private int ausenciaPoluicaoSonora;
    private int coletaResiduos;
    private int transportePublico;
    private int identificadorAreaVerde;

    public Avaliacao(int id, int quantidadeArvores, int qualidadeAr, int poluicaoSonora, int coletaResiduos, int transportePublico) {
        this.id = id;
        this.quantidadeArvores = quantidadeArvores;
        this.qualidadeAr = qualidadeAr;
        this.ausenciaPoluicaoSonora = ausenciaPoluicaoSonora;
        this.coletaResiduos = coletaResiduos;
        this.transportePublico = transportePublico;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantidadeArvores() {
        return quantidadeArvores;
    }

    public void setQuantidadeArvores(int quantidadeArvores) {
        this.quantidadeArvores = quantidadeArvores;
    }

    public int getQualidadeAr() {
        return qualidadeAr;
    }

    public void setQualidadeAr(int qualidadeAr) {
        this.qualidadeAr = qualidadeAr;
    }

    public int getAusenciaPoluicaoSonora() {
        return ausenciaPoluicaoSonora;
    }

    public void setAusenciaPoluicaoSonora(int ausenciaPoluicaoSonora) {
        this.ausenciaPoluicaoSonora = ausenciaPoluicaoSonora;
    }

    public int getColetaResiduos() {
        return coletaResiduos;
    }

    public void setColetaResiduos(int coletaResiduos) {
        this.coletaResiduos = coletaResiduos;
    }

    public int getTransportePublico() {
        return transportePublico;
    }

    public void setTransportePublico(int transportePublico) {
        this.transportePublico = transportePublico;
    }

    public int getIdentificadorAreaVerde() {
        return identificadorAreaVerde;
    }

    public void setIdentificadorAreaVerde(int identificadorAreaVerde) {
        this.identificadorAreaVerde = identificadorAreaVerde;
    }

    public double calcularMedia(){
        return (quantidadeArvores + qualidadeAr + ausenciaPoluicaoSonora + coletaResiduos + transportePublico) /5;
    }

    @Override
    public String toString() {
        return "Quantidade de Árvores: "+ quantidadeArvores + "\nQualidade do Ar: " + qualidadeAr + "\nAusência de Poluição Sonora: " + ausenciaPoluicaoSonora +
        "\nColeta de Resíduos: " + coletaResiduos + "\nFacilidade de Chegar Utilizando Transporte Público: " + transportePublico;
    }
}
