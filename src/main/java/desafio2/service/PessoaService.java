package desafio2.service;

import desafio2.model.Pessoa;
import java.util.List;

public interface PessoaService {
    void cadastrarPessoa(Pessoa pessoa);
    List<Pessoa> listarTodas();
    List<Pessoa> filtrarPorTipoEGrau(String tipoDeficiencia, String grau);
}
