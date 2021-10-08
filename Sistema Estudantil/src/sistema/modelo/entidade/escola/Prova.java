package sistema.modelo.entidade.escola;

import sistema.modelo.entidade.usuario.aluno.Aluno;

public class Prova {

	private String nome;
	private float nota;
	private Aluno aluno;

	public Prova(String nome, float nota, Aluno aluno) {
		setNome(nome);
		setNota(nota);
		setAluno(aluno);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getNota() {
		return nota;
	}

	public void setNota(float nota) {
		this.nota = nota;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
}