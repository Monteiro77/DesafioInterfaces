package desafio2.repository;

import desafio2.model.Pessoa;

import java.util.List;

public interface PessoaRepository {
    void salvar(Pessoa pessoa);
    List<Pessoa> listarTodas();
}
