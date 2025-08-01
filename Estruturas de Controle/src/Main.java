/*
1. escreva um código que um usuario entre com um nuemro e seja gerado a tabuada
de um ate 10 desse numero;
*/



import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Informe um número para gerar a tabuada:");
        var number = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            var result = number * i;
            System.out.printf("%d x %d = %d\n", number, i, result);
        }
    }
}
