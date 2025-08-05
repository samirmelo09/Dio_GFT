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
