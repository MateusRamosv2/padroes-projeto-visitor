package visitor;

public class ClientePremium implements Cliente {
    private String nome;
    private float salario;
    private float investimentos;

    public ClientePremium(String nome, float salario, float investimentos) {
        this.nome = nome;
        this.salario = salario;
        this.investimentos = investimentos;
    }

    public String getNome() { return nome; }
    public float getSalario() { return salario; }
    public float getInvestimentos() { return investimentos; }

    @Override
    public String aceitar(Visitor visitor) {
        return visitor.calcularCreditoPremium(this);
    }
}