package desafio3;

import desafio3.model.*;
import desafio3.service.*;

public class Main {
    public static void main(String[] args) {
        PracaPedagio praca1 = new PracaPedagio("Rodovia Anhanguera - KM 100", 10.0);

        IPedagioService pedagioService = new PedagioServiceImpl();
        IRelatorioService relatorioService = new RelatorioServiceImpl();

        pedagioService.registrarPassagem(praca1, new Veiculo("ABC1234", "carro", 0));
        pedagioService.registrarPassagem(praca1, new Veiculo("XYZ5678", "moto", 0));
        pedagioService.registrarPassagem(praca1, new Veiculo("DEF2468", "caminhao", 4));

        relatorioService.gerarRelatorio(praca1);
    }
}
