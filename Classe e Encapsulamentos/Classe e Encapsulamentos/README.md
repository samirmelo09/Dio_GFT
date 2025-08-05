🐾 Sistema de Controle de Banho – Petshop

🎯 Objetivo do Projeto
Este projeto implementa um sistema de controle de banhos em um petshop, simulando uma máquina que permite dar banho em pets, controlar o uso de água e shampoo, verificar os níveis de recursos e aplicar regras de negócio específicas.
O sistema utiliza Abstração e Encapsulamento para organizar as classes (Pet, PetMachine e Main).

📚 Conceitos Envolvidos
- Abstração: Representação de entidades reais (Pet e PetMachine) através de classes.
- Encapsulamento: Uso de private para proteger atributos internos, acessados apenas via métodos get e set.

Regras de Negócio:
- Apenas um pet por vez pode estar na máquina.
- Cada banho consome 10L de água e 2L de shampoo.
- Capacidade máxima: 30L de água e 10L de shampoo.
- Retirar um pet sujo obriga a limpar a máquina antes de usar novamente.
- A limpeza da máquina consome 3L de água e 1L de shampoo.
- Abastecimento feito de 2L por vez.

🐶 Estrutura do Projeto
📌 Classe Pet.java
📌 Classe PetMachine.java
📌 Classe Main.java


📌 Classe Pet.java
public class Pet {
    private String nome;
    private boolean limpo;

    public Pet(String nome) {
        this.nome = nome;
        this.limpo = false; // por padrão o pet entra sujo
    }

    public String getNome() {
        return nome;
    }

    public boolean isLimpo() {
        return limpo;
    }

    public void setLimpo(boolean limpo) {
        this.limpo = limpo;
    }
}

📌 Classe PetMachine.java
public class PetMachine {
    private int agua; // litros
    private int shampoo; // litros
    private Pet petNaMaquina;

    private final int CAPACIDADE_MAX_AGUA = 30;
    private final int CAPACIDADE_MAX_SHAMPOO = 10;

    public PetMachine() {
        this.agua = 0;
        this.shampoo = 0;
        this.petNaMaquina = null;
    }

    // Colocar pet na máquina
    public void colocarPet(Pet pet) {
        if (petNaMaquina != null) {
            System.out.println("Já existe um pet na máquina!");
        } else {
            petNaMaquina = pet;
            System.out.println(pet.getNome() + " foi colocado na máquina.");
        }
    }

    // Retirar pet da máquina
    public void retirarPet() {
        if (petNaMaquina == null) {
            System.out.println("Não há pet na máquina!");
            return;
        }
        if (!petNaMaquina.isLimpo()) {
            System.out.println("O pet " + petNaMaquina.getNome() + " foi retirado sujo. É necessário limpar a máquina!");
            limparMaquina();
        } else {
            System.out.println(petNaMaquina.getNome() + " foi retirado limpo!");
        }
        petNaMaquina = null;
    }

    // Dar banho
    public void darBanho() {
        if (petNaMaquina == null) {
            System.out.println("Não há pet na máquina!");
            return;
        }
        if (agua >= 10 && shampoo >= 2) {
            agua -= 10;
            shampoo -= 2;
            petNaMaquina.setLimpo(true);
            System.out.println("Banho realizado com sucesso no pet " + petNaMaquina.getNome());
        } else {
            System.out.println("Não há água ou shampoo suficiente para dar banho.");
        }
    }

    // Limpar máquina
    public void limparMaquina() {
        if (agua >= 3 && shampoo >= 1) {
            agua -= 3;
            shampoo -= 1;
            System.out.println("Máquina limpa com sucesso!");
        } else {
            System.out.println("Não há água ou shampoo suficiente para limpar a máquina!");
        }
    }

    // Abastecer água (2 litros por vez)
    public void abastecerAgua() {
        if (agua + 2 <= CAPACIDADE_MAX_AGUA) {
            agua += 2;
            System.out.println("Abasteceu 2L de água. Nível atual: " + agua + "L");
        } else {
            System.out.println("Não é possível abastecer mais água, tanque cheio!");
        }
    }

    // Abastecer shampoo (2 litros por vez)
    public void abastecerShampoo() {
        if (shampoo + 2 <= CAPACIDADE_MAX_SHAMPOO) {
            shampoo += 2;
            System.out.println("Abasteceu 2L de shampoo. Nível atual: " + shampoo + "L");
        } else {
            System.out.println("Não é possível abastecer mais shampoo, tanque cheio!");
        }
    }

