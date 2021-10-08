package sistema.modelo.entidade.usuario.funcionario;

import sistema.modelo.entidade.escola.Turma;
import sistema.modelo.entidade.usuario.Pessoa;

public  class  Professor extends Pessoa implements Funcionario {

	private Turma turma;

	public Professor(String login, String senha, String nome, int matricula, int idade, Turma turma) {
		super(login, senha, nome, matricula, idade);
		setTurma(turma);
	}

	public Turma getTurma() {
		return turma;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}

	public float calcularSalario() {
		return 1200;
	}
}