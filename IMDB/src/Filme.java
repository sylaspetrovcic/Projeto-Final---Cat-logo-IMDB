public class Filme {
    public Object add;
    private String titulo;
    private String genero;
    private String[] elenco;
    private int duracao;
    private String diretor;


    public Filme(String titulo, String genero, String[] elenco, int duracao, String diretor) {
        this.titulo = titulo;
        this.elenco = elenco;
        this.duracao = duracao;
        this.diretor = diretor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public String[] getElenco() {
        return elenco;
    }

    public int getDuracao() {
        return duracao;
    }

    public String getDiretor() {
        return diretor;
    }
}
