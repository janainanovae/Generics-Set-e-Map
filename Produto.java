import java.util.Locale;

// Comparable<Produto>: define a "ordem natural" dos produtos
public class Produto implements Comparable<Produto> {

    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    // Ordena pelo preço, do menor para o maior
    @Override
    public int compareTo(Produto outro) {
        return Double.compare(this.preco, outro.preco);
    }

    @Override
    public String toString() {
        return String.format(Locale.forLanguageTag("pt-BR"),
                "Produto: %s | Preço: R$ %.2f", nome, preco);
    }
}
