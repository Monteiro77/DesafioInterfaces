package desafio1.model;

public class Jogadora {
    private String nome;
    private int idade;
    private String posicao;
    private int numero;

    public Jogadora(String nome, int idade, String posicao, int numero) {
        this.nome = nome;
        this.idade = idade;
        this.posicao = posicao;
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getPosicao() {
        return posicao;
    }

    public int getNumero() {
        return numero;
    }
}
