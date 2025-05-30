package pronto_socorro;

import java.time.LocalDateTime;

public class Triagem {

	private Paciente paciente;
	private LocalDateTime dataHora;
	private String descricaoSintomas;
	private String classificacaoRisco;
	
	public Triagem(Paciente paciente, LocalDateTime dataHora, String descricaoSintomas, String classificacaoRisco) {
		this.paciente = paciente;
		this.dataHora = dataHora;
		this.descricaoSintomas = descricaoSintomas;
		this.classificacaoRisco = classificacaoRisco;
	}
	
	public String definirPrioridade() {
		if (this.classificacaoRisco.equalsIgnoreCase("Vermelho")) {
			getPaciente().setPrioridade("Alta");
			return "Emergência! É necessário atendimento imediato";
		} else if (this.classificacaoRisco.equalsIgnoreCase("Amarelo")) {
			getPaciente().setPrioridade("Média");
			return "Prioridade nível média. Urgente, mas pode haver espera";
		} else if (this.classificacaoRisco.equalsIgnoreCase("Verde")) {
			getPaciente().setPrioridade("Baixa");
			return "Pouco risco. Atendimento não emergencial";
		} else {
			return "Classificação de risco indefinida";
		}
	}
	
	public String resumoTriagem() {
		String prioridade = definirPrioridade();
		return "Resumo da Triagem" + "\n" +
				"---------------------------\n" + 
				"Paciente: " + this.paciente.getNome() + "\n" +
				"Prontuário: " + this.paciente.getNumeroProntuario() + "\n" +
				"Data e Hora: " + this.dataHora + "\n" +
				"Sintomas: " + this.descricaoSintomas + "\n" +
				"Prioridade: " + prioridade + "(Classificação de risco: " + this.classificacaoRisco + ")";		
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public LocalDateTime getDataHora() {
		return dataHora;
	}

	public void setDataHora(LocalDateTime dataHora) {
		this.dataHora = dataHora;
	}

	public String getDescricaoSintomas() {
		return descricaoSintomas;
	}

	public void setDescricaoSintomas(String descricaoSintomas) {
		this.descricaoSintomas = descricaoSintomas;
	}

	public String getClassificacaoRisco() {
		return classificacaoRisco;
	}

	public void setClassificacaoRisco(String classificacaoRisco) {
		this.classificacaoRisco = classificacaoRisco;
	}
}
