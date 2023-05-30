package aula30.exercicio3;

import java.util.HashMap;
import java.util.List;


public class Objetos {
    private String nomeObjeto;
    private String corObjeto;
    private HashMap<String,String> objetosCores;
    public Objetos(){
        objetosCores = new HashMap<>();
    }


    public void inserirElemento(String nomeObjeto, String corObjeto){
        objetosCores.put(nomeObjeto,corObjeto);
    }
    public void imprimirElementos(){
        for (String tipoobj: objetosCores.keySet()) {
            System.out.println("Tipo Objeto:"+tipoobj+ " Cor: "+objetosCores.get(tipoobj));
        }
    }
    public HashMap<String,String> getListaObjetos(){
        return objetosCores;
    }
}
