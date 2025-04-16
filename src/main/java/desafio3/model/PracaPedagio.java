package desafio3.model;

import java.util.ArrayList;
import java.util.List;

public class PracaPedagio {
    private String localizacao;
    private double tarifaBase;
    private List<RegistroPassagem> registros = new ArrayList<>();

    public PracaPedagio(String localizacao, double tarifaBase) {
        this.localizacao = localizacao;
        this.tarifaBase = tarifaBase;
    }

    public String getLocalizacao() { return localizacao; }
    public double getTarifaBase() { return tarifaBase; }

    public void registrarPassagem(Veiculo veiculo) {
        double valor = calcularValor(veiculo);
        registros.add(new RegistroPassagem(veiculo, valor));
    }

    public double calcularValor(Veiculo veiculo) {
        return switch (veiculo.getTipo()) {
            case "carro" -> tarifaBase;
            case "moto" -> tarifaBase * 0.5;
            case "caminhão", "caminhao" -> tarifaBase * veiculo.getEixos();
            default -> 0;
        };
    }

    public List<RegistroPassagem> getRegistros() {
        return registros;
    }

    public double getTotalArrecadado() {
        return registros.stream().mapToDouble(RegistroPassagem::getValor).sum();
    }
}
