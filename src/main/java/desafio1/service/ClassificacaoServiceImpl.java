package desafio1.service;

import desafio1.model.Time;
import desafio1.repository.TimeRepository;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ClassificacaoServiceImpl {

    private final TimeRepository timeRepository;

    public ClassificacaoServiceImpl(TimeRepository timeRepository) {
        this.timeRepository = timeRepository;
    }

    public List<Time> obterClassificacao() {
        return timeRepository.listarTodos().stream()
                .sorted(Comparator.comparingInt(Time::getPontos).reversed())
                .collect(Collectors.toList());
    }
}
