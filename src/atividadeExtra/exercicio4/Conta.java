package atividadeExtra.exercicio4;


public class Conta {
    private double saldo;
    private String nome;
    private String senha;
    private String cpf;
    private double limite;

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) throws ContaExececao {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque realizado: R$" + valor);
        } else {
            throw new ContaExececao(saldo);
        }
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double consultarSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "Saldo: " + saldo +
                "\nNome do proprietário: " + nome +
                "\nCPF:" + cpf;

    }
}

