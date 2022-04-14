package br.com.aula4.beans;

public class Motor {
    private int potencia;
    private int cilindro;
    private String combustivel;

    // construtor
    public Motor(){}

    public Motor(int potencia, int cilindro, String combustivel) {
        this.potencia = potencia;
        this.cilindro = cilindro;
        this.combustivel = combustivel;
    }
    // get + set
    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getCilindro() {
        return cilindro;
    }

    public void setCilindro(int cilindro) {
        this.cilindro = cilindro;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    // metodos
    public void ligar(){
        System.out.println("Ligado...");
    }
    public void desligar(){
        System.out.println("Desligar...");
    }

    @Override
    public String toString() {
        return "Motor{" +
                "potencia=" + potencia +
                ", cilindro=" + cilindro +
                ", combustivel='" + combustivel + '\'' +
                '}';
    }
}
