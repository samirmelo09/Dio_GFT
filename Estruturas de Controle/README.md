🖥️ Programa Java – Verificação de Divisão com Resto Zero
Este programa em Java solicita ao usuário um número inicial e, em seguida, pede que ele informe outros números.
O programa continua rodando enquanto os números informados forem divisíveis pelo número inicial.
Caso seja digitado um número menor que o inicial, ele é ignorado.
O programa só termina quando for digitado um número que não seja divisível pelo inicial.

📜 Código:

import java.util.Scanner;

public class RestZero {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        // Solicita o número inicial
        System.out.println("Informe um número:");
        var number = scanner.nextInt();

        // Flag de controle do laço
        var keepVerify  = true;

        // Enquanto a condição for verdadeira
        while (keepVerify){
            // Solicita um novo número para verificação
            System.out.println("Informe o numero para verificação:");
            var toVerify = scanner.nextInt();

            // Ignora números menores que o inicial
            if (toVerify < number){
                System.out.printf("Informe um numero maior que %s \n", number);
                continue; // volta para o início do laço
            }

            // Calcula o resto da divisão
            var result = toVerify % number;

            // Atualiza a flag: só continua se resto == 0
            keepVerify = result == 0;

            // Mostra a operação realizada
            System.out.printf("%s %% %s = %s \n", toVerify, number, result);
        }
    }
}


▶️ Exemplo de Execução
Informe um número:
5
Informe o numero para verificação:
10
10 % 5 = 0
Informe o numero para verificação:
15
15 % 5 = 0
Informe o numero para verificação:
7
7 % 5 = 2

🛑 O programa encerra porque 7 % 5 não é igual a 0.


📚 Conceitos Envolvidos

- Entrada de dados com Scanner: leitura de valores digitados pelo usuário.
- Laço de repetição while: execução contínua até que uma condição seja satisfeita.
- Controle de fluxo com if e continue: ignorando valores inválidos e repetindo o laço.
- Operador módulo %: usado para obter o resto da divisão.
- Interpolação de strings com System.out.printf: formatação da saída no console.


📖 Explicação Linha por Linha
- import java.util.Scanner; 
→ Importa a classe Scanner para ler dados do usuário.

- public class RestZero { ... } 
→ Declara a classe principal do programa.

- var scanner = new Scanner(System.in); 
→ Cria um objeto scanner para capturar valores digitados no console.

- System.out.println("Informe um número:"); 
→ Exibe mensagem pedindo o número inicial.

- var number = scanner.nextInt(); 
→ Lê o número inicial informado pelo usuário.

- var keepVerify = true; 
→ Variável booleana que controla o laço while.

- while (keepVerify) { ... } 
→ Laço que continua até que keepVerify se torne false.

- System.out.println("Informe o numero para verificação:"); 
→ Solicita um novo número a ser verificado.

- var toVerify = scanner.nextInt(); 
→ Lê o número digitado.

- if (toVerify < number) { ... continue; } 
→ Se o número for menor que o inicial, exibe aviso e ignora essa iteração.

- var result = toVerify % number; 
→ Calcula o resto da divisão entre os dois números.

- keepVerify = result == 0; 
→ Atualiza a flag: se resto for 0, continua; caso contrário, encerra.

- System.out.printf("%s %% %s = %s \n", toVerify, number, result); 
→ Exibe a operação e o resultado.

🎯 Objetivo do Projeto
Criar um programa que:

- Receba um número inicial.
- Solicite outros números e verifique se são divisíveis pelo número inicial.
- Ignore números menores que o inicial.
- Continue rodando até que um número informado tenha resto diferente de zero na divisão.

=================================================================================================
🔢 Programa Java – Gerador de Tabuada
Este programa em Java solicita que o usuário informe um número e, em seguida, gera a tabuada desse número de 1 até 10, exibindo os resultados no console.

📚 Conceitos Envolvidos
- Entrada de dados com Scanner → para receber o número digitado pelo usuário.
- Laço de repetição for → para gerar a sequência da tabuada de 1 até 10.
- Operações aritméticas (*) → multiplicação para calcular cada resultado.
- Saída formatada com System.out.printf → para exibir cada linha da tabuada.

