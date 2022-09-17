package model;

import java.util.Objects;

public class Livro {
    private String nome;
    private String numPaginas;

    //gets and setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNumPaginas() {
        return numPaginas;
    }
    public void setNumPaginas(String numPaginas) {
        this.numPaginas = numPaginas;
    }

    //construtor com parametros
    public Livro(String nome, String numPaginas) {
        this.nome = nome;
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", numPaginas='" + numPaginas + '\'' +
                '}';
    }
}

