package aula31.exercicio1;

import java.util.Scanner;

public class Ifood {
    static final String nomeEmpresa = "Ifood";
    static final String cnpj = "14.380.200/0001-21.";
    private Menu menu;
    private Scanner sc;
    private Alimento alimento;
    private String nomeUsuario;
    private boolean continuar;


    public Ifood() {
        menu = new Menu();
        sc = new Scanner(System.in);

    }
    public void setContinuar(){
       this.continuar = true;
    }
    public void comprar(){
        System.out.println("Qual seu nome? ");
        nomeUsuario = sc.nextLine();
        System.out.println("Bem-vindo(a) ao "+nomeEmpresa+" "+nomeUsuario);
        String tipo="";
        String nome = "";

        while (true){
            alimento = new Alimento();
           setContinuar();

            do {
                addTipoAlimento();
            }while (continuar);
           setContinuar();

            do {
                addNomeAlimento();
            }while (continuar);
            setContinuar();

            do {
                if (alimento.getTipoAlimento().equalsIgnoreCase("verdura") || alimento.getTipoAlimento().equalsIgnoreCase("graos")) {
                    addGramaAlimento();
                } else if (alimento.getTipoAlimento().equalsIgnoreCase("Outros") || alimento.getTipoAlimento().equalsIgnoreCase("Legume")){
                    addQtdAlimento();
                }
            }while (continuar);
            menu.adicionar(alimento);
            System.out.println("Deseja adicionar mais um item? 1-sim 2-nao");
            if (sc.nextInt()==2) break;
        }
        menu.mostrarCarrinho();
    }

    public void addTipoAlimento(){
        try {
            System.out.println("Qual tipo de alimento deseja adicionar? ");
            menu.getOpcoesTipoMenu();
            alimento.setTipoAlimento(menu.verificaTipo(sc.next()));
            System.out.println();
            continuar = false;

        }catch (IllegalArgumentException erro){
            System.out.println(erro.getMessage());
        }

    }
    public void addNomeAlimento(){
        try {
            System.out.println("Qual o nome do alimento, " +nomeUsuario + "?");
            alimento.setNomeAlimento(sc.next());
            menu.verificaNome(alimento.getNomeAlimento());
            System.out.println();
            continuar = false;
        }catch (UnsupportedOperationException erro){
            System.out.println(erro.getMessage());
        }
    }
    public void addGramaAlimento(){
        try {
            System.out.println("Quantas gramas de " + alimento.getNomeAlimento() + " deseja adicionar? ");
            String valorQTD = sc.next();
            alimento.setValorDecimal(menu.verificaQuantidade(valorQTD));
            System.out.println();
            continuar = false;
        }catch (NumberFormatException erroValor){
            System.out.println(erroValor.getMessage());
        }

    }
    public void addQtdAlimento(){
        try {
            System.out.println("Qual a quantidade de " + alimento.getNomeAlimento() + " deseja adicionar? ");
           String valorQTD = sc.next();
            alimento.setValorInteiro(menu.verificaQuantidadeInt(valorQTD));
            System.out.println();
            continuar = false;
        } catch (NumberFormatException erroValor){
            System.out.println(erroValor.getMessage());
        }
    }
}
