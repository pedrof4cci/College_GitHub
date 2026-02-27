package formPagamento;

public class Comissionado extends Funcionario{
    private float percentual_comissao;
    private int total_vendas_mensal;

    public Comissionado(
            String CPF,
            String Nome,
            int Telefone,
            String Email,
            float percentual_comissao,
            int total_vendas_mensal
    ) {
        super(CPF, Nome, Telefone, Email);

        this.percentual_comissao=percentual_comissao;
        this.total_vendas_mensal=total_vendas_mensal;
    }


}
