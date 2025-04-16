package desafio2.model;

import java.time.LocalDate;

public class Atendimento {
    private LocalDate data;
    private String tipo;
    private String profissional;

    public Atendimento(LocalDate data, String tipo, String profissional) {
        this.data = data;
        this.tipo = tipo;
        this.profissional = profissional;
    }

    // Getters e Setters

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getProfissional() {
        return profissional;
    }

    public void setProfissional(String profissional) {
        this.profissional = profissional;
    }
}
