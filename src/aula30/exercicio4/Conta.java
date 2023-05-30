package aula30.exercicio4;

import java.util.Random;

public abstract class Conta {
    protected double saldo;
    protected String nome;
    protected String senha;
    protected String cpf;
    protected int numeroDaConta;


    public Conta(String nome,String cpf,String senha) {
        this.cpf =cpf;
        this.senha = senha;
        this.saldo = 0;
        this.nome = nome;
        this.numeroDaConta = geraNumeroConta();
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito realizado: R$" + valor);
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque realizado: R$" + valor);
        } else {
            System.out.println("Saldo insuficiente");
        }
    }
    public double consultarSaldo() {
        return saldo;
    }
    public static int geraNumeroConta(){
        Random geradorDoDado = new Random();
        return geradorDoDado.nextInt(1900)+1900;
    }

    @Override
    public String toString() {
        return "Saldo: " + saldo +
                "\nNome do proprietário: " + nome +
                "\nCPF:" + cpf +
                "\nNumero Da Conta: " + numeroDaConta;

    }
}