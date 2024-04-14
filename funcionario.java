package enti;

public class funcionario {
    private String nome;
    private int id;
    private double salario;

    public funcionario(String nome, int id, double salario) {
        this.nome = nome;
        this.id = id;
        this.salario = salario;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    public void alteraSalario(double porscentage) {
        this.salario = salario + (this.salario*porscentage/100);

    }
    public void nalteraSalario(double nporscentage) {
        this.salario = salario - (this.salario*nporscentage/100);

    }

    


    public String toString() {
        return "funcionario{" +
                "nome='" + nome + '\'' +
                ", id=" + id +
                ", salario=R$" + salario +
                '}';
    }
}
