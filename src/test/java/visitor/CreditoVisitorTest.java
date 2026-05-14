package visitor;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CreditoVisitorTest {

    @Test
    void deveCalcularCreditoClienteComum() {
        ClienteComum cliente = new ClienteComum("Mateus", 2000.0f);
        CreditoVisitor visitor = new CreditoVisitor();


        assertEquals("Cliente Comum: Mateus | Limite Aprovado: R$ 3000.0", visitor.avaliar(cliente));
    }
}