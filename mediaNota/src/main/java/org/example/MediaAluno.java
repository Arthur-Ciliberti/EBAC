package org.example;

import java.util.Scanner;

public class MediaAluno {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] notas = new double[4];
        double soma = 0.0;

        for (int i = 0; i < 4; i++) {
            System.out.print("Digite a " + (i + 1) + "ª nota: ");
            notas[i] = scanner.nextDouble();
            soma += notas[i]; // Somando as notas
        }

        double media = soma / 4;

        System.out.println("A média do aluno é: " + media);

        scanner.close();
    }
}