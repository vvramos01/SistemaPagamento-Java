package pagamento;

public class Mensalista extends Funcionario {
    private double salarioMensal;
    
    public Mensalista(String nome, double salarioMensal) {
        super(nome);
        this.salarioMensal = salarioMensal;
    }

    @Override
    public double calcularSalario() {
        return salarioMensal;
    }
}
