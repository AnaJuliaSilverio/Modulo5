package aulaTest37.exercicio2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class DiaDaSemanaTest {
    @Test
    @DisplayName("Deve retornar que domingo é o melhor dia da semana")
    public void melhorDiaPraIrFeira(){
        DiaDaSemana diaDaSemana = new DiaDaSemana();
        Assertions.assertEquals("Domingo.Melhor dia de ir na feira!",diaDaSemana.diaSemana(21));
    }
}
