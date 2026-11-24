import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TesteOrdenacao {

    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("Notebook", 3500.00));
        produtos.add(new Produto("Mouse", 89.90));
        produtos.add(new Produto("Teclado", 199.90));
        produtos.add(new Produto("Monitor", 899.00));

        System.out.println("===== Lista original =====");
        for (Produto produto : produtos) {
            System.out.println(produto);
        }

        System.out.println();
        System.out.println("===== Ordenada por preço (menor para maior) =====");
        ListaUtil.ordenarExibir(produtos);

        // O mesmo método genérico também funciona com outros tipos
        System.out.println();
        System.out.println("===== Mesmo método com List<Integer> =====");
        List<Integer> numeros = new ArrayList<>(Arrays.asList(42, 7, 19, 3));
        ListaUtil.ordenarExibir(numeros);
    }
}
