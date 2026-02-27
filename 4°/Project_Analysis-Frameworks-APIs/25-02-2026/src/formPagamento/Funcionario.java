package formPagamento;

public class Funcionario {
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


    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public int getTelefone() {
        return Telefone;
    }

    public void setTelefone(int telefone) {
        Telefone = telefone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }
}
