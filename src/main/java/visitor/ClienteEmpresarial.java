package visitor;

public class ClienteEmpresarial implements Cliente {
    private String razaoSocial;
    private float faturamentoAnual;

    public ClienteEmpresarial(String razaoSocial, float faturamentoAnual) {
        this.razaoSocial = razaoSocial;
        this.faturamentoAnual = faturamentoAnual;
    }

    public String getRazaoSocial() { return razaoSocial; }
    public float getFaturamentoAnual() { return faturamentoAnual; }

    @Override
    public String aceitar(Visitor visitor) {
        return visitor.calcularCreditoEmpresarial(this);
    }
}