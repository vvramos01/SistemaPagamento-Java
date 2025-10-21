package pagamento;

public class comissionado extends Funcionario{
    private double base;
    private double taxaComissao;
    private double totalVendas;

    comissionado(String nome, double base, double taxaComissao, double totalVendas) {
        super(nome);
        this.base = base;
        this.taxaComissao = taxaComissao;
        this.totalVendas = totalVendas;
    }
    
    @Override
    public double calcularSalario(){
        return base + (taxaComissao * totalVendas);
    }
}
