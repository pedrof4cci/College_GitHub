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

    public void calcula_recebimento_por_hora_trabalhada(){
        float total_a_receber = 0;
        int hora_extra = 0;
        int convert_pra_hora = minutos_trabalhados / 60;

        if (convert_pra_hora > 160){
            hora_extra = convert_pra_hora - 160;
            total_a_receber = (float) ((valor_hora_trabalhada * 160) + (valor_hora_trabalhada * 1.5 * hora_extra ));
            System.out.println(total_a_receber);
        }else{
            total_a_receber = (float) (valor_hora_trabalhada*160);
            System.out.println(total_a_receber);
        }
    }




}
