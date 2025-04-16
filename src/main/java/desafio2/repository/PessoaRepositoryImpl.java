package desafio2.repository;

import desafio2.model.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class PessoaRepositoryImpl implements PessoaRepository {
    private final List<Pessoa> pessoas = new ArrayList<>();

    @Override
    public void salvar(Pessoa pessoa) {
        pessoas.add(pessoa);
    }

    @Override
    public List<Pessoa> listarTodas() {
        return new ArrayList<>(pessoas); // retorna cópia para evitar alteração direta
    }
}
