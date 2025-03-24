package br.senai.futurodev.lab365.miniprojeto.models;

public class Localizacao {
    private int id;
    private double latitude;
    private double longitude;
    private int identificadorAreaVerde;

    public Localizacao(int identificadorAreaVerde, double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.identificadorAreaVerde = identificadorAreaVerde;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public int getIdentificadorAreaVerde() {
        return identificadorAreaVerde;
    }

    public void setIdentificadorAreaVerde(int identificadorAreaVerde) {
        this.identificadorAreaVerde = identificadorAreaVerde;
    }

    @Override
    public String toString() {
        return "Latitude: " + latitude + " Longitude: " + longitude;
    }
}
