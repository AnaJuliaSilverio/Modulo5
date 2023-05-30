package aula30.exercicio4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Tributos> contasComTributos = new ArrayList<>();

        contasComTributos.add(new ContaPoupanca("Carla","444.476.779-00","12!3",500));
        contasComTributos.add(new ContaCorrente("Ana","123.456.789-00","12!3",500));
        contasComTributos.add(new SeguroDeVida("João","987.456.123-88"));


        for (Tributos item:contasComTributos) {
            System.out.println(item.mostrarInfo());
            System.out.println();
        }

        for (Tributos item:contasComTributos) {
            System.out.println(item.calcularTributos());
            System.out.println();
        }
    }
}
