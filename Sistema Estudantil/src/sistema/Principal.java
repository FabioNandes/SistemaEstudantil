package sistema;

import java.util.List;

import sistema.modelo.entidade.escola.Prova;
import sistema.modelo.entidade.escola.Turma;
import sistema.modelo.entidade.usuario.aluno.Aluno;
import sistema.modelo.entidade.usuario.funcionario.Professor;
import sistema.modelo.enumeracao.funcionario.Status;

public class Principal {

	public static void main(String[] args) {

		Professor professor = new Professor("login", "senha", "Allan", 12470, 22, null);
		Turma turma = new Turma("Jovem Programador", "2021.1530", professor );

		professor.setTurma(turma);

		Aluno aluno1 = new Aluno("outrologin", "outrasenha", "Carlos", 15654, 16);
		turma.inserirAluno(aluno1);

		Prova provaBiologia = new Prova("Cladistica", 10, aluno1);
		aluno1.inserirProva(provaBiologia);

		Prova provaQuimica = new Prova("Ligações Covalentes", 10, aluno1);
		aluno1.inserirProva(provaQuimica);

		Prova provaMatematica = new Prova("Geometria Plana", 10, aluno1);
		aluno1.inserirProva(provaMatematica);

		turma.getProfessor().setStatus(Status.ATIVO);
		
		System.out.println("A turma cadastrada foi: " + turma.getNome());
		System.out.println("O professor da turma é: " + turma.getProfessor().getNome());
		System.out.println("O salário do  professor é: " + turma.getProfessor().calcularSalario());
		System.out.println("O status do professor é: " + turma.getProfessor().getStatus());
		System.out.println("O tamanho da turma é de: " + turma.getQuantidadeAlunosMatriculados());

		System.out.println("\nOs alunos são:");

		List<Aluno>alunos = turma.recuperarAlunos();
		Aluno aluno = null;

		List<Prova>provas = null;
		Prova prova = null;

		for (int i = 0; i < alunos.size(); i++) {

			aluno = alunos.get(i);

			if (aluno != null) {

				System.out.println("\nNome: " + aluno.getNome());
				System.out.println("Número de Matricula: " + aluno.getMatricula());
				System.out.println("Idade: " + aluno.getIdade());

				provas = aluno.recuperarProvasFeitas();
				System.out.println("\nA quantidade de provas foi: " + provas.size());

				for (int j = 0; j < provas.size(); j++) {

					prova = provas.get(j);

					if (prova != null) {

						System.out.println("\nA Prova foi de: " + prova.getNome());
						System.out.println("A Nota foi: " + prova.getNota());
					}
					System.out.println("A média do aluno foi de: "+aluno.calcularMedia());
				}
				System.out.println("A média da turma foi de: "+turma.calcularMedia());
			}
		}
	}
}