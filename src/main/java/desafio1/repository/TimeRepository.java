package desafio1.repository;

import desafio1.model.Time;
import java.util.List;

public interface TimeRepository {
    void salvar(Time time);
    List<Time> listarTodos();
    Time buscarPorNome(String nome);
}
