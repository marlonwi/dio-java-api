import java.util.Scanner;
public class Main {
    public static int opcao;
    public static String pesquisa;
    public static int anoInicial;
    public static int anoFinal;
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        // Criando uma instância do catálogo de livros
        Catalogo catalogoLivros = new Catalogo();

        // Adicionando livros ao catálogo
        catalogoLivros.adicionarLivro("Microsserviços Prontos Para a Produção", "Susan J. Fowler", 2017);
        catalogoLivros.adicionarLivro("Java Guia do Programador", "Peter Jandl Junior", 2021);
        catalogoLivros.adicionarLivro("Código Limpo", "Robert C. Martin", 2009);
        catalogoLivros.adicionarLivro("O Codificador Limpo", "Robert C. Martin", 2012);

        do {
            System.out.println("-----------Menu de opções-----------");
            System.out.println("Opção 1: Pesquisar livro(s) pelo nome do autor");
            System.out.println("Opção 2: Pesquisar livro(s) de um intervalo de tempo");
            System.out.println("Opção 3: Pesquisar livro(s) pelo título");
            System.out.println("Opção 4: Sair");
            System.out.println("Digite sua opção: ");
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    scanner.nextLine();
                    System.out.println("Digite o nome do autor: ");
                    pesquisa = scanner.nextLine();
                    try {
                        System.out.println(catalogoLivros.pesquisarPorAutor(pesquisa));
                    } catch (LivroNaoEncontradoException e) {
                        System.out.println("Livros não encontrados!!!");
                    }
                    break;
                case 2:
                    scanner.nextLine();
                    System.out.println("Digite o ano inicial: ");
                    anoInicial = scanner.nextInt();
                    System.out.println("Digite o ano final: ");
                    anoFinal = scanner.nextInt();
                    try {
                        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(anoInicial, anoFinal));
                    } catch (LivroNaoEncontradoException e) {
                        System.out.println("Livros não encontrados!!S!");
                    }
                    break;
                case 3:
                    scanner.nextLine();
                    System.out.println("Digite o título do livro: ");
                    pesquisa = scanner.nextLine();
                    try {
                        System.out.println(catalogoLivros.pesquisarPorTitulo(pesquisa));
                    } catch (LivroNaoEncontradoException e) {
                        System.out.println("Livro não encontrados!!!");
                    }
                    break;
                case 4:
                    System.out.println("Finalizando!!!");
            }
        } while (opcao != 4);
    }
}

