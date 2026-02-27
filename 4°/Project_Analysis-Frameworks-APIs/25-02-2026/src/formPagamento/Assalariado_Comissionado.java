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

    public void calcula_receber_mensal_comissionado(){
        float total_receber=0;
        total_receber = (total_vendas / percentual_comissao) + salario_mensal;
        System.out.println(total_receber);
    }



}
