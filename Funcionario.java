public class Funcionario extends Pessoas{

    private String cpf;
    private double salario;



    public Funcionario(String nome, String cpf, String endereco, double salario) {
        super(nome, endereco, null); // Funcionário não precisa de email
        this.cpf = cpf;
        this.salario = salario;
    }
    

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public void status() {
        super.status();
        System.out.println("CPF: " + this.getCpf());
        System.out.println("Salário: " + this.getSalario());
    }

}
