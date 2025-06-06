public class LivroFisico extends Livro {
    private int numeroDePaginas;

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public void setNumeroDePaginas(int numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }

    public void exibirDetalhes() {
        System.out.println("Livro Físico - Título: " + getTitulo() + ", Ano: " + getAnoPublicacao() +
                ", Páginas: " + numeroDePaginas);
        System.out.println("Autora: " + getAutor().getNome() + ", Nacionalidade: " + getAutor().getNacionalidade());
    }
}
