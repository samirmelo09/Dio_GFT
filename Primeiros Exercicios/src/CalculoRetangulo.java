import java.util.Scanner;

public class CalculoRetangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a medida da base do retangulo: ");
        double base = scanner.nextDouble();
        System.out.println("Informe a altura do retangulo: ");
        double altura = scanner.nextDouble();
        double area = base * altura;
        System.out.printf("Um retangulo com base %.2f e altura %.2f possui %.2f de área\n", base, altura, area);
        scanner.close();
    }
}
