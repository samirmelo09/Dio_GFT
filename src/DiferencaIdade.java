import java.util.Scanner;

public class DiferencaIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o nome da primeira pessoa: ");
        String pessoa1 = scanner.next();
        System.out.println("Informe a idade de " + pessoa1 + ": ");
        int idade1 = scanner.nextInt();
        System.out.println("Informe o nome da segunda pessoa: ");
        String pessoa2 = scanner.next();
        System.out.println("Informe a idade de " + pessoa2 + ": ");
        int idade2 = scanner.nextInt();

        int diferenca = Math.abs(idade1 - idade2);
        System.out.printf("A diferença de idade entre %s e %s é de %d anos.\n", pessoa1, pessoa2, diferenca);

        scanner.close();
    }
}
