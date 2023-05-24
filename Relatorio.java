public class Relatorio {
    public void getRelatorio(Funcionario funcionario, Pessoa pessoa) {
        System.out.println("Relatório de cadastro de " + pessoa.tipoCadastro);
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Endereço: " + pessoa.getEndereco());
        
        if (funcionario.getCargo().equals("Manda Chuva")) {
            System.out.println(pessoa.getIdentificacao() + "\n");
        } else {
            System.out.println("Funcionário sem permissão para ver CPF" + "\n");
            
        }
    }
}