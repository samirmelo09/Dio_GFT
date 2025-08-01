/*
4. Escreva um código onde o usuário informa o número Inicial, posteriormente a forma outros
número (N), a execução de código irá continuar até que o número formado dividido pelo
primeiro número tem resto diferente de zero na divisão, numeros menores que o primeiro
numero devem ser ignorados;
 */


import java.util.Scanner;
public class RestZero {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Informe um número:");
        var number = scanner.nextInt();
        var keepVerify  = true;
        while (keepVerify){
            System.out.println("Informe o numero para verificação:");
            var toVerify = scanner.nextInt();
            if (toVerify < number){
                System.out.printf("Informe um numero maior que %s \n", number);
                continue;
            }
            var result = toVerify % number;
            keepVerify = result == 0;
            System.out.printf("%s %% %s = %s \n", toVerify, number, result);
        }


    }
}
