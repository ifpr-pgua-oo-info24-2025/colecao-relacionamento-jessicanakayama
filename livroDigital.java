public class LivroDigital extends Livro {
    private double tamanhoDoArquivoMB;

    public double getTamanhoDoArquivoMB() {
        return tamanhoDoArquivoMB;
    }

    public void setTamanhoDoArquivoMB(double tamanhoDoArquivoMB) {
        this.tamanhoDoArquivoMB = tamanhoDoArquivoMB;
    }

    public void exibirDetalhes() {
        System.out.println("Livro Digital - Título: " + getTitulo() + ", Ano: " + getAnoPublicacao() +
                ", Tamanho: " + tamanhoDoArquivoMB + "MB");
        System.out.println("Autora: " + getAutor().getNome() + ", Nacionalidade: " + getAutor().getNacionalidade());
    }
}
