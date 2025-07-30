🖥️ Programa Java – Cálculo de Idade
Este projeto é um programa simples em Java que solicita ao usuário o nome e o ano de nascimento.
Com base no ano atual, o programa calcula a idade e exibe uma mensagem personalizada.

import java.time.OffsetDateTime;
import java.util.Scanner;  

public class Main {
    public static void main(String[] args) {
        var baseYear = OffsetDateTime.now().getYear();
        var scanner = new Scanner(System.in);
        
        System.out.println("Informe seu nome: ");
        var name = scanner.next();
        
        System.out.println("Informe seu ano de nascimento: ");
        var year = scanner.nextInt();
        
        var age = baseYear - year;
        System.out.printf("Olá %s voce tem %s anos \n", name, age);
    }
}

▶️ Exemplo de Execução
Entrada:

Informe seu nome: 
Samir
Informe seu ano de nascimento: 
1990

Saída:
Olá Samir voce tem 35 anos 


📚 Conceitos Envolvidos

- Classe → Estrutura que define atributos e métodos (aqui temos a classe Main).
- Método main → Ponto de entrada do programa Java.
- Objeto → Instância de uma classe (ex.: scanner criado a partir de Scanner).
- Scanner → Lê dados digitados pelo usuário via teclado.
- OffsetDateTime → Obtém o ano atual do sistema.
- Saída formatada (printf) → Exibe mensagens com placeholders (%s).


📖 Explicação Linha por Linha
- import java.time.OffsetDateTime; → Importa a classe para trabalhar com data/hora.
- import java.util.Scanner; → Importa a classe para ler dados do usuário.
- public class Main { ... } → Declara a classe principal do programa.
- public static void main(String[] args) → Ponto de entrada da aplicação Java.
- var baseYear = OffsetDateTime.now().getYear(); → Obtém o ano atual.
- var scanner = new Scanner(System.in); → Cria um objeto para ler dados do teclado.
- System.out.println("Informe seu nome: "); → Exibe mensagem pedindo o nome.
- var name = scanner.next(); → Lê o nome digitado pelo usuário.
- System.out.println("Informe seu ano de nascimento: "); → Exibe mensagem pedindo o ano de nascimento.
- var year = scanner.nextInt(); → Lê o ano de nascimento.
- var age = baseYear - year; → Calcula a idade.
- System.out.printf("Olá %s voce tem %s anos \n", name, age); → Exibe a mensagem final formatada.

🎯 Objetivo do Projeto
Este projeto tem como objetivo praticar:

- Estrutura de um programa em Java.
- Entrada de dados com Scanner.
- Uso de datas com OffsetDateTime.
- Cálculo de variáveis simples.
- Saída formatada no console.

=================================================================================================
📐 Programa Java – Cálculo da Área do Quadrado
Este programa em Java recebe o tamanho do lado de um quadrado, calcula sua área usando a fórmula:
área = lado × lado
e exibe o resultado na tela.

📚 Conceitos Envolvidos
- Classe → Estrutura que organiza código em Java (aqui, QuadradoArea).
- Método main → Ponto de entrada do programa.
- Objeto → Instância de uma classe (ex.: scanner criado a partir de Scanner).
- Scanner → Classe utilizada para ler dados do teclado.
- Variável (double) → Armazena números com casas decimais, ideal para cálculos matemáticos.
- Operação aritmética → lado * lado para calcular a área.
- Saída formatada (printf) → Usada para exibir valores com formatação (%.2f para duas casas decimais).

📂 Código Fonte
import java.util.Scanner;

public class QuadradoArea {
    public static void main(String[] args) {
        // Criando o objeto Scanner para capturar a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita o valor do lado do quadrado
        System.out.println("Informe o tamanho do lado do quadrado: ");
        double lado = scanner.nextDouble();

        // Calcula a área do quadrado (fórmula: lado x lado)
        double area = lado * lado;

        // Exibe o resultado
        System.out.printf("A área do quadrado de lado %.2f é %.2f \n", lado, area);

        // Fecha o scanner (boa prática)
        scanner.close();
    }
}

📖 Explicação Linha por Linha
import java.util.Scanner; 
→ Importa a classe Scanner para permitir a leitura de dados digitados pelo usuário.

