package F24;

import java.util.HashSet;
import java.util.Set;

public class F01_IteratorTekrarsizlariYazdirma {

    public static void main(String[] args) {

        int[] arr = {2, 4, 6, 4, 1, 2, 5, 7, 9, 4, 5, 7, 2, 6, 8, 2, 1};

        // Tekrarsiz elementleri saklayan Set olusturun

        Set<Integer> tekrarsiz = new HashSet<>();

        // Arrayi set'e ekleyin
        for (int element : arr) {
            tekrarsiz.add(element);
        }
        //Iterator olusturun

        // Iterator kullanarak tekrarsız elemanları yazdirin
        for (Integer integer : tekrarsiz) {
            if (integer.equals(tekrarsiz.toArray()[tekrarsiz.size() - 1])) {
                System.out.print(integer);
            } else {
                System.out.print(integer + ",");
            }
        }
    }
}