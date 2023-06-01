package aula31.exercicio1;

import java.awt.geom.Arc2D;
import java.util.*;

public class Menu {
    private List<Alimento> carrinho;
    private Alimento alimento = new Alimento();

    private Scanner sc;
    private HashMap<String,String> opcoesTipoMenu;

    private String tipo;

    public Menu() {
        carrinho = new ArrayList<>();
        sc= new Scanner(System.in);
        opcoesTipoMenu = new HashMap<>();
        opcoesTipoMenu.put("1","Verdura");
        opcoesTipoMenu.put("2","Legume");
        opcoesTipoMenu.put("3","Graos");
        opcoesTipoMenu.put("4","Outros");
    }

    public void getOpcoesTipoMenu() {
        for (String chaveTipo:opcoesTipoMenu.keySet()) {
            System.out.println(chaveTipo+"-"+opcoesTipoMenu.get(chaveTipo));
        }
    }

    public void adicionar(String tipo,String nome,int quantidade){
        carrinho.add(new Alimento(tipo,nome,quantidade));

    }
    public void adicionar(String tipo,String nome,double grama){
        carrinho.add(new Alimento(tipo,nome,grama));
    }

    //regra de negocio
    public String verificaTipo(String tipo) {
        if (!(opcoesTipoMenu.containsValue(tipo) || opcoesTipoMenu.containsKey(tipo))) {
            throw new IllegalArgumentException("Tipo de alimento invalido");
        } else {
            if (opcoesTipoMenu.containsValue(tipo)) {
                this.tipo = tipo;
            } else if (opcoesTipoMenu.containsKey(tipo)) {
                this.tipo = opcoesTipoMenu.get(tipo);
            }
            return this.tipo;
        }
    }
    public void verificaNome(String nome){
        if (nome.equals("")) throw new  UnsupportedOperationException("Não é permitido valor vazio");
    }

    public int verificaQuantidadeInt(String quantidade){

        if (quantidade.contains(".")||!quantidade.matches("[0-9]+")){
            throw new NumberFormatException("Para "+tipo+" ,a quantidade deve ser informada em unidades inteiras");
        }
        return Integer.parseInt(quantidade);
    }
    public double verificaQuantidade(String quantidade) {
        if (!quantidade.contains(".")){
            throw new NumberFormatException("Para " + tipo + " ,a quantidade deve ser informada com ponto");
        }
        return Double.parseDouble(quantidade);

    }

    public void mostrarCarrinho() {
       alimento.getListaSeparada(carrinho);
        System.out.println("-----------VERDURA-------------");
        for (Alimento alimento : alimento.getVerduras()) {
                System.out.println("Tipo: "+alimento.getTipoAlimento());
                System.out.println("Nome: " + alimento.getNomeAlimento());
                System.out.println("Quantidade: " + alimento.getValorDecimal());
        }
        System.out.println("-----------LEGUMES-------------");
        for (Alimento alimento : alimento.getLegumes()){
                System.out.println("Tipo: "+alimento.getTipoAlimento());
                System.out.println("Nome: " + alimento.getNomeAlimento());
                System.out.println("Quantidade: " + alimento.getValorInteiro());
            }
        System.out.println("-----------GRÃOS-------------");
        for (Alimento alimento : alimento.getGraos()){
                System.out.println("Tipo: "+alimento.getTipoAlimento());
                System.out.println("Nome: " + alimento.getNomeAlimento());
                System.out.println("Quantidade: " + alimento.getValorDecimal());
            }
        System.out.println("-----------OUTROS-------------");
        for (Alimento alimento : alimento.getOutros()){
                System.out.println("Tipo: "+alimento.getTipoAlimento());
                System.out.println("Nome: " + alimento.getNomeAlimento());
                System.out.println("Quantidade: " + alimento.getValorInteiro());
            }
        System.out.println();
        System.out.println("Quantidade de verduras: "+alimento.getVerduras().size());
        System.out.println("Quantidade de legumes: "+alimento.getLegumes().size());
        System.out.println("Quantidade de grãos: "+alimento.getGraos().size());
        System.out.println("Quantidade de outros: "+alimento.getOutros().size());
        }
    }


