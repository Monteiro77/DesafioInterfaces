package desafio1.service;

import desafio1.model.Jogadora;
import desafio1.model.Time;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CampeonatoTest {

    @Test
    void deveCadastrarJogadoraNoTime() {
        Time time = new Time("Estrelas FC", "São Paulo");
        Jogadora jogadora = new Jogadora("Ana", 22, "Atacante", 9);

        time.adicionarJogadora(jogadora);

        assertEquals(1, time.getJogadoras().size());
        assertEquals("Ana", time.getJogadoras().get(0).getNome());
    }


}
