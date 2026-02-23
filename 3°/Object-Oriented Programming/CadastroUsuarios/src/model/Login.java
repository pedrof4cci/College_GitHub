package model;

public class Login {
    public int id;
    public String nome;
    public String email;
    public String senha;
    public boolean ativo;
    public String dataCadastro;
    public String dataAtualizacao;

    public Login(String pedro, String mail, String senhaSecreta123, String date) {
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
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", senha='" + senha + '\'' +
                ", ativo=" + ativo +
                ", dataCadastro='" + dataCadastro + '\'' +
                ", dataAtualizacao='" + dataAtualizacao + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
