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
            System.out.println("O pet " + petNaMaquina.getNome() + " foi retirado. É necessário limpar a máquina!");
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

    // Abastecer água (5 litros por vez)
    public void abastecerAgua() {
        if (agua + 5 <= CAPACIDADE_MAX_AGUA) {
            agua += 5;
            System.out.println("Abasteceu 5L de água. Nível atual: " + agua + "L");
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
