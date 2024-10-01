public abstract class Pessoas {

    //Variaveis
    private String nome;
    private String endereco;
    private String email;
    
    
    
    //Getters e Setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }



    //Construtor
    public Pessoas(String nome, String endereco, String email) {
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
    }

    

    //Metodo de status
    public void status(){

        System.out.print(this.getNome());
        System.out.println(this.getEmail());
        System.out.println(this.getEndereco());

    }



}