public class QuadradoArea { 
→ Declara a classe chamada QuadradoArea, que contém nosso programa.

public static void main(String[] args) { 
→ Método principal que executa o programa.

Scanner scanner = new Scanner(System.in); 
→ Cria um objeto scanner para ler a entrada do usuário via teclado.

System.out.println("Informe o tamanho do lado do quadrado: "); 
→ Exibe a mensagem pedindo para o usuário informar o tamanho do lado.

double lado = scanner.nextDouble(); 
→ Lê um número decimal digitado pelo usuário e armazena na variável lado.

double area = lado * lado; 
→ Calcula a área do quadrado multiplicando o lado por ele mesmo.

System.out.printf("A área do quadrado de lado %.2f é %.2f \n", lado, area); 
→ Exibe a área formatada com duas casas decimais.

scanner.close(); 
→ Fecha o objeto scanner para liberar recursos (boa prática).

▶️ Exemplo de Execução
Entrada:
Informe o tamanho do lado do quadrado: 
7.5

Saída:
A área do quadrado de lado 7.50 é 56.25 

🎯 Objetivo do Projeto
Este projeto tem como objetivo:

- Praticar a estrutura básica de um programa em Java.
- Exercitar a entrada de dados usando Scanner.
- Aplicar a fórmula matemática para cálculo da área de um quadrado.
- Trabalhar com variáveis e tipos numéricos (double).
- Exibir informações formatadas no console usando printf.
==========================================================================================================================

👥 Programa Java – Diferença de Idade entre Duas Pessoas
Este programa em Java solicita o nome e a idade de duas pessoas.
Com base nos valores informados, calcula e exibe a diferença de idade entre elas.

📚 Conceitos Envolvidos
- Classe → Estrutura que organiza o programa (aqui, DiferencaIdade).
- Método main → Ponto de entrada da aplicação Java.
- Objeto → Instância de uma classe (scanner criado a partir de Scanner).
- Scanner → Classe usada para capturar entradas do usuário.
- Variáveis (String e int) → Guardam valores de texto (nomes) e inteiros (idades).
- Math.abs() → Função que retorna o valor absoluto de um número (garantindo diferença positiva).
- Saída formatada (printf) → Exibe mensagens com placeholders %s (Strings) e %d (números inteiros).

📂 Código Fonte
import java.util.Scanner;

public class DiferencaIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de dados da primeira pessoa
        System.out.println("Informe o nome da primeira pessoa: ");
        String nome1 = scanner.next();
        System.out.println("Informe a idade de " + nome1 + ": ");
        int idade1 = scanner.nextInt();

        // Entrada de dados da segunda pessoa
        System.out.println("Informe o nome da segunda pessoa: ");
        String nome2 = scanner.next();
        System.out.println("Informe a idade de " + nome2 + ": ");
        int idade2 = scanner.nextInt();

        // Calcula a diferença absoluta entre as idades
        int diferenca = Math.abs(idade1 - idade2);

        // Exibe o resultado
        System.out.printf("A diferença de idade entre %s e %s é de %d anos.\n", nome1, nome2, diferenca);

        scanner.close();
    }
}

📖 Explicação Linha por Linha
import java.util.Scanner; 
→ Importa a classe Scanner para leitura de dados via teclado.

public class DiferencaIdade { ... } 
→ Define a classe principal do programa.

Scanner scanner = new Scanner(System.in); 
→ Cria um objeto para capturar entradas do usuário.

Entrada da primeira pessoa (nome1, idade1) 
→ Solicita e armazena o nome e a idade.

Entrada da segunda pessoa (nome2, idade2) 
→ Solicita e armazena o nome e a idade.

Math.abs(idade1 - idade2); 
→ Calcula a diferença absoluta entre as idades (sempre positiva).

System.out.printf(...) 
→ Exibe a mensagem final formatada com os nomes e a diferença.

scanner.close(); 
→ Fecha o objeto Scanner para liberar recursos.

▶️ Exemplo de Execução

Entrada:
Informe o nome da primeira pessoa: 
Ana
Informe a idade de Ana: 
25
Informe o nome da segunda pessoa: 
Carlos
Informe a idade de Carlos: 
30

Saída:
A diferença de idade entre Ana e Carlos é de 5 anos.

🎯 Objetivo do Projeto
Este projeto tem como objetivo:

- Praticar a entrada de dados com Scanner.
- Trabalhar com variáveis do tipo String e int.
- Utilizar a função Math.abs() para obter valores absolutos.
- Exibir resultados de forma formatada no console.