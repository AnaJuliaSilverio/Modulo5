package aula30.exercicio4;

import java.time.LocalDate;

public class ContaPoupanca extends Conta implements Tributos{
    private double taxaJuros;
    private LocalDate dataCriacao;


    public ContaPoupanca(String nome, String cpf, String senha,double saldo) {
        super(nome, cpf, senha);
        taxaJuros = 0.5;
        dataCriacao = LocalDate.of(2021,3,15);
        this.saldo = saldo;

    }

    public double recolherJuros(){
        LocalDate dataAtual = LocalDate.now();
        int mesAtual = dataAtual.getDayOfMonth();
        int mesDataCriacao = dataCriacao.getDayOfMonth();
        return (mesAtual-mesDataCriacao)*taxaJuros;
    }

    public double consultarSaldo() {
        return saldo+taxaJuros;
    }


    @Override
    public double calcularTributos() {
        return 0;
    }

    @Override
    public String mostrarInfo() {
        return "Tipo da Conta: Poupança\n"+super.toString()+"Saldo com Juros aplicados: "+consultarSaldo();
    }
}
