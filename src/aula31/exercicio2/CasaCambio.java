package aula31.exercicio2;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Scanner;

import static java.lang.System.exit;

public class CasaCambio {

        private Scanner sc;
        private Conversao conversao = new Conversao();

    public CasaCambio() {
        sc = new Scanner(System.in);
    }
    public void trocarMoeda(){
        String moeda ="";
        BigDecimal valor = new BigDecimal(0);

        while (true){
            boolean continuar = true;

            do {
                try {
                    System.out.println("Digite o tipo de moeda: ");
                     moeda= sc.nextLine();
                    conversao.verificaTipoMoeda(moeda);
                    continuar = false;
                    System.out.println("É IMPORTANTE SABER QYE A CONVERSÃO SÓ ACONTENCE PARA REAL");
                }catch (IllegalArgumentException erro){
                    System.out.println(erro.getMessage());
                }
            }while (continuar);

            continuar = true;
            do {
                try {
                    System.out.println("Digite o valor a ser convertido: ");
                     valor = BigDecimal.valueOf(sc.nextDouble());
                     conversao.verificaValor(valor);
                    continuar = false;
                }catch (IllegalArgumentException erro){
                    System.out.println(erro.getMessage());
                }
            }while (continuar);
            exibiTransacao(moeda,valor);

            System.out.println("Deseja fazer outra conversao? 1-sim 2-nao");
            if (sc.nextInt() == 2) exit(0);

        }
    }
    public void exibiTransacao(String moeda,BigDecimal valor){
        System.out.println("A(O) "+moeda+" na cotacao atual de hoje "+ LocalDate.now()+ " está em "+conversao.getMoedas().get(moeda)+" o valor que voce pediu pra converter "+valor+" em reais é ");
        System.out.printf("R$%.2f\n",conversao.realizaConversao(valor));
    }
}

