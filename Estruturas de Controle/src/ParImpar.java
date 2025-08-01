/*
3. Escreva um código que usuário entra com a primeiro número,
 um segundo número maior que o primeiro e escolha entre a opção
 par ou impar, com isso o código deve informar todos os números pares ou ímpares
 (de acordo com a seleção inicial) no intervalo de números informados, incluindo os números
 informados em ordem decrescente; (fazer comparação das strings com metodo equals)
*/

import java.util.Scanner;
import java.text.Normalizer;

public class ParImpar {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Informe o primeiro número:");
        var first = scanner.nextInt();
        System.out.println("Informe o segundo número (maior que o primeiro):");
        var second = scanner.nextInt();
        if (second <= first) {
            System.out.println("Erro: o segundo número deve ser maior que o primeiro!");
            return;
        }

        System.out.println("Deseja ver os números 'par' ou 'impar'?");
        var option = scanner.next();

        option = Normalizer.normalize(option, Normalizer.Form.NFD)
                .replaceAll("[^\\p{ASCII}]", "")
                .toLowerCase();

        for (int i = second; i >= first; i--) {
            if (option.equals("par") && i % 2 == 0) {
                System.out.println(i);
            } else if (option.equals("impar") && i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
