package padroescomportamentais.visitor;

public interface Visitor {
    String calcularCreditoComum(ClienteComum cliente);
    String calcularCreditoPremium(ClientePremium cliente);
    String calcularCreditoEmpresarial(ClienteEmpresarial cliente);
}