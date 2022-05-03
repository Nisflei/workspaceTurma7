package br.com.aula10.beansMODEL;

public class Veiculo {
    private String placa;
    private String modelo;
    private int potenca;
    private String proprietario;

    public Veiculo(){}

    public Veiculo(String placa, String modelo, int potenca, String proprietario) {
        this.placa = placa;
        this.modelo = modelo;
        this.potenca = potenca;
        this.proprietario = proprietario;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPotenca() {
        return potenca;
    }

    public void setPotenca(int potenca) {
        this.potenca = potenca;
    }

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }
}
