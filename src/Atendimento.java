package pronto_socorro;

import java.time.LocalDateTime;

public class Atendimento {

	private Paciente paciente;
	private ProfissionalSaude profissional;
	private LocalDateTime dataHoraInicio;
	private LocalDateTime dataHoraFim;
	private String diagnostico;
	private String prescricao;
	
	public Atendimento(Paciente paciente, ProfissionalSaude profissional, LocalDateTime dataHoraInicio) {
		this.paciente = paciente;
		this.profissional = profissional;
		this.dataHoraInicio = dataHoraInicio;
	}
	
	public void encerrarAtendimento(String diagnostico, String prescricao) {
		setDiagnostico(diagnostico);
		setPrescricao(prescricao);
		setDataHoraFim(LocalDateTime.now());
	}
	
	public String resumoAtendimento() {
		return "Resumo do Atendimento" + "\n" +
			   "-----------------------------\n" +
	           "Paciente: " + this.paciente.getNome() + "\n" +
			   "Prontuário: " + this.paciente.getNumeroProntuario() + "\n" +
			   "Profissional responsável: " + this.profissional.getNome() + "\n" +
			   "Registro do profissional: " + this.profissional.getRegistroProfissional() + "\n" +
			   "Início do atendimento: " + this.dataHoraInicio + "\n" +
			   "Diagnóstico: " + this.diagnostico + "\n" + 
			   "Prescrição: " + this.prescricao + "\n" +
			   "Fim do atendimento: " + this.dataHoraFim;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public ProfissionalSaude getProfissional() {
		return profissional;
	}

	public void setProfissional(ProfissionalSaude profissional) {
		this.profissional = profissional;
	}

	public LocalDateTime getDataHoraInicio() {
		return dataHoraInicio;
	}

	public void setDataHoraInicio(LocalDateTime dataHoraInicio) {
		this.dataHoraInicio = dataHoraInicio;
	}

	public LocalDateTime getDataHoraFim() {
		return dataHoraFim;
	}

	public void setDataHoraFim(LocalDateTime datahoraFim) {
		this.dataHoraFim = datahoraFim;
	}

	public String getDiagnostico() {
		return diagnostico;
	}

	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}

	public String getPrescricao() {
		return prescricao;
	}

	public void setPrescricao(String prescricao) {
		this.prescricao = prescricao;
	}
	
	
}