📂 Código
import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        // Solicita o número ao usuário
        System.out.println("Informe um número para gerar a tabuada:");
        var number = scanner.nextInt();

        // Laço para gerar a tabuada de 1 até 10
        for (int i = 1; i <= 10; i++) {
            var result = number * i;
            System.out.printf("%d x %d = %d%n", number, i, result);
        }
    }
}


📖 Explicação Linha por Linha
import java.util.Scanner;
 → importa a classe Scanner para ler valores digitados pelo usuário.

public class Tabuada { ... }
 → declaração da classe principal chamada Tabuada.

var scanner = new Scanner(System.in); 
→ cria um objeto scanner para capturar entrada do usuário.

System.out.println("Informe um número para gerar a tabuada:"); 
→ exibe mensagem solicitando o número.

var number = scanner.nextInt(); 
→ lê o número informado pelo usuário.

for (int i = 1; i <= 10; i++) { ... } 
→ estrutura de repetição que vai de 1 até 10.

var result = number * i; 
→ multiplica o número digitado pelo contador do laço.

System.out.printf("%d x %d = %d%n", number, i, result); 
→ exibe a operação no formato de tabuada.

▶️ Exemplo de Execução
Informe um número para gerar a tabuada:
7
7 x 1 = 7
7 x 2 = 14
7 x 3 = 21
7 x 4 = 28
7 x 5 = 35
7 x 6 = 42
7 x 7 = 49
7 x 8 = 56
7 x 9 = 63
7 x 10 = 70


🎯 Objetivo do Projeto
Este projeto tem como objetivo:

- Permitir que o usuário informe um número.
- Exibir no console a tabuada desse número de 1 até 10.
- Exercitar os conceitos de entrada de dados, laços de repetição e operações aritméticas.

==========================================================================================================================

⚖️ Pograma Java – Cálculo do IMC
Este programa em Java solicita ao usuário a altura e o peso, calcula o Índice de Massa Corporal (IMC) e exibe uma mensagem correspondente à classificação do resultado.

📚 Conceitos Envolvidos
- Entrada de dados com Scanner → captura peso e altura do usuário.
- Operações aritméticas (/, *) → cálculo matemático do IMC.
- Estruturas condicionais (if-else if-else) → para verificar a faixa do IMC.
- Saída formatada com System.out.printf → exibir resultado com casas decimais.

📂 Código Fonte
import java.util.Scanner;

public class Imc {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        // Entrada de dados
        System.out.println("Informe sua altura (em metros, ex: 1.75): ");
        var altura = scanner.nextDouble();

        System.out.println("Informe seu peso (em kg, ex: 70.5): ");
        var peso = scanner.nextDouble();

        // Cálculo do IMC
        var imc = peso / (altura * altura);

        // Exibe o IMC calculado com 2 casas decimais
        System.out.printf("Seu IMC é: %.2f%n", imc);

        // Verifica classificação do IMC
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


📖 Explicação Linha por Linha
import java.util.Scanner; 
→ importa a classe Scanner para leitura de dados.

public class CalculoIMC { ... } 
→ classe principal do programa.

var scanner = new Scanner(System.in); 
→ cria objeto para capturar valores digitados pelo usuário.

System.out.println("Informe sua altura..."); 
→ solicita a altura em metros.

var altura = scanner.nextDouble(); 
→ lê a altura como número decimal.

System.out.println("Informe seu peso..."); 
→ solicita o peso em kg.

var peso = scanner.nextDouble(); 
→ lê o peso como número decimal.

var imc = peso / (altura * altura); 
→ aplica a fórmula do IMC.

System.out.printf("Seu IMC é: %.2f%n", imc); 
→ mostra o IMC com duas casas decimais.

Bloco if-else if-else 
→ compara o valor do IMC com as faixas e exibe a mensagem correspondente.

▶️ Exemplo de Execução

Informe sua altura (em metros, ex: 1.75):
1.75
Informe seu peso (em kg, ex: 70):
70
Seu IMC é: 22.86
Peso ideal


🎯 Objetivo do Projeto
Este projeto tem como objetivo:

- Ler altura e peso informados pelo usuário.
- Calcular o IMC usando a fórmula: IMC = peso / (altura * altura)                              
- Exibir uma mensagem de acordo com a classificação da Organização Mundial da Saúde (OMS).

======================================================================================================
🔀 Pograma Java – Números Pares ou Ímpares em Intervalo
Este programa em Java solicita dois números e uma opção ("par" ou "impar").
Ele verifica os números no intervalo informado e exibe apenas os pares ou ímpares de acordo com a escolha do usuário, incluindo os valores de início e fim, exibidos em ordem decrescente.

📚 Conceitos Envolvidos
- Entrada de dados com Scanner → leitura de números e da opção do usuário.
- Laço de repetição for decrescente → percorrer o intervalo do maior para o menor.
- Operador módulo % → identificar pares (n % 2 == 0) e ímpares (n % 2 != 0).
- Comparação de strings com .equals() → checagem correta da escolha ("par" ou "impar").
- Validação de entrada → garantir que o segundo número seja maior que o primeiro.

📜 Código:
import java.util.Scanner;

public class ParImparIntervalo {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        // Entrada do primeiro número
        System.out.println("Informe o primeiro número:");
        var first = scanner.nextInt();

