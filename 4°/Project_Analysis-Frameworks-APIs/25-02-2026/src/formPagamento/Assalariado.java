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


    public float getSalario_fixo_mensal() {
        return salario_fixo_mensal;
    }

    public void setSalario_fixo_mensal(float salario_fixo_mensal) {
        this.salario_fixo_mensal = salario_fixo_mensal;
    }
}
