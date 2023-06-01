package exercicio2;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Conversao {

    HashMap<String,BigDecimal> moedas = new HashMap<>();
    private String tipo;

    public Conversao() {
        moedas.put("Dolar Americano",new BigDecimal("5.25"));
        moedas.put("Dolar Canadense",new BigDecimal("4.15"));
        moedas.put("Euro",new BigDecimal("6.15"));
        moedas.put("Libra",new BigDecimal("7.50"));
    }
    public void verificaTipoMoeda(String tipoMoeda){
        if (!moedas.containsKey(tipoMoeda)) throw new IllegalArgumentException("Tipo de moeda inválido.");
        this.tipo = tipoMoeda;
    }

    public void verificaValor(BigDecimal valor){

        if (valor==(null)) throw new NumberFormatException("Para moeda, o valor monetário deve ser um número decimal.");
        if (valor.compareTo(BigDecimal.ZERO)==0 ||valor.compareTo(BigDecimal.ZERO)<0) {
            throw new IllegalArgumentException("Valor inválido, por favor, tente novamente");
        }
    }

    public BigDecimal realizaConversao(BigDecimal valor){
         return moedas.get(tipo).multiply(valor);
    }

    public HashMap<String, BigDecimal> getMoedas() {
        return moedas;
    }
}
