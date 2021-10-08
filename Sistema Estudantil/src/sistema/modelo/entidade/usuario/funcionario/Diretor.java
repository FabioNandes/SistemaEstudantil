package sistema.modelo.entidade.usuario.funcionario;

import sistema.modelo.entidade.usuario.Pessoa;

public class Diretor extends Pessoa implements Funcionario {

	public Diretor(String login, String senha, String nome, int matricula, int idade) {
		super(login, senha, nome, matricula, idade);
	}

	public float calcularSalario() {
		return 3000;
	}
}