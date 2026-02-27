package formPagamento;

public abstract class Funcionario {
    private String CPF;
    private String Nome;
    private int Telefone;
    private String Email;

    public Funcionario(String CPF, String Nome, int Telefone, String Email){
        this.CPF=CPF;
        this.Nome=Nome;
        this.Telefone=Telefone;
        this.Email=Email;
    }

    public abstract void exibirDetalhes();


    public String getCPF() {
        return CPF;
    }

    public String getNome() {
        return Nome;
    }


}
