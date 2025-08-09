package CalculoArea;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int options = 0;

        while (true) {
            System.out.println("Escolha a forma geométrica para calcular a área:");
            System.out.println("1 - Quadrado");
            System.out.println("2 - Retângulo");
            System.out.println("3 - Círculo");
            System.out.println("4 - Sair");
            System.out.print("Opção: ");
            options = scanner.nextInt();

            Forma forma = null; // Corrigido aqui

            switch (options) {
                case 1 -> forma = createQuadrado();
                case 2 -> forma = createRetangulo();
                case 3 -> forma = createCirculo();
                case 4 -> {
                    System.out.println("Saindo...");
                    return;
                }
                default -> System.out.println("Opção inválida!");
            }

            if (forma != null) {
                System.out.println("Área: " + forma.getArea());
            }

            System.out.println(); // Linha em branco para melhor leitura
        }
    }

    private static Quadrado createQuadrado() {
        System.out.print("Informe o tamanho dos lados do quadrado: ");
        double side = scanner.nextDouble();
        return new Quadrado(side);
    }

    private static Retangulo createRetangulo() {
        System.out.print("Informe a base do retângulo: ");
        double base = scanner.nextDouble();
        System.out.print("Informe a altura do retângulo: ");
        double height = scanner.nextDouble();
        return new Retangulo(height, base);
    }

    private static Circulo createCirculo() {
        System.out.print("Informe o raio do círculo: ");
        double radius = scanner.nextDouble();
        return new Circulo(radius);
    }
}
