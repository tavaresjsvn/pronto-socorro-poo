package pronto_socorro;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {

	public static void main(String[] args) {
		
		 // Criação de Pacientes
        Paciente paciente1 = new Paciente("Maria Clara", "111.222.333-44", LocalDate.of(1995, 4, 15), 123, "Alta");
        Paciente paciente2 = new Paciente("João Pedro", "555.666.777-88", LocalDate.of(1988, 10, 1), 124, "Média");

        // Teste dos métodos de Paciente
        paciente1.setPrioridade("Baixa");
        paciente1.setNumeroProntuario(125);
        System.out.println("Nome: " + paciente1.getNome());
        System.out.println("CPF: " + paciente1.getCpf());
        System.out.println("Data Nascimento: " + paciente1.getDataNascimento());
        System.out.println("Idade: " + paciente1.getIdade());
        System.out.println("Número Prontuário: " + paciente1.getNumeroProntuario());
        System.out.println("Prioridade: " + paciente1.getPrioridade());
        System.out.println("Identificação: " + paciente1.getIdentificacao() + "\n");

        // Criação de Profissional de Saúde
        ProfissionalSaude profissional = new ProfissionalSaude("Dra. Julia", "999.888.777-66", LocalDate.of(1970, 6, 25), "CRM123456", "Pediatria");

        // Teste dos métodos de ProfissionalSaude
        profissional.setEspecialidade("Clínica Geral");
        profissional.setRegistroProfissional("CRM654321");
        System.out.println("Nome: " + profissional.getNome());
        System.out.println("Especialidade: " + profissional.getEspecialidade());
        System.out.println("Registro: " + profissional.getRegistroProfissional());
        System.out.println("Identificação: " + profissional.getIdentificacao() + "\n");

        // Criação de Triagem
        Triagem triagem = new Triagem(paciente1, LocalDateTime.now(), "Febre alta e dor de cabeça", "Amarelo");

        // Teste dos métodos de Triagem
        triagem.setDescricaoSintomas("Febre persistente");
        triagem.setClassificacaoRisco("Vermelho");
        triagem.setDataHora(LocalDateTime.now());
        triagem.setPaciente(paciente1);
        System.out.println(triagem.resumoTriagem());
        System.out.println("Classificação: " + triagem.getClassificacaoRisco());
        System.out.println("Sintomas: " + triagem.getDescricaoSintomas());
        System.out.println("Prioridade definida: " + triagem.definirPrioridade() + "\n");

        // Criação de Atendimento
        Atendimento atendimento = new Atendimento(paciente1, profissional, LocalDateTime.now());
        atendimento.setDiagnostico("Infecção");
        atendimento.setPrescricao("Paracetamol 500mg por 5 dias");
        atendimento.setDataHoraFim(LocalDateTime.now());
        System.out.println(atendimento.resumoAtendimento() + "\n");

        // Teste dos métodos de Atendimento
        System.out.println("Diagnóstico final: " + atendimento.getDiagnostico());
        System.out.println("Prescrição final: " + atendimento.getPrescricao() + "\n");

        // Criação do Pronto Socorro
        ProntoSocorro ps = new ProntoSocorro();

        // Teste de cadastro de pacientes
        ps.cadastrarPaciente(paciente1);
        ps.cadastrarPaciente(paciente2);

        // Teste de triagens
        Triagem triagem2 = new Triagem(paciente2, LocalDateTime.now(), "Dor nas costas", "Verde");
        ps.registrarTriagem(triagem);
        ps.registrarTriagem(triagem2);
        ps.listarTriagensPorPrioridade();

        // Teste de atendimento
        ps.iniciarAtendimento(paciente1, profissional);
        ps.encerrarAtendimentoPorPaciente(paciente1, "Cirurgia", "Bezetacil");
        ps.listarAtendimentosPorPaciente(paciente1);

	}

}
