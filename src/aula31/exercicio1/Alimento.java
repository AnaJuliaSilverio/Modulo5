package aula31.exercicio1;

import java.util.ArrayList;
import java.util.List;

public class Alimento {
    private String tipoAlimento;
    private double valorDecimal;
    private int valorInteiro;
    private String nomeAlimento;
    List<Alimento> verduras = new ArrayList<>();
    List<Alimento> legumes = new ArrayList<>();
    List<Alimento> graos = new ArrayList<>();
    List<Alimento> outros = new ArrayList<>();

    public Alimento(String tipoAlimento, String nomeAlimento,double valorDecimal) {
        this.tipoAlimento = tipoAlimento;
        this.valorDecimal = valorDecimal;
        this.nomeAlimento = nomeAlimento;
    }

    public Alimento(String tipoAlimento,String nomeAlimento, int valorInteiro) {
        this.tipoAlimento = tipoAlimento;
        this.valorInteiro = valorInteiro;
        this.nomeAlimento = nomeAlimento;
    }

    public Alimento() {
    }

    public String getTipoAlimento() {
        return tipoAlimento;
    }

    public void setTipoAlimento(String tipoAlimento) {
        this.tipoAlimento = tipoAlimento;
    }

    public double getValorDecimal() {
        return valorDecimal;
    }

    public void setValorDecimal(double valorDecimal) {
        this.valorDecimal = valorDecimal;
    }

    public int getValorInteiro() {
        return valorInteiro;
    }

    public void setValorInteiro(int valorInteiro) {
        this.valorInteiro = valorInteiro;
    }

    public String getNomeAlimento() {
        return nomeAlimento;
    }

    public void setNomeAlimento(String nomeAlimento) {
        this.nomeAlimento = nomeAlimento;
    }

    public List<Alimento> getVerduras() {
        return verduras;
    }

    public List<Alimento> getLegumes() {
        return legumes;
    }

    public List<Alimento> getGraos() {
        return graos;
    }

    public List<Alimento> getOutros() {
        return outros;
    }

    public void setListaSeparada(List<Alimento> alimentos){

        for (Alimento alimento:alimentos) {
            if(alimento.getTipoAlimento().equalsIgnoreCase("verdura")){
                verduras.add(alimento);
            } else if (alimento.getTipoAlimento().equalsIgnoreCase("legume")){
                legumes.add(alimento);
            }else if (alimento.getTipoAlimento().equalsIgnoreCase("graos")){
                graos.add(alimento);
            } else if (alimento.getTipoAlimento().equalsIgnoreCase("outros")){
                outros.add(alimento);
            }
        }
    }
    public void mostrarInfoAlimentoDecimal(List<Alimento> alimentos){
        for (Alimento alimento:alimentos) {
            System.out.println("Tipo: "+alimento.getTipoAlimento());
            System.out.println("Nome: " + alimento.getNomeAlimento());
            System.out.println("Quantidade: " +alimento.getValorDecimal());
        }
    }
    public void mostrarInfoAlimentoInteiro(List<Alimento> alimentos){
        for (Alimento alimento:alimentos) {
            System.out.println("Tipo: "+alimento.getTipoAlimento());
            System.out.println("Nome: " + alimento.getNomeAlimento());
            System.out.println("Quantidade: " + alimento.getValorInteiro());
        }
    }
}
