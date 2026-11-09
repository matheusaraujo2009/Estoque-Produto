package main;

public class Series {
    private String nome;
    private String plataforma;

    public Series(String nome, String platarforma) {
        this.nome = nome;
        this.plataforma = platarforma;
    }

    public Series(String nome) {
        this.nome = nome;
        this.plataforma = "Plataforma Indefinida";
    }

    @Override
    public String toString() {
        return "Series{" +
                "nome='" + nome + '\'' +
                ", plataforma='" + plataforma + '\'' +
                '}';
    }
}
