public abstract class Pessoa {

	private String nome;
	private String endereco;
	private String email;
	private String cpf;
	private String dataNascimento;
    public String tipoCadastro;
    
	public void setNome(String novoNome) {
	nome = novoNome;
	}

	public String getNome(){
	return nome;
	}

	public void setEndereco(String novoEndereco) {
	endereco = novoEndereco;
	}

	public String getEndereco(){
	return endereco;
	}

	public void setEmail(String novoEmail) {
	email = novoEmail;
	}

	public String getEmail(){
	return email;
	}

	public void setDataNascimento(String novoDataNascimento) {
	dataNascimento = novoDataNascimento;
	}

	public String getDataNascimento(){
	return dataNascimento;
	}

	public void setCpf(String novoCpf) {
	cpf = novoCpf;
	}

	public String getCpf(){
	return cpf;
	}

    public abstract String getIdentificacao();	    
}