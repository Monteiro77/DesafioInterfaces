package desafio2.service;

import desafio2.model.Pessoa;
import desafio2.repository.PessoaRepository;

import java.util.List;
import java.util.stream.Collectors;

public class PessoaServiceImpl implements PessoaService {
    private final PessoaRepository pessoaRepository;

    public PessoaServiceImpl(PessoaRepository pessoaRepository) {
        this.pessoaRepository = pessoaRepository;
    }

    @Override
    public void cadastrarPessoa(Pessoa pessoa) {
        pessoaRepository.salvar(pessoa);
    }

    @Override
    public List<Pessoa> listarTodas() {
        return pessoaRepository.listarTodas();
    }

    @Override
    public List<Pessoa> filtrarPorTipoEGrau(String tipoDeficiencia, String grau) {
        return pessoaRepository.listarTodas().stream()
                .filter(p -> p.getTipoDeficiencia().equalsIgnoreCase(tipoDeficiencia))
                .filter(p -> p.getGrau().equalsIgnoreCase(grau))
                .collect(Collectors.toList());
    }
}
