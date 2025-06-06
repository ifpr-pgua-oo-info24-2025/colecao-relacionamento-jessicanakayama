import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Livro> biblioteca = new ArrayList<>();

        Autor autora1 = new Autor();
        autora1.setNome("Clarice Lispector");
        autora1.setNacionalidade("Brasileira");

        Autor autora2 = new Autor();
        autora2.setNome("Jane Austen");
        autora2.setNacionalidade("Britânica");

        Autor autora3 = new Autor();
        autora3.setNome("Chimamanda Ngozi Adichie");
        autora3.setNacionalidade("Nigeriana");

        Autor autora4 = new Autor();
        autora4.setNome("Margaret Atwood");
        autora4.setNacionalidade("Canadense");

        LivroFisico livro1 = new LivroFisico();
        livro1.setTitulo("A Hora da Estrela");
        livro1.setAnoPublicacao(1977);
        livro1.setAutor(autora1);
        livro1.setNumeroDePaginas(96);

        LivroDigital livro2 = new LivroDigital();
        livro2.setTitulo("Orgulho e Preconceito");
        livro2.setAnoPublicacao(1813);
        livro2.setAutor(autora2);
        livro2.setTamanhoDoArquivoMB(1.2);

        LivroFisico livro3 = new LivroFisico();
        livro3.setTitulo("Hibisco Roxo");
        livro3.setAnoPublicacao(2003);
        livro3.setAutor(autora3);
        livro3.setNumeroDePaginas(320);

        LivroDigital livro4 = new LivroDigital();
        livro4.setTitulo("O Conto da Aia");
        livro4.setAnoPublicacao(1985);
        livro4.setAutor(autora4);
        livro4.setTamanhoDoArquivoMB(1.8);

        biblioteca.add(livro1);
        biblioteca.add(livro2);
        biblioteca.add(livro3);
        biblioteca.add(livro4);

        for (Livro livro : biblioteca) {
            livro.exibirDetalhes();
            System.out.println();
        }
    }
