package pagamento;

public abstract class Funcionario {
    protected String nome;
    public Funcionario(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public abstract double calcularSalario();

    public String contraCheque() {
        return "Funcionário: " + nome + "\nSalário: R$ " + calcularSalario();
    }



}
