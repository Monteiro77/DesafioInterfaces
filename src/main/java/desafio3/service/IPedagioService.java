package desafio3.service;

import desafio3.model.PracaPedagio;
import desafio3.model.Veiculo;

public interface IPedagioService {
    void registrarPassagem(PracaPedagio praca, Veiculo veiculo);
    double calcularValor(PracaPedagio praca, Veiculo veiculo);
}
