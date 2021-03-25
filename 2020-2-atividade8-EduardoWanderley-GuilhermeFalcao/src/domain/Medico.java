package domain;

public class Medico extends Funcionario {
	
	private Integer numeroInscricaoCRM;
	private String nomeEspecialidades;
	
	public Medico(String matricula, String nome, int anoDeAdmissao, Double salario, Integer numeroInscricaoCRM,
			String nomeEspecialidades) {
		super(matricula, nome, anoDeAdmissao, salario);
		this.numeroInscricaoCRM = numeroInscricaoCRM;
		this.nomeEspecialidades = nomeEspecialidades;
	}

	public Integer getNumeroInscricaoCRM() {
		return numeroInscricaoCRM;
	}

	public void setNumeroInscricaoCRM(Integer numeroInscricaoCRM) {
		this.numeroInscricaoCRM = numeroInscricaoCRM;
	}

	public String getNomeEspecialidades() {
		return nomeEspecialidades;
	}

	public void setNomeEspecialidades(String nomeEspecialidades) {
		this.nomeEspecialidades = nomeEspecialidades;
	}

	@Override
	public String toString() {
		return "Numero Inscricao CRM -" + numeroInscricaoCRM + ", Especialidades - " + nomeEspecialidades
				+ ", Matricula -" + getMatricula() + ", Ano de admissão - " + getAnoDeAdmissao()
				+ ", Salario - " + getSalario();
	}
}
