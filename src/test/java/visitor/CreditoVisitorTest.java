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

    @Test
    void deveCalcularCreditoClientePremium() {
        ClientePremium cliente = new ClientePremium("Ana", 5000.0f, 10000.0f);
        CreditoVisitor visitor = new CreditoVisitor();


        assertEquals("Cliente Premium: Ana | Limite Aprovado: R$ 17000.0", visitor.avaliar(cliente));
    }

    @Test
    void deveCalcularCreditoClienteEmpresarial() {
        ClienteEmpresarial cliente = new ClienteEmpresarial("Tech Solutions Ltda", 500000.0f);
        CreditoVisitor visitor = new CreditoVisitor();


        assertEquals("Cliente Empresarial: Tech Solutions Ltda | Limite Aprovado: R$ 50000.0", visitor.avaliar(cliente));
    }
}