public class Funcionario extends Pessoa {
    private String matricula;
    private String setor;
    private double salarioBase;

    public Funcionario (String matricula, String setor, double salarioBase, String nome, String email, String CPF){
        super(nome, email, CPF);
        this.matricula = matricula;
        this.setor = setor;
        this.salarioBase = salarioBase;
    }


    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
}
