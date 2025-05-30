package pronto_socorro;

import java.time.LocalDate;
import java.time.Period;

public abstract class Pessoa {

	protected String nome;
	protected String cpf;
	protected LocalDate dataNascimento;
	
	public Pessoa(String nome, String cpf, LocalDate dataNascimento) {
		this.nome = nome;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
	}
	
	public int getIdade() {
		LocalDate dataAtual = LocalDate.now();
		Period periodo = Period.between(dataNascimento, dataAtual);
		
		return periodo.getYears();
	}
	
	public abstract String getIdentificacao();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	
}
