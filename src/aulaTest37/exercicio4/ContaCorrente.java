package aulaTest37.exercicio4;

import java.math.BigDecimal;

public class ContaCorrente {
    private int numeroDaConta;
    private String nome;
    private BigDecimal saldo;

    public ContaCorrente(int numeroDaConta, String nome) {
        this.numeroDaConta = numeroDaConta;
        this.nome = nome;
        this.saldo = new BigDecimal("0");
    }

    public ContaCorrente(int numeroDaConta, String nome, BigDecimal saldo) {
        this.numeroDaConta = numeroDaConta;
        this.nome = nome;
        this.saldo = saldo;
    }
    public void deposito(BigDecimal valorDepositado){
        this.saldo = this.saldo.add(valorDepositado);
    }
    public void sacar(BigDecimal valorSacado){
        if (valorSacado.compareTo(BigDecimal.ZERO)==0 || valorSacado.compareTo(BigDecimal.ZERO)<0) throw new IllegalArgumentException("O valor a ser sacado deve ser maior que 0");
        if (saldo.compareTo(new BigDecimal("5"))<=0){
            System.out.println("Não é possível sacar");
        }else {
            this.saldo = this.saldo.subtract(valorSacado);
            System.out.println("Saque realizado com sucesso");
        }
    }

    public BigDecimal getSaldo() {
        return saldo;
    }
}
