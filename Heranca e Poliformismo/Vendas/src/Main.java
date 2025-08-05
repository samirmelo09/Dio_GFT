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
