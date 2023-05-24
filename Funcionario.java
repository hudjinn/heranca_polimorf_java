public class Funcionario extends Pessoa{
	
	private int idFunc;
	private String cargo;
	public Funcionario(){
	    tipoCadastro = "Funcionário"; 
	}
	public void setIdFunc(int novoId) {
	idFunc = novoId;
	}

	public int getIdFunc(){
	return idFunc;
	}

	public void setCargo(String novoCargo) {
	cargo = novoCargo;
	}

	public String getCargo(){
	return cargo;
	}
	
    @Override
    public String getIdentificacao() {
        return "CPF do Funcionário: " + getCpf();
    }
}