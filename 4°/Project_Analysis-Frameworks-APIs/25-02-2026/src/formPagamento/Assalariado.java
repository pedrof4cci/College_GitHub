package formPagamento;


public class Assalariado extends Funcionario{
    private float salario_fixo_mensal;

    public Assalariado(
            String CPF,
            String Nome,
            int Telefone,
            String Email,
            float salario_fixo_mensal
    ) {
        super(CPF, Nome, Telefone, Email);

        this.salario_fixo_mensal=salario_fixo_mensal;
    }

    public float mostra_valor_receber_mensal(){
        return salario_fixo_mensal;
    }

    @Override
    public void exibirDetalhes(){
        System.out.println("Nome: " + getNome() + "| CPF: " + getCPF() + " | Salário calculado: " + salario_fixo_mensal);
    }

}
