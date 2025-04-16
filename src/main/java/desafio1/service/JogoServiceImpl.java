package desafio1.service;

import desafio1.model.Time;
import desafio1.repository.TimeRepository;

public class JogoServiceImpl implements JogoService {
    private final TimeRepository timeRepository;

    public JogoServiceImpl(TimeRepository timeRepository) {
        this.timeRepository = timeRepository;
    }

    @Override
    public void registrarJogo(String timeCasa, int golsCasa, String timeFora, int golsFora) {
        Time casa = timeRepository.buscarPorNome(timeCasa);
        Time fora = timeRepository.buscarPorNome(timeFora);

        if (casa == null || fora == null) {
            System.out.println("Um dos times não existe.");
            return;
        }

        if (golsCasa > golsFora) {
            casa.adicionarPontos(3);
        } else if (golsCasa < golsFora) {
            fora.adicionarPontos(3);
        } else {
            casa.adicionarPontos(1);
            fora.adicionarPontos(1);
        }
    }

    @Override
    public void calcularPontuacoes() {

    }
}
