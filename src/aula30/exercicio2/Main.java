package aula30.exercicio2;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> elementos = new HashSet<>();

        elementos.add(1);
        elementos.add(5);
        elementos.add(5);
        elementos.add(6);
        elementos.add(7);
        elementos.add(8);
        elementos.add(8);
        elementos.add(8);

        for (Integer item:elementos)
        {
            System.out.println(item);
        }
    }
}
/*A diferença desse exercicio com o anterior é que nesse mesmo tentado adicionar
valores repetido isso não é repetido devido ao uso do Set
 */