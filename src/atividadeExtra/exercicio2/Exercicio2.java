package atividadeExtra.exercicio2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Eu sei dividir!");
        while (true){
            try {
                System.out.println("Informe o primeiro valor: ");
                int x = teclado.nextInt();
                System.out.println("Informe o segundo valor: ");
                int y = teclado.nextInt();
                double r=(double)x/y;
                if (Double.isInfinite(r)) throw new ArithmeticException("A divisão não pode ser feita por zero");
                System.out.println("O resultado da divisão é "+r);
                break;
            }catch (ArithmeticException erro){
                System.out.println(erro.getMessage());
                teclado.nextLine();
            }catch (InputMismatchException erro){
                System.out.println("O valor digitado deve ser um número inteiro");
                teclado.nextLine();
            }
        }
    }
}
