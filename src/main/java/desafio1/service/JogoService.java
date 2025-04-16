package desafio1.service;

public interface JogoService {
    void registrarJogo(String timeCasa, int golsCasa, String timeFora, int golsFora);
    void calcularPontuacoes();
}
