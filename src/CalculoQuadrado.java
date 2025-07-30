import java.util.Scanner;

public class CalculoQuadrado {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Informe o tamanho do lado do quadrado: ");
            double lado = scanner.nextDouble();
            double area = lado * lado;
            System.out.printf("A área do quadrado de lado %.2f é %.2f \n", lado, area);
            scanner.close();
        }

}
