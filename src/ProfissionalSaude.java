package pronto_socorro;

import java.time.LocalDate;

public class ProfissionalSaude extends Pessoa {

	private String registroProfissional;
	private String especialidade;

	public ProfissionalSaude(String nome, String cpf, LocalDate dataNascimento, String registroProfissional,
			String especialidade) {
		super(nome, cpf, dataNascimento);
		this.registroProfissional = registroProfissional;
		this.especialidade = especialidade;
	}

	@Override
	public String getIdentificacao() {
		return "Profissional de Saúde";
	}

	public String getRegistroProfissional() {
		return registroProfissional;
	}

	public void setRegistroProfissional(String registroProfissional) {
		this.registroProfissional = registroProfissional;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
}
