package desafio3.service;

import desafio3.model.PracaPedagio;
import desafio3.model.RegistroPassagem;

public class RelatorioServiceImpl implements IRelatorioService {

    @Override
    public void gerarRelatorio(PracaPedagio praca) {
        System.out.println("Relatório da praça: " + praca.getLocalizacao());
        for (RegistroPassagem r : praca.getRegistros()) {
            System.out.println("Veículo: " + r.getVeiculo().getPlaca() +
                    " | Tipo: " + r.getVeiculo().getTipo() +
                    " | Valor: R$ " + r.getValor());
        }
        System.out.println("Total arrecadado: R$ " + praca.getTotalArrecadado());
    }
}
