package domain;

public class Funcionario {
	private String matricula;
	private String nome;
	private Integer anoDeAdmissao;
	private Double salario;

	public Funcionario(String matricula, String nome, Integer anoDeAdmissao, Double salario) {
		this.matricula = matricula;
		this.nome = nome;
		this.anoDeAdmissao = anoDeAdmissao;
		this.salario = salario;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getAnoDeAdmissao() {
		return anoDeAdmissao;
	}

	public void setAnoDeAdmissao(Integer anoDeAdmissao) {
		this.anoDeAdmissao = anoDeAdmissao;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
}
