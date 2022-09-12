package br.unitins.topicos1.xtrala.model;

public class Usuario {
	private String nome;
	private String telefone;
	private String cpf;
	private String login;
	private String senha;

	
	public Usuario(String nome, String telefone, String cpf) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
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

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}
