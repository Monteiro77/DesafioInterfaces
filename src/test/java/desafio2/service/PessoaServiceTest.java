package desafio2.service;

import desafio2.model.Atendimento;
import desafio2.model.Pessoa;
import desafio2.repository.PessoaRepository;
import desafio2.repository.PessoaRepositoryImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PessoaServiceTest {

    private PessoaService pessoaService;

    @BeforeEach
    void setUp() {
        PessoaRepository repo = new PessoaRepositoryImpl();
        pessoaService = new PessoaServiceImpl(repo);
    }

    @Test
    void deveCadastrarPessoaComSucesso() {
        Pessoa p = new Pessoa("Carla", 28, "Visual", "moderado", "Rua X, 100");
        pessoaService.cadastrarPessoa(p);

        List<Pessoa> lista = pessoaService.filtrarPorTipoEGrau("Visual", "moderado");
        assertEquals(1, lista.size());
        assertEquals("Carla", lista.get(0).getNome());
    }

    @Test
    void deveAdicionarAtendimentoNaPessoa() {
        Pessoa p = new Pessoa("João", 35, "Motora", "severo", "Rua Y, 200");
        p.adicionarAtendimento(new Atendimento(LocalDate.of(2025, 1, 10), "Fisioterapia", "Dra. Luana"));

        assertEquals(1, p.getAtendimentos().size());
        assertEquals("Fisioterapia", p.getAtendimentos().get(0).getTipo());
    }

    @Test
    void deveFiltrarPessoaPorTipoEGrau() {
        Pessoa p1 = new Pessoa("Ana", 40, "Auditiva", "leve", "Rua Z, 300");
        Pessoa p2 = new Pessoa("Bruno", 50, "Auditiva", "moderado", "Rua Z, 301");

        pessoaService.cadastrarPessoa(p1);
        pessoaService.cadastrarPessoa(p2);

        List<Pessoa> filtradas = pessoaService.filtrarPorTipoEGrau("Auditiva", "leve");
        assertEquals(1, filtradas.size());
        assertEquals("Ana", filtradas.get(0).getNome());
    }
}
