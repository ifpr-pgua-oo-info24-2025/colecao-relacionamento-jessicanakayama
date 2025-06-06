public class Livro {
    private String titulo;
    private int anoPublicacao;
    private Autor autor;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public void exibirDetalhes() {
        System.out.println("Título: " + titulo + ", Ano: " + anoPublicacao);
        System.out.println("Autora: " + autor.getNome() + ", Nacionalidade: " + autor.getNacionalidade());
    }
}
