public class PessoaFisica extends Pessoas{


    private String cpf;

    public PessoaFisica(String nome, String cpf, String endereco, String email) {
        super(nome, endereco, email);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    

    @Override
    public void status() {
        super.status();
        System.out.println("CPF: " + this.getCpf());
    }
}