import java.util.*;

public class ExemploOrdenacaoMap {
    public static void main(String[] args) {
        System.out.println("---\tOrdem Aleatoria\t---");

        Map<String, Livro> meusLivros = new HashMap<>(){{
           put("Hawking, Stephen", new Livro("uma breve Historia do  Tempo", 256));
           put("Duhigg, Charles", new Livro("O poder do Habito", 408));
           put("Harari, Yaval Noah", new Livro("21 Lições Para o Seculo 21", 432));

        }};

        for(Map.Entry<String, Livro> livro: meusLivros.entrySet()){
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }
        System.out.println("\n---\tOrdem Inserção\t---");
        Map<String, Livro> meusLivros1 = new HashMap<>(){{
            put("Hawking, Stephen", new Livro("uma breve Historia do  Tempo", 256));
            put("Duhigg, Charles", new Livro("O poder do Habito", 408));
            put("Harari, Yaval Noah", new Livro("21 Lições Para o Seculo 21", 432));

        }};
        for(Map.Entry<String, Livro> livro: meusLivros1.entrySet()){
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }
        System.out.println("\n---\tOrdem Alfabetica Autores\t---");
        Map<String, Livro> meusLivros2 = new TreeMap<>(meusLivros1);
        for(Map.Entry<String, Livro> livro: meusLivros2.entrySet())
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());

        System.out.println("\n---\tOrdem Alfabetica nomes dos livros\t---");

        Set<Map.Entry<String, Livro>> meusLivros3 =  new TreeSet<>(new ComparatorNome());
        meusLivros3.addAll(meusLivros.entrySet());

        for(Map.Entry<String, Livro> livro: meusLivros3)
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());







    }
}
class Livro {
    private String nome;
    private Integer paginas;


    public Livro(String nome, Integer paginas) {
        this.nome = nome;
        this.paginas = paginas;
    }

    public String getNome() {
        return nome;
    }

    public Integer getPaginas() {
        return paginas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return nome.equals(livro.nome) && paginas.equals(livro.paginas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, paginas);
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", paginas=" + paginas +
                '}';
    }
}
class ComparatorNome implements Comparator<Map.Entry<String, Livro>>{

    @Override
    public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
        return l1.getValue().getNome().compareToIgnoreCase(l2.getValue().getNome());
    }
}