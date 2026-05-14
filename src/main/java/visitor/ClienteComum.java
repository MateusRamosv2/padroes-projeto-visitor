package visitor;

public class ClienteComum implements Cliente {
    private String nome;
    private float salario;

    public ClienteComum(String nome, float salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() { return nome; }
    public float getSalario() { return salario; }

    @Override
    public String aceitar(Visitor visitor) {
        return visitor.calcularCreditoComum(this);
    }
}