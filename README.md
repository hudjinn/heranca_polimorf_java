# heranca_polimorf_java
Trabalho de Programação Orientada a Objetos feito em Java. O sistema implementa um sistema de cadastro e geração de relatórios para uma empresa, dentro de ambiente desenvolvido em Java, com o intuito de organizar o posterior armazenamento dessas informações em banco de dados relacional, além de preparar um método de exportação de relatório.

Para tal, foram criadas 4 classes: Pessoa, Funcionario, Cliente e Relatorio.

O código cria objetos que representam clientes e funcionários. 
A classe principal é a Pessoa, que é uma classe abstrata que define os atributos básicos de uma pessoa, como nome, endereço, email, CPF, e data de nascimento, com métodos get/set para acessar e modificar esses atributos.
Em seguida, temos a classe Cliente, que estende a classe Pessoa. Essa classe adiciona um atributo privado específico, idCliente, e métodos para acessar e modificar esse atributo.
Temos também a classe Funcionario, que também estende a classe Pessoa. Essa classe adiciona os atributos privados idFunc e cargo, além dos métodos get/set.

A classe Relatorio é responsável por gerar relatórios de cadastro. Ela possui um método para gerar relatório de cadastro de cliente ou funcionário. O primeiro parâmetro corresponde ao funcionário que está requerendo o relatório, e o segundo parâmetro corresponde ao cadastro de quem se deseja obter informações. O relatório exibe nome e endereço do segundo objeto passado no parâmetro. Se o funcionário que solicitou o relatório tiver permissão, o CPF do cliente ou funcionário também é exibido. Caso contrário, é mostrada uma mensagem informando que o funcionário não tem permissão para ver o CPF

Conceitos aplicados: Herança, Encapsulamento e Polimorfismo
