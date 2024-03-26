import java.util.ArrayList;
import java.util.List;

public class Catalogo {
    List<Livro> catalogoLivros;

    public Catalogo() {
        setCatalogoLivros();
    }

    public void setCatalogoLivros() {
        this.catalogoLivros = new ArrayList<>();
    }

    public List<Livro> getCatalogoLivros() {
        return catalogoLivros;
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        catalogoLivros.add(new Livro(titulo,autor,anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) throws LivroNaoEncontradoException{
        List<Livro> livrosEscritos = new ArrayList<>();
        for(Livro l : catalogoLivros){
            if(l.getAutor().equalsIgnoreCase(autor))
                livrosEscritos.add(l);
        }
        if(livrosEscritos.isEmpty())
            throw new LivroNaoEncontradoException();
        return livrosEscritos;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) throws LivroNaoEncontradoException{
        List<Livro> livrosIntervalo = new ArrayList<>();
        for(Livro l : catalogoLivros){
            if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal)
                livrosIntervalo.add(l);
        }
        if(livrosIntervalo.isEmpty())
            throw new LivroNaoEncontradoException();
        else
            return livrosIntervalo;
    }

    public Livro pesquisarPorTitulo(String titulo) throws LivroNaoEncontradoException{
        for (Livro l : catalogoLivros) {
            if (l.getTitulo().equalsIgnoreCase(titulo))
                return l;
        }
        throw new LivroNaoEncontradoException();
    }
}
