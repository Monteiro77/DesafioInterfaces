package desafio1;

import desafio1.model.Jogadora;
import desafio1.model.Time;
import desafio1.repository.TimeRepository;
import desafio1.repository.TimeRepositoryImpl;
import desafio1.service.ClassificacaoServiceImpl;
import desafio1.service.JogoServiceImpl;

public class Main {
    public static void main(String[] args) {
        TimeRepository timeRepo = new TimeRepositoryImpl();
        JogoServiceImpl jogoService = new JogoServiceImpl(timeRepo);
        ClassificacaoServiceImpl classificacaoService = new ClassificacaoServiceImpl(timeRepo);

        Time time1 = new Time("Feras FC", "São Paulo");
        time1.adicionarJogadora(new Jogadora("Ana", 22, "Atacante", 9));
        time1.adicionarJogadora(new Jogadora("Carla", 24, "Goleira", 1));

        Time time2 = new Time("Guerreiras FC", "Campinas");
        time2.adicionarJogadora(new Jogadora("Juliana", 21, "Meio-campo", 8));
        time2.adicionarJogadora(new Jogadora("Roberta", 26, "Zagueira", 3));

        timeRepo.salvar(time1);
        timeRepo.salvar(time2);

        jogoService.registrarJogo("Feras FC", 2, "Guerreiras FC", 1);
        jogoService.registrarJogo("Feras FC", 1, "Guerreiras FC", 1);

        System.out.println("Tabela de Classificação:");
        for (Time time : classificacaoService.obterClassificacao()) {
            System.out.println(time.getNome() + " - " + time.getPontos() + " pts");
        }
    }
}
