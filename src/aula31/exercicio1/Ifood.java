package aula31.exercicio1;

import java.util.Scanner;

public class Ifood {
    static final String nomeEmpresa = "Ifood";
    static final String cnpj = "14.380.200/0001-21.";
    private Menu menu;
    private Scanner sc;

    public Ifood() {
        menu = new Menu();
        sc = new Scanner(System.in);
    }
    public void comprar(){
        System.out.println("Qual seu nome? ");
        String nomeUsuario = sc.nextLine();
        System.out.println("Bem-vindo(a) ao "+nomeEmpresa+" "+nomeUsuario);
        String tipo="";
        String nome = "";


        while (true){
            boolean continuar = true;
            do {
                try {
                    System.out.println("Qual tipo de alimento deseja adicionar? ");
                    menu.getOpcoesTipoMenu();
                    tipo = menu.verificaTipo(sc.next());
                    System.out.println();
                    continuar = false;
                }catch (IllegalArgumentException erro){
                    System.out.println(erro.getMessage());
                }
            }while (continuar);

            continuar = true;

            do {
                try {
                    System.out.println("Qual o nome do alimento, " + nomeUsuario + "?");
                    nome = sc.next();
                    menu.verificaNome(nome);
                    System.out.println();
                    continuar = false;
                }catch (UnsupportedOperationException erro){
                    System.out.println(erro.getMessage());
                }
            }while (continuar);

            continuar = true;

            do {
                try {
                    String valorQTD;
                    if (tipo.equalsIgnoreCase("verdura") || tipo.equalsIgnoreCase("graos")) {
                        System.out.println("Quantas gramas de " + nome + " deseja adicionar? ");
                        valorQTD = sc.next();
                        double gramas = menu.verificaQuantidade(valorQTD);
                        System.out.println();
                        menu.adicionar(tipo, nome, gramas);
                    } else if (tipo.equalsIgnoreCase("Outros") || tipo.equalsIgnoreCase("Legume")){
                        System.out.println("Qual a quantidade de " + nome + " deseja adicionar? ");
                        valorQTD = sc.next();
                        int quantidade = menu.verificaQuantidadeInt(valorQTD);
                        System.out.println();
                        menu.adicionar(tipo, nome, quantidade);
                    }
                    continuar = false;
                } catch (NumberFormatException erroValor){
                    System.out.println(erroValor.getMessage());
                }
            }while (continuar);
            System.out.println("Deseja adicionar mais um item? 1-sim 2-nao");
            if (sc.nextInt()==2) break;
        }
        menu.mostrarCarrinho();
    }

}
