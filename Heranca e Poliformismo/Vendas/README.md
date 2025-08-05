🏢 Sistema de Usuários – Gerente, Vendedor e Atendente

🎯 Objetivo do Projeto
Este projeto tem como objetivo demonstrar a aplicação de Herança, Abstração e Encapsulamento em Java.
Ele simula um sistema de controle de usuários de uma empresa, com diferentes papéis (Gerente, Vendedor e Atendente), cada um com funções específicas.

📚 Conceitos Envolvidos
- lasse Abstrata (Usuario) → Define a base para todos os tipos de usuários.
- Herança → As classes Gerente, Vendedor e Atendente herdam de Usuario.
-Encapsulamento → Os atributos são privados/protegidos e acessados via métodos get e set.
- Polimorfismo → Apesar de diferentes funções, todos os objetos compartilham comportamentos comuns (login, logoff, alterarDados).
- Especialização → Cada classe filha tem comportamentos próprios:
   - Gerente → relatórios e consulta de vendas.
   - Vendedor → registrar e consultar vendas.
   - Atendente → controlar o caixa.

📜 Código:

📌 Classe Usuario.java

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


📌 Classe Atendente.java

public class Atendente extends Usuario {
    private double valorCaixa;

    public Atendente(String nome, String email, String senha) {
        super(nome, email, senha, false); // administrador sempre false
        this.valorCaixa = 0.0;
    }

    public void receberPagamento(double valor) {
        this.valorCaixa += valor;
        System.out.println("Pagamento de R$" + valor + " recebido. Total em caixa: R$" + valorCaixa);
    }

    public void fecharCaixa() {
        System.out.println("Caixa fechado. Valor final: R$" + valorCaixa);
        this.valorCaixa = 0.0;
    }

    public double getValorCaixa() {
        return valorCaixa;
    }
}


📌 Classe Gerente.java

public class Gerente extends Usuario {

    public Gerente(String nome, String email, String senha) {
        super(nome, email, senha, true); // administrador sempre true
    }

    public void gerarRelatorioFinanceiro() {
        System.out.println("Relatório financeiro gerado pelo gerente " + getNome());
    }

    public void consultarVendas() {
        System.out.println("Consultando vendas...");
    }
}


📌 Classe Vendedor.java
public class Vendedor extends Usuario {
    private int quantidadeVendas;

    public Vendedor(String nome, String email, String senha) {
        super(nome, email, senha, false); // administrador sempre false
        this.quantidadeVendas = 0;
    }

    public void realizarVenda() {
        this.quantidadeVendas++;
        System.out.println("Venda realizada! Total de vendas: " + quantidadeVendas);
    }

    public void consultarVendas() {
        System.out.println("Total de vendas: " + quantidadeVendas);
    }

    public int getQuantidadeVendas() {
        return quantidadeVendas;
    }
}

📌 Classe Main.java
public class Main {
    public static void main(String[] args) {
        Gerente g = new Gerente("Carlos", "carlos@empresa.com", "1234");
        Vendedor v = new Vendedor("Ana", "ana@empresa.com", "1234");
        Atendente a = new Atendente("João", "joao@empresa.com", "1234");

        // Testando o gerente
        if (g.realizarLogin("carlos@empresa.com", "1234")) {
            g.gerarRelatorioFinanceiro();
            g.consultarVendas();
            g.realizarLogoff();
        }

        // Testando o vendedor
        if (v.realizarLogin("ana@empresa.com", "1234")) {
            v.realizarVenda();
            v.realizarVenda();
            v.consultarVendas();
            v.realizarLogoff();
        }

        // Testando o atendente
        if (a.realizarLogin("joao@empresa.com", "1234")) {
            a.receberPagamento(100.0);
            a.receberPagamento(50.5);
            a.fecharCaixa();
            a.realizarLogoff();
        }
    }
}



📖 Explicação Resumida
- Usuario (classe abstrata) → Base para todos os usuários, com login, logoff, alteração de dados e senha.
- Gerente → Pode gerar relatórios financeiros e consultar vendas.
- Vendedor → Registra vendas e pode consultar o total de vendas.
- Atendente → Controla o caixa, recebendo pagamentos e fechando o caixa.
- Main → Simula o funcionamento, criando instâncias e testando cada papel no sistema.

▶️ Exemplo de Saída
Relatório financeiro gerado pelo gerente Carlos
Consultando vendas...
Carlos saiu do sistema.

Venda realizada! Total de vendas: 1
Venda realizada! Total de vendas: 2
Total de vendas: 2
Ana saiu do sistema.

Pagamento de R$100.0 recebido. Total em caixa: R$100.0
Pagamento de R$50.5 recebido. Total em caixa: R$150.5
Caixa fechado. Valor final: R$150.5
João saiu do sistema.







