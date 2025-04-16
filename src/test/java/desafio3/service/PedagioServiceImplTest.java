package desafio3.service;

import desafio3.model.PracaPedagio;
import desafio3.model.Veiculo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PedagioServiceImplTest {

    @org.junit.Test
    public void testCalculoCarro() {
        PracaPedagio praca = new PracaPedagio("Teste", 10.0);
        Veiculo carro = new Veiculo("AAA1234", "carro", 0);

        PedagioServiceImpl service = new PedagioServiceImpl();
        double valor = service.calcularValor(praca, carro);

        assertEquals(10.0, valor);
    }

    @Test
    void testCalculoMoto() {
        PracaPedagio praca = new PracaPedagio("Teste", 10.0);
        Veiculo moto = new Veiculo("BBB5678", "moto", 0);

        PedagioServiceImpl service = new PedagioServiceImpl();
        double valor = service.calcularValor(praca, moto);

        assertEquals(5.0, valor);
    }

    @Test
    void testCalculoCaminhao() {
        PracaPedagio praca = new PracaPedagio("Teste", 10.0);
        Veiculo caminhao = new Veiculo("CCC9999", "caminhao", 4);

        PedagioServiceImpl service = new PedagioServiceImpl();
        double valor = service.calcularValor(praca, caminhao);

        assertEquals(40.0, valor);
    }
}
