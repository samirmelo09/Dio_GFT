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

