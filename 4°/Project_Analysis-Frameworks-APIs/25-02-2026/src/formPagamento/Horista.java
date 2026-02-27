package formPagamento;

public class Horista extends Funcionario{
    private float valor_hora_trabalhada;
    private int minutos_trabalhados;

    public Horista(
            String CPF,
            String Nome,
            int Telefone,
            String Email,
            float valor_hora_trabalhada,
            int minutos_trabalhados
    ){
        super(CPF, Nome, Telefone, Email);

        this.valor_hora_trabalhada=valor_hora_trabalhada;
        this.minutos_trabalhados=minutos_trabalhados;
    }

    public float calcula_recebimento_por_hora_trabalhada(){
        int convert_pra_hora = minutos_trabalhados / 60;

        if (convert_pra_hora > 160){
            int hora_extra = convert_pra_hora - 160;
            return (float) ((valor_hora_trabalhada * 160) + (valor_hora_trabalhada * 1.5 * hora_extra));
        }else{
            return valor_hora_trabalhada*160;
        }
    }

    @Override
    public void exibirDetalhes(){
        System.out.println("Nome: " + getNome() + "| CPF: " + getCPF() + " | Salário calculado: " + calcula_recebimento_por_hora_trabalhada());
    }



}
