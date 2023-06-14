package aulaTest37.exercicio1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ProdutosTest {
    @Test
    @DisplayName("Deve retornar o preço de menor valor entre os produtos")
    void vendeProdutoMaisBarato(){
        Produtos produtos = new Produtos();
        Assertions.assertEquals(10,produtos.vender());
    }
}
