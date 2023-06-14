package aulaTest37.exercicio4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class ContaCorrenteTest {

    @Test
    @DisplayName("Deve manter o mesmo valor do saldo caso o saldo for menor que 5 reais")
    void checaSaqueComSaldoMenorQue5(){
        ContaCorrente contaCorrente = new ContaCorrente(123,"Ana",new BigDecimal("5"));
        contaCorrente.sacar(new BigDecimal("15"));
        Assertions.assertEquals(new BigDecimal("5"),contaCorrente.getSaldo());
    }
    @Test
    @DisplayName("Deve diminuir o valor correspondente ao numero a ser sacado do saldo atual")
    void checaSaqueComSaldoMaiorQue5(){
        ContaCorrente contaCorrente = new ContaCorrente(123,"Ana",new BigDecimal("100"));
        contaCorrente.sacar(new BigDecimal("15"));
        Assertions.assertEquals(new BigDecimal("85"),contaCorrente.getSaldo());
    }

    @Test
    @DisplayName("Deve lançar uma exeção para valores que sejam menores ou igual a 0")
    void checaSaqueComSaldoMenor0(){
        ContaCorrente contaCorrente = new ContaCorrente(123,"Ana",new BigDecimal("100"));
        Assertions.assertThrows(IllegalArgumentException.class,()->contaCorrente.sacar(new BigDecimal("0")));
    }

}
