package visitor;

public class CreditoVisitor implements Visitor {


    public String avaliar(Cliente cliente) {
        return cliente.aceitar(this);
    }

    @Override
    public String calcularCreditoComum(ClienteComum cliente) {
        float limite = cliente.getSalario() * 1.5f;
        return "Cliente Comum: " + cliente.getNome() + " | Limite Aprovado: R$ " + limite;
    }

    @Override
    public String calcularCreditoPremium(ClientePremium cliente) {
        float limite = (cliente.getSalario() * 3.0f) + (cliente.getInvestimentos() * 0.2f);
        return "Cliente Premium: " + cliente.getNome() + " | Limite Aprovado: R$ " + limite;
    }

    @Override
    public String calcularCreditoEmpresarial(ClienteEmpresarial cliente) {
        float limite = cliente.getFaturamentoAnual() * 0.1f;
        return "Cliente Empresarial: " + cliente.getRazaoSocial() + " | Limite Aprovado: R$ " + limite;
    }
}