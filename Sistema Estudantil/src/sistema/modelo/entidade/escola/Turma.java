package sistema.modelo.entidade.escola;

import java.util.ArrayList;
import java.util.List;

import sistema.modelo.entidade.usuario.aluno.Aluno;
import sistema.modelo.entidade.usuario.funcionario.Professor;

public class Turma {

	private String nome;
	private String codigo;
	private Professor professor;
	private List<Aluno>alunos;
	
	

	public Turma(String nome, String codigo, Professor professor) {
		setNome(nome);
		setCodigo(codigo);
		setProfessor(professor);
		alunos = new ArrayList<Aluno>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public boolean inserirAluno(Aluno aluno) {

		return alunos.add(aluno);

	}

	public List<Aluno> recuperarAlunos() {
		return alunos;
	}

	public int getQuantidadeAlunosMatriculados() {
		return alunos.size();
	}

	

	public float calcularMedia() {

		float soma = 0;

		for (int i = 0; i < alunos.size(); i++)
			soma += alunos.get(i).calcularMedia();

		return soma / alunos.size();
	}
}