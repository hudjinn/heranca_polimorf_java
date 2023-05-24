public class Cliente  extends Pessoa{

	private int idCliente;
    public Cliente(){
        tipoCadastro = "Cliente";
    }
    
	public void setIdCliente(int novoidCliente) {
		idCliente = novoidCliente;
	}

	public int getIdCliente(){
		return idCliente;
	}


    public String getIdentificacao() {
        return "CPF do Cliente: " + getCpf();
    }
}