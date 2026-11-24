import java.util.Collections;
import java.util.List;

public class ListaUtil {

    // Método genérico: funciona para List<T> de qualquer tipo T que saiba se comparar (Comparable).
    // Esse limite (T extends Comparable) é necessário porque Collections.sort precisa comparar os itens.
    public static <T extends Comparable<? super T>> void ordenarExibir(List<T> lista) {
        Collections.sort(lista);

        for (T item : lista) {
            System.out.println(item);
        }
    }
}