    // Verificações
    public void verificarAgua() {
        System.out.println("Nível de água: " + agua + "L");
    }

    public void verificarShampoo() {
        System.out.println("Nível de shampoo: " + shampoo + "L");
    }

    public void verificarPet() {
        if (petNaMaquina == null) {
            System.out.println("Não há pet na máquina.");
        } else {
            System.out.println("O pet " + petNaMaquina.getNome() + " está na máquina. Limpo? " + petNaMaquina.isLimpo());
        }
    }
}

📌 Classe Main.java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PetMachine maquina = new PetMachine();

        int opcao;
        do {
            System.out.println("\n=== Menu Petshop ===");
            System.out.println("1 - Colocar pet na máquina");
            System.out.println("2 - Retirar pet da máquina");
            System.out.println("3 - Dar banho");
            System.out.println("4 - Abastecer água (+2L)");
            System.out.println("5 - Abastecer shampoo (+2L)");
            System.out.println("6 - Verificar nível de água");
            System.out.println("7 - Verificar nível de shampoo");
            System.out.println("8 - Verificar pet na máquina");
            System.out.println("9 - Limpar máquina");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1: System.out.print("Digite o nome do pet: ");
                        scanner.nextLine();
                        String nome = scanner.nextLine();
                        maquina.colocarPet(new Pet(nome));
                        break;
                case 2: maquina.retirarPet(); break;
                case 3: maquina.darBanho(); break;
                case 4: maquina.abastecerAgua(); break;
                case 5: maquina.abastecerShampoo(); break;
                case 6: maquina.verificarAgua(); break;
                case 7: maquina.verificarShampoo(); break;
                case 8: maquina.verificarPet(); break;
                case 9: maquina.limparMaquina(); break;
                case 0: System.out.println("Encerrando sistema..."); break;
                default: System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        scanner.close();
    }
}

📖 Fluxo do Sistema
1. Usuário pode abastecer água e shampoo.
2. Colocar um pet na máquina.
3. Dar banho (caso tenha insumos suficientes).
4. Retirar o pet:
- Se limpo → sai normalmente.
- Se sujo → obriga limpeza da máquina.
5. O sistema exibe níveis de água/shampoo a qualquer momento.

▶️ Exemplo de Execução

=== Menu Petshop ===
1 - Colocar pet na máquina
2 - Retirar pet da máquina
3 - Dar banho
4 - Abastecer água (+2L)
5 - Abastecer shampoo (+2L)
6 - Verificar nível de água
7 - Verificar nível de shampoo
8 - Verificar pet na máquina
9 - Limpar máquina
0 - Sair
Escolha: 1
Digite o nome do pet: Rex
Rex foi colocado na máquina.

Escolha: 4
Abasteceu 2L de água. Nível atual: 2L

📊 Diagrama UML – Sistema de Banho Petshop

classDiagram
    class Pet {
        - String nome
        - boolean limpo
        + Pet(String nome)
        + getNome(): String
        + isLimpo(): boolean
        + setLimpo(boolean limpo): void
    }

    class PetMachine {
        - int agua
        - int shampoo
        - Pet petNaMaquina
        - final int CAPACIDADE_MAX_AGUA
        - final int CAPACIDADE_MAX_SHAMPOO
        + PetMachine()
        + colocarPet(Pet pet): void
        + retirarPet(): void
        + darBanho(): void
        + limparMaquina(): void
        + abastecerAgua(): void
        + abastecerShampoo(): void
        + verificarAgua(): void
        + verificarShampoo(): void
        + verificarPet(): void
    }

    class Main {
        + main(String[] args): void
    }

    PetMachine --> Pet : "contém"
    Main --> PetMachine : "utiliza"
    Main --> Pet : "cria"

🔎 Explicação do Diagrama
1. Classe Pet → representa o pet, com atributos nome e limpo.
2. Classe PetMachine → controla toda a lógica da máquina de banho, insumos e estado do pet.
3. Classe Main → contém o menu de interação com o usuário, chamando os métodos da PetMachine.
4. Relações:
- PetMachine contém um Pet.
- Main utiliza PetMachine e cria Pets quando o usuário insere.


