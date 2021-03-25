package domain;

public class Enfermeira extends Funcionario {

	private int numeroInscricaoCOREM;
	private String tipoAtuacao;
	private int cargaHoraria;

	public Enfermeira(String matricula, String nome, int anoDeAdmissao, Double salario, int numeroInscricaoCOREM,
			String tipoAtuacao, int cargaHoraria) {
		super(matricula, nome, anoDeAdmissao, salario);
		this.numeroInscricaoCOREM = numeroInscricaoCOREM;
		this.tipoAtuacao = tipoAtuacao;
		this.cargaHoraria = cargaHoraria;
	}

	public int getNumeroInscricaoCOREM() {
		return numeroInscricaoCOREM;
	}

	public void setNumeroInscricaoCOREM(int numeroInscricaoCOREM) {
		this.numeroInscricaoCOREM = numeroInscricaoCOREM;
	}

	public String getTipoAtuacao() {
		return tipoAtuacao;
	}

	public void setTipoAtuacao(String tipoAtuacao) {
		this.tipoAtuacao = tipoAtuacao;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	@Override
	public String toString() {
		return "Numero Inscrição COREM - " + numeroInscricaoCOREM + ", tipo de atuação - " + tipoAtuacao
				+ ", carga horaria - " + cargaHoraria + ", Matricula - " + getMatricula() + ", Nome  - " + getNome()
				+ ", Ano de admissão - " + getAnoDeAdmissao() + ", Salario - " + getSalario() + "]";
	}
}
