package org.example;

public class Main {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Digite um numero: ");
        int primitiveValue = scanner.nextInt();
        Integer wrapperValue = Integer.valueOf(primitiveValue);
        System.out.println("Valor primitivo: " + primitiveValue);
        System.out.println("Valor wrapper: " + wrapperValue);
    }
}