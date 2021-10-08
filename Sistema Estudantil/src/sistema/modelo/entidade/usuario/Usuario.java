package sistema.modelo.entidade.usuario;

import sistema.modelo.enumeracao.funcionario.Status;

public abstract class Usuario {

	private String login;
	private String senha;
	private Status status;

	public Usuario(String login, String senha) {
		setLogin(login);
		setSenha(senha);
		setStatus(Status.ATIVO);
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}
}