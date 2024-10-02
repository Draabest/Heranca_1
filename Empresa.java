import java.util.Scanner; //importando o Scanner
public class Empresa{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in); // intanciando o scanner

        // coletando informações do funcionário
        System.out.println("Cadastro de Funcionário");
        System.out.print("Nome: ");
        String nomeFuncionario = scanner.nextLine();
        System.out.print("CPF: ");
        String cpfFuncionario = scanner.nextLine();
        System.out.print("Endereço: ");
        String enderecoFuncionario = scanner.nextLine();
        System.out.print("Salário: ");
        double salarioFuncionario = scanner.nextDouble();
        scanner.nextLine();  // Consumir a quebra de linha

        Funcionario funcionario = new Funcionario(nomeFuncionario, cpfFuncionario, enderecoFuncionario, salarioFuncionario);

        // coletando informações da pessoa física
        System.out.println("\nCadastro de Pessoa Física");
        System.out.print("Nome: ");
        String nomePessoaFisica = scanner.nextLine();
        System.out.print("CPF: ");
        String cpfPessoaFisica = scanner.nextLine();
        System.out.print("Endereço: ");
        String enderecoPessoaFisica = scanner.nextLine();
        System.out.print("Email: ");
        String emailPessoaFisica = scanner.nextLine();

        PessoaFisica pessoaFisica = new PessoaFisica(nomePessoaFisica, cpfPessoaFisica, enderecoPessoaFisica, emailPessoaFisica);

        // coletando informações da pessoa jurídica
        System.out.println("\nCadastro de Pessoa Jurídica");
        System.out.print("Nome: ");
        String nomePessoaJuridica = scanner.nextLine();
        System.out.print("CNPJ: ");
        String cnpjPessoaJuridica = scanner.nextLine();
        System.out.print("Endereço: ");
        String enderecoPessoaJuridica = scanner.nextLine();
        System.out.print("Email: ");
        String emailPessoaJuridica = scanner.nextLine();

        PessoaJuridica pessoaJuridica = new PessoaJuridica(nomePessoaJuridica, cnpjPessoaJuridica, enderecoPessoaJuridica, emailPessoaJuridica);

        // Exibindo informações
        System.out.println("\nInformações do Funcionário:");
        funcionario.status();

        System.out.println("\nInformações da Pessoa Física:");
        pessoaFisica.status();

        System.out.println("\nInformações da Pessoa Jurídica:");
        pessoaJuridica.status();

        // Fechar o scanner
        scanner.close();
    }
}