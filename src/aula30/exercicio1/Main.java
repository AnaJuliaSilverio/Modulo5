package aula30.exercicio1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> listElementos = new ArrayList<>();
        listElementos.add(1);
        listElementos.add(5);
        listElementos.add(5);
        listElementos.add(6);
        listElementos.add(7);
        listElementos.add(8);
        listElementos.add(8);
        listElementos.add(8);

        for (Integer elementos:listElementos) {
            System.out.println(elementos);
        }
    }

}
