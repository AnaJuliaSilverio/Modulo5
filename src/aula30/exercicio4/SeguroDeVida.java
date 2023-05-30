package aula30.exercicio4;

import java.util.Random;

public class SeguroDeVida implements Tributos{
    private String nome;
    private String cpf;
    private int numeroDeId;

    public SeguroDeVida(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.numeroDeId = geraNumeroId();
    }
    @Override
    public double calcularTributos() {
        return 42;
    }

    @Override
    public String mostrarInfo() {
        return "Tipo: Seguro De Vida: " +
                "\nNome Beneficiario: " + nome +
                "\nCPF: " + cpf +
                "\nNumero De Identificao=" + numeroDeId;
    }

    public static int geraNumeroId(){
        Random geradorDoDado = new Random();
        return geradorDoDado.nextInt(1900)+1900;
    }



}
