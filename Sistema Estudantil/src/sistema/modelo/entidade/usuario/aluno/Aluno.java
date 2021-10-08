package sistema.modelo.entidade.usuario.aluno;

import java.util.ArrayList;
import java.util.List;

import sistema.modelo.entidade.escola.Prova;
import sistema.modelo.entidade.escola.Turma;
import sistema.modelo.entidade.usuario.Pessoa;

public class Aluno extends Pessoa {

	private List<Prova>provas;
	private List<Turma>turmas;
	

	public Aluno(String login, String senha, String nome, int matricula, int idade) {
		super(login, senha, nome, matricula, idade);
		provas = new ArrayList<Prova>();
		turmas = new ArrayList<Turma>();
		
	}

	public boolean inserirProva(Prova prova) {
		return provas.add(prova);
	}

	public List<Prova> recuperarProvasFeitas() {
		return provas;
	}

	public boolean inserirTurma(Turma turma) {
		return turmas.add(turma);
	}

	public List<Turma> recuperarTurmas() {
		return turmas;
	}

	public float calcularMedia() {

		float soma = 0;

		for (int i = 0; i < provas.size(); i++)
			soma += provas.get(i).getNota();

		return soma / provas.size();
	}
}