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