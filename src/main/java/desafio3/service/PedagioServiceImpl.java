package desafio3.service;

import desafio3.model.PracaPedagio;
import desafio3.model.Veiculo;

public class PedagioServiceImpl implements IPedagioService {

    @Override
    public void registrarPassagem(PracaPedagio praca, Veiculo veiculo) {
        praca.registrarPassagem(veiculo);
    }

    @Override
    public double calcularValor(PracaPedagio praca, Veiculo veiculo) {
        return praca.calcularValor(veiculo);
    }
}
