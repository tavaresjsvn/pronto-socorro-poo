package pronto_socorro;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ProntoSocorro {

	private List<Paciente> listaPacientes = new ArrayList<>();
	private List<Triagem> triagensPendentes = new ArrayList<>();
	private List<Atendimento> atendimentosRealizados = new ArrayList<>();
	
	public void cadastrarPaciente(Paciente paciente) {
	    for (int i = 0; i < listaPacientes.size(); i++) {
	    	if (listaPacientes.get(i).getNumeroProntuario() == paciente.getNumeroProntuario()) {
	    		throw new IllegalArgumentException("Pacinete com esse número de prontuário já cadastrado!");
	    	}
	    }
	
	    listaPacientes.add(paciente);
	}
	
	public void registrarTriagem(Triagem triagem) {
		 for (int i = 0; i < triagensPendentes.size(); i++) {
		    	if (triagensPendentes.get(i).getPaciente().getNumeroProntuario() == triagem.getPaciente().getNumeroProntuario()) {
		    		throw new IllegalArgumentException("Paciente já em triagem!");
		    	}
		 }
		 
		 triagensPendentes.add(triagem);
	}
	
	public void iniciarAtendimento(Paciente paciente, ProfissionalSaude profissional) {
		 triagensPendentes.removeIf(t -> t.getPaciente().getNumeroProntuario() == paciente.getNumeroProntuario());
		 
		 Atendimento atendimento = new Atendimento(paciente, profissional, LocalDateTime.now());
		 atendimentosRealizados.add(atendimento);
	}
	
	public void encerrarAtendimentoPorPaciente(Paciente paciente, String diagnostico, String prescricao) {
	    for (int i = 0; i < atendimentosRealizados.size(); i++) {
	        if (atendimentosRealizados.get(i).getPaciente().getNumeroProntuario() == paciente.getNumeroProntuario()
	            && atendimentosRealizados.get(i).getDataHoraFim() == null) {

	        	atendimentosRealizados.get(i).encerrarAtendimento(diagnostico, prescricao);
	            return;
	        }
	    }
	    throw new IllegalArgumentException("Nenhum atendimento em aberto encontrado para o paciente: " + paciente.getNome());
	}
	
	public void listarTriagensPorPrioridade() {
		List<Triagem> vermelhos = new ArrayList<>();
		List<Triagem> amarelos = new ArrayList<>();
		List<Triagem> verdes = new ArrayList<>();
		
		 for (int i = 0; i < triagensPendentes.size(); i++) {
			 if (triagensPendentes.get(i).getClassificacaoRisco().equalsIgnoreCase("vermelho")) {
				 vermelhos.add(triagensPendentes.get(i));
			 } else if (triagensPendentes.get(i).getClassificacaoRisco().equalsIgnoreCase("amarelo")) {
				 amarelos.add(triagensPendentes.get(i));
			 } else if (triagensPendentes.get(i).getClassificacaoRisco().equalsIgnoreCase("verde")) {
				 verdes.add(triagensPendentes.get(i));
			 }
		 }
		 
		System.out.println("Triagens com nível de risco vermelho:");
		for (int i = 0; i < vermelhos.size(); i++) {
			System.out.println(vermelhos.get(i).resumoTriagem());
		}
		
		System.out.println("Triagens com nível de risco amarelo:");
		for (int i = 0; i < amarelos.size(); i++) {
			System.out.println(amarelos.get(i).resumoTriagem());
		}
		
		System.out.println("Triagens com nível de risco verde:");
		for (int i = 0; i < verdes.size(); i++) {
			System.out.println(verdes.get(i).resumoTriagem());
		}
	}
	
	public void listarAtendimentosPorPaciente(Paciente paciente) {
		System.out.println("Atendimentos realizados para o paciente " + paciente.getNome() + " de prontuário número " + paciente.getNumeroProntuario());
		
		for (int i = 0; i < atendimentosRealizados.size(); i++) {
			if (atendimentosRealizados.get(i).getPaciente().getNumeroProntuario() == paciente.getNumeroProntuario()) {
				System.out.println(atendimentosRealizados.get(i).resumoAtendimento());
			}
		}
	}
	
	
}
