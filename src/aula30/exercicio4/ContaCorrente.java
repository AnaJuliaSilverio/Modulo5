package aula30.exercicio4;

public class ContaCorrente extends Conta implements Tributos{
    double limiteChequeEspecial;

    public ContaCorrente(String nome, String cpf, String senha,double saldo) {
        super(nome, cpf, senha);
        this.saldo = saldo;
        limiteChequeEspecial = 1000;
    }

    @Override
    public double calcularTributos() {
        return (0.01*saldo);
    }

    @Override
    public String mostrarInfo() {
        return "Tipo da Conta: Corrente\n"+super.toString()+"Cheque especial: "+limiteChequeEspecial+"\nTributos: "+calcularTributos();
    }

    public void aumentarChequeEspecial(double valor){
        limiteChequeEspecial+=valor;
    }


}