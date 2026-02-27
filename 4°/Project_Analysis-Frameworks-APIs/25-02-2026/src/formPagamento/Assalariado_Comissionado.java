package formPagamento;


public class Assalariado_Comissionado extends Funcionario {
    private float salario_mensal;
    private float percentual_comissao;
    private float total_vendas;

    public Assalariado_Comissionado(
            String CPF,
            String Nome,
            int Telefone,
            String Email,
            float salario_mensal,
            float percentual_comissao,
            float total_vendas) {

        super(CPF, Nome, Telefone, Email);

        this.salario_mensal=salario_mensal;
        this.percentual_comissao=percentual_comissao;
        this.total_vendas=total_vendas;
    }

    @Override
    public void exibirDetalhes(){
        System.out.println("Nome: " + getNome() + "| CPF: " + getCPF() + " | Salário calculado: " + calcula_receber_mensal_comissionado());
    }

    public float calcula_receber_mensal_comissionado(){
        return  (total_vendas / percentual_comissao) + salario_mensal;
    }




}
