import java.util.ArrayList;
import java.util.List;

public class OrdenaListas {
    public static List<Integer> fusionarListas(List<Integer> lista1, List<Integer> lista2) {
        List<Integer> listaFusionada = new ArrayList<>();
        int indice1 = 0, indice2 = 0;

        while (indice1 < lista1.size() && indice2 < lista2.size()) {
            if (lista1.get(indice1) < lista2.get(indice2)) {
                listaFusionada.add(lista1.get(indice1));
                indice1++;
            } else {
                listaFusionada.add(lista2.get(indice2));
                indice2++;
            }
        }
        while (indice1 < lista1.size()) {
            listaFusionada.add(lista1.get(indice1));
            indice1++;
        }
        while (indice2 < lista2.size()) {
            listaFusionada.add(lista2.get(indice2));
            indice2++;
        }

        return listaFusionada;
    }

    public static void main(String[] args) {
        List<Integer> lista1 = new ArrayList<>();
        List<Integer> lista2 = new ArrayList<>();

        lista1.add(1);
        lista1.add(3);
        lista1.add(5);
        lista1.add(7);

        lista2.add(2);
        lista2.add(4);
        lista2.add(6);
        lista2.add(8);

        List<Integer> listaFusionada = fusionarListas(lista1, lista2);
        System.out.println(listaFusionada);
    }
}
