package aulaTest37.exercicio3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class EhParTest {
    @Test
    @DisplayName("Deveria retornar verdadeiro quando o valor for par")
    void ehPar(){
        EhPar ehPar = new EhPar();
        Assertions.assertTrue(ehPar.verificaNumero(4));
    }
}
