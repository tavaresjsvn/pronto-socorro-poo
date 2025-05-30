# Projeto POO – Sistema de Gerenciamento de Pronto-Socorro

### Descrição

Este projeto foi desenvolvido como trabalho final da disciplina de Programação Orientada a Objetos (POO), no 2º período do curso de Análise e Desenvolvimento de Sistemas. O objetivo é simular o funcionamento básico de um **pronto-socorro**, utilizando os conceitos fundamentais de POO: herança, abstração, encapsulamento e polimorfismo.

---

### Estrutura do Projeto

O sistema é composto pelas seguintes classes:

### Classes Abstratas
- **Pessoa**: classe abstrata base para `Paciente` e `ProfissionalSaude`.

### Paciente
- Atributos: número de prontuário, prioridade.
- Método: `getIdentificacao()` retorna `"Paciente"`.

### ProfissionalSaude
- Atributos: registro profissional, especialidade.
- Método: `getIdentificacao()` retorna `"Profissional de Saúde"`.

### Triagem
- Registra sintomas, data e hora.
- Define a prioridade do paciente com base na classificação de risco.
- Métodos principais: `definirPrioridade()`, `resumoTriagem()`.

### Atendimento
- Armazena dados do atendimento médico.
- Métodos principais: `encerrarAtendimento()`, `resumoAtendimento()`.

### ProntoSocorro
- Classe principal que gerencia:
  - Lista de pacientes
  - Triagens pendentes
  - Atendimentos realizados
- Métodos principais:
  - `cadastrarPaciente()`
  - `registrarTriagem()`
  - `iniciarAtendimento()`
  - `listarTriagensPorPrioridade()`
  - `listarAtendimentosPorPaciente()`

### Main
- Classe com exemplos práticos de uso, simulando um fluxo de atendimento.

---

### Requisitos

- Java 8 ou superior
- IDE de sua preferência (Eclipse, IntelliJ, VS Code, etc.)

---

### Como Executar

1. Abra o projeto em sua IDE.
2. Compile todos os arquivos `.java`.
3. Execute a classe `Main.java`.
4. Observe no console o fluxo simulado de cadastro, triagem e atendimento.

---

### Autor

Aluno: Josevan Tavares Pereira ramos 
Curso: Análise e Desenvolvimento de Sistemas – 2º Período  
Disciplina: Programação Orientada a Objetos (POO)  
Professor: Rafael Marinho dos Anjos
Faculdade Alpha

