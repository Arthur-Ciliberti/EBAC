package org.example;

public class Carro {

    private String marca;
    private String modelo;
    private int ano;
    private double velocidadeAtual;

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidadeAtual = 0.0;
    }

    public void acelerar(double velocidade) {
        velocidadeAtual += velocidade;
        System.out.println("O carro acelerou e agora está a " + velocidadeAtual + " km/h.");
    }

    public void frear(double reducao) {
        if (velocidadeAtual - reducao < 0) {
            velocidadeAtual = 0;
        } else {
            velocidadeAtual -= reducao;
        }
        System.out.println("O carro freou e agora está a " + velocidadeAtual + " km/h.");
    }

    public void exibirInformacoes() {
        System.out.println("Carro: " + marca + " " + modelo + " (" + ano + ")");
        System.out.println("Velocidade atual: " + velocidadeAtual + " km/h");
    }

    public static void main(String[] args) {
        Carro meuCarro = new Carro("Toyota", "Corolla", 2022);

        meuCarro.exibirInformacoes();

        meuCarro.acelerar(50);
        meuCarro.frear(20);
        meuCarro.frear(40);

        meuCarro.exibirInformacoes();
    }
}
