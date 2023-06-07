package atividadeExtra.exercicio4;

public class ContaExececao extends Exception{
    protected double saldo;

    public ContaExececao(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Saldo insuficiente!O saldo atual é de R$"+saldo;
    }
}
