package desafio2;

import desafio2.model.Atendimento;
import desafio2.model.Pessoa;
import desafio2.repository.PessoaRepository;
import desafio2.repository.PessoaRepositoryImpl;
import desafio2.service.PessoaService;
import desafio2.service.PessoaServiceImpl;
import desafio2.service.RelatorioService;
import desafio2.service.RelatorioServiceImpl;
import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        PessoaRepository pessoaRepo = new PessoaRepositoryImpl();
        PessoaService pessoaService = new PessoaServiceImpl(pessoaRepo);
        RelatorioService relatorioService = new RelatorioServiceImpl();


        // Cadastrando pessoas
        Pessoa p1 = new Pessoa("Maria", 30, "Visual", "moderado", "Rua A, 123");
        Pessoa p2 = new Pessoa("João", 25, "Auditiva", "leve", "Rua B, 456");
        Pessoa p3 = new Pessoa("Ana", 40, "Motora", "severo", "Rua C, 789");

        pessoaService.cadastrarPessoa(p1);
        pessoaService.cadastrarPessoa(p2);
        pessoaService.cadastrarPessoa(p3);

        // Registrando atendimentos
        p1.adicionarAtendimento(new Atendimento(LocalDate.of(2024, 10, 10), "Fisioterapia", "Dra. Luana"));
        p1.adicionarAtendimento(new Atendimento(LocalDate.of(2024, 10, 15), "Psicologia", "Dr. Carlos"));

        p2.adicionarAtendimento(new Atendimento(LocalDate.of(2024, 11, 5), "Terapia Ocupacional", "Dra. Paula"));

        // Filtrando pessoas
        System.out.println("🔎 Pessoas com deficiência 'Visual' e grau 'moderado':");
        List<Pessoa> filtradas = pessoaService.filtrarPorTipoEGrau("Visual", "moderado");
        filtradas.forEach(p -> System.out.println("- " + p.getNome()));

        // Gerando relatório
        System.out.println("\n📄 Relatório de Atendimentos de Maria:");
        relatorioService.gerarRelatorio(p1);
    }
}
