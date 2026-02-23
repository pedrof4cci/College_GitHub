package model;

public class Login {
    public String nome;
    public String email;
    public String senha;
    public boolean ativo;
    public String dataCadastro;
    public String dataAtualizacao;

    public Login() {
    }

    public Login(String nome, String email, String senha, String dataCadastro, String dataAtualizacao) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.ativo = true;
        this.dataCadastro = dataCadastro;
        this.dataAtualizacao = dataAtualizacao;
    }

    @Override
    public String toString() {
        return "Login{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", senha='" + senha + '\'' +
                ", ativo=" + ativo +
                ", dataCadastro='" + dataCadastro + '\'' +
                ", dataAtualizacao='" + dataAtualizacao + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public String getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String getDataAtualizacao() {
        return dataAtualizacao;
    }

    public void setDataAtualizacao(String dataAtualizacao) {
        this.dataAtualizacao = dataAtualizacao;
    }
}
