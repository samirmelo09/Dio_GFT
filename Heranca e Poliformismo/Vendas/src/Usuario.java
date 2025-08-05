public abstract class Usuario {
    private String nome;
    private String email;
    private String senha;
    protected boolean administrador;

    public Usuario(String nome, String email, String senha, boolean administrador) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.administrador = administrador;
    }

    // Getters e Setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public boolean isAdministrador() { return administrador; }

    // Métodos comuns
    public boolean realizarLogin(String email, String senha) {
        return this.email.equals(email) && this.senha.equals(senha);
    }

    public void realizarLogoff() {
        System.out.println(this.nome + " saiu do sistema.");
    }

    public void alterarDados(String novoNome, String novoEmail) {
        this.nome = novoNome;
        this.email = novoEmail;
    }

    public void alterarSenha(String novaSenha) {
        this.senha = novaSenha;
    }
}
