/*
2. Escreva um código quando o usuário entra com height e peso seja feito o cálculo do IMC
(imc=pesopeso/(height*height)) e seja exibido a mensagem de acordo com o resultado:
- Se for menor ou igual a 18,5 "Abaixo do peso"
- Se for entre 18,6 a 24,9 "Peso ideal"
- Se for entre 25,0 a 29,9 "Levemente acima do peso"
- Se for entre 30,0 a 34,9 "Obesidade grau I"
- Se for entre 35,0 a 39,9 "Obesidade grau II (Severa)"
- Se for maior ou igual a 40,0 "Obesidade grau III (Mórbida)"
*/

import java.util.Scanner;

public class Imc {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Informe sua altura (em metros, ex: 1,75): ");
        var height = scanner.nextDouble();

        System.out.println("Informe seu peso (em kg, ex: 70,5): ");
        var peso = scanner.nextDouble();

        var imc = peso / (height * height);

        System.out.printf("Seu IMC é: %.2f%n", imc);

        if (imc <= 18.5) {
            System.out.println("Abaixo do peso");
        } else if (imc <= 24.9) {
            System.out.println("Peso ideal");
        } else if (imc <= 29.9) {
            System.out.println("Levemente acima do peso");
        } else if (imc <= 34.9) {
            System.out.println("Obesidade grau I");
        } else if (imc <= 39.9) {
            System.out.println("Obesidade grau II (Severa)");
        } else {
            System.out.println("Obesidade grau III (Mórbida)");
        }
    }
}
