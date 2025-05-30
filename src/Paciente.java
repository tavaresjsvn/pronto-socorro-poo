package pronto_socorro;

import java.time.LocalDate;

public class Paciente extends Pessoa {

	private int numeroProntuario;
	private String prioridade;
	
	
	public Paciente(String nome, String cpf, LocalDate dataNascimento, int numeroProntuario, String prioridade) {
		super(nome, cpf, dataNascimento);
		this.numeroProntuario = numeroProntuario;
		this.prioridade = prioridade;
	}

	@Override
	public String getIdentificacao() {
		return "Paciente";
	}

	public int getNumeroProntuario() {
		return numeroProntuario;
	}

	public void setNumeroProntuario(int numeroProntuario) {
		this.numeroProntuario = numeroProntuario;
	}

	public String getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(String prioridade) {
		this.prioridade = prioridade;
	}

}