        // Entrada do segundo número
        System.out.println("Informe o segundo número (maior que o primeiro):");
        var second = scanner.nextInt();

        // Validação: segundo número precisa ser maior
        if (second <= first) {
            System.out.println("Erro: o segundo número deve ser maior que o primeiro!");
            return; // encerra o programa
        }

        // Escolha par ou impar
        System.out.println("Deseja ver os números 'par' ou 'impar'?");
        var option = scanner.next();

        option = Normalizer.normalize(option, Normalizer.Form.NFD)
                .replaceAll("[^\\p{ASCII}]", "")
                .toLowerCase();

        // Loop decrescente do segundo até o primeiro número
        for (int i = second; i >= first; i--) {
            if (option.equals("par") && i % 2 == 0) {
                System.out.println(i);
            } else if (option.equals("impar") && i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}

📖 Explicação Linha por Linha
import java.util.Scanner; 
→ importa a classe Scanner para entrada de dados.

public class ParImparIntervalo { ... } 
→ define a classe principal do programa.

var scanner = new Scanner(System.in); 
→ cria o objeto scanner para leitura do teclado.

System.out.println("Informe o primeiro número:"); 
→ pede o número inicial.

var first = scanner.nextInt(); 
→ lê o número inicial.

System.out.println("Informe o segundo número..."); 
→ pede o número final.

var second = scanner.nextInt(); 
→ lê o número final.

if (second <= first) { ... } 
→ verifica se o segundo número é maior que o primeiro; se não for, encerra o programa.

System.out.println("Deseja ver os números 'par' ou 'impar'?"); 
→ pede a opção do usuário.

var option = scanner.next(); 
→ lê a escolha ("par" ou "impar").

option = Normalizer.normalize(option, Normalizer.Form.NFD)
→ prepara a string para que possamos remover os acentos.

.replaceAll("[^\\p{ASCII}]", "")
→ remove os acentos e caracteres especiais da string que não são ASCII.

.toLowerCase();
→ Converte todos os caracteres da string para minúsculo.

for (int i = second; i >= first; i--) { ... } 
→ laço que percorre o intervalo em ordem decrescente.

if (option.equals("par") && i % 2 == 0) 
→ imprime o número se for par e a opção escolhida for "par".

else if (option.equals("impar") && i % 2 != 0) 
→ imprime o número se for ímpar e a opção escolhida for "impar".

▶️ Exemplo de Execução
Exemplo1:
Informe o primeiro número:
3
Informe o segundo número (maior que o primeiro):
10
Deseja ver os números 'par' ou 'impar'?
impar
9
7
5
3
Exemplo2:
Informe o primeiro número:
4
Informe o segundo número (maior que o primeiro):
12
Deseja ver os números 'par' ou 'impar'?
par
12
10
8
6
4

🎯 Objetivo do Projeto
- Solicitar dois números: um inicial e um final (o final deve ser maior que o inicial).
- Perguntar ao usuário se deseja exibir os números pares ou ímpares.
- Mostrar os números correspondentes dentro do intervalo, em ordem decrescente.
- Comparar a escolha do usuário utilizando o método .equals() para evitar erros de comparação de strings.

