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
