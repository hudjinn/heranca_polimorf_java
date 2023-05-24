public class TesteAps {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente();
		Cliente cliente2 = new Cliente();
		Funcionario func1 = new Funcionario();
		Funcionario func2 = new Funcionario();
		
		cliente1.setNome("Daniele");
		cliente1.setEndereco("Rua ABC, 123");
		cliente1.setCpf("000.000.000-00");
		cliente1.setDataNascimento("01.01.2010");
		cliente1.setIdCliente(12);

		cliente2.setNome("Jefferson");
		cliente2.setEndereco("Rua 123, 456");
		cliente2.setCpf("000.000.000-01");
		cliente2.setDataNascimento("01.01.2011");
		cliente2.setIdCliente(42);

		func1.setNome("Breno");
		func1.setEndereco("Avenida RGB, 321");
		func1.setCpf("000.000.000-02");
		func1.setDataNascimento("01.01.2021");
		func1.setIdFunc(22);
		func1.setCargo("Sofredor");

		func2.setNome("Leonardo");
		func2.setEndereco("Avenida Chique, 1");
		func2.setCpf("001.000.000-02");
		func2.setDataNascimento("01.01.1910");
		func2.setIdFunc(1);
		func2.setCargo("Manda Chuva");
        
        Relatorio relatorio = new Relatorio();
        relatorio.getRelatorio(func1, func2);
        relatorio.getRelatorio(func1, cliente1);
        relatorio.getRelatorio(func2, func1);
        
	}

}
