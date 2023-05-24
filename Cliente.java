public class Cliente  extends Pessoa{

	private int idCliente;

	public void setIdCliente(int novoidCliente) {
		idCliente = novoidCliente;
	}

	public int getIdCliente(){
		return idCliente;
	}
    @Override
    public String getIdentificacao() {
        return "CPF do Cliente: " + getCpf();
    }
}