package desafio1.repository;

import desafio1.model.Time;

import java.util.ArrayList;
import java.util.List;

public class TimeRepositoryImpl implements TimeRepository {
    private List<Time> times = new ArrayList<>();

    @Override
    public void salvar(Time time) {
        times.add(time);
    }

    @Override
    public List<Time> listarTodos() {
        return times;
    }

    @Override
    public Time buscarPorNome(String nome) {
        return times.stream()
                .filter(t -> t.getNome().equalsIgnoreCase(nome))
                .findFirst()
                .orElse(null);
    }
}
