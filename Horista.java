package pagamento;

public class Horista extends Funcionario{
    private double valorHora;
    private int horasTrabalhadas;
    
    public Horista(String nome, int horasTrabalhadas, double valorHora) {
        super(nome);
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora; 
        
    }
    
    @Override
    public double calcularSalario() {
        return horasTrabalhadas * valorHora;}

    
}
