public class PessoaJuridica extends Pessoas{

    private String cnpj;

    public PessoaJuridica(String nome, String cnpj, String endereco, String email) {
        super(nome, endereco, email);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }


    
    @Override
    public void status() {
        super.status();
        System.out.println("CNPJ: " + this.getCnpj());
    }
}