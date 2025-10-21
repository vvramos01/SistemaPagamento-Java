package pagamento;

public class AppPagamento {
    public static void main(String[] args) {
        Funcionario f = new Mensalista("Ana", 5000);
        Funcionario h = new Horista ("Bruno", 160, 40);
        Funcionario c = new comissionado ("Cris", 3000, 0.015, 100000);

        System.out.println(f.contraCheque());
        System.out.println(h.contraCheque());
        System.out.println(c.contraCheque());
    }
}
