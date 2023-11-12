package F34_Pratik_01;

import java.util.Arrays;

public class F07_DiziEsitlemeForEach {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 3, 2, 4, 1, 1, 3, 2, 4, 3, 2, 2, 3, 1};
        int referansDeger = 2;

        diziEsitle(arr, referansDeger);

        System.out.println("Dizi: " + Arrays.toString(arr));
    }

    public static int[] diziEsitle(int[] arr, int referansDeger) {

        for (int each : arr) {

            if (each == referansDeger) {// Each referans değere eşitse işlem yok

            } else if (each < referansDeger) {// Each referans değerinden küçükse
                                              // referans deger olana kadar artırıyoruz
                while (each < referansDeger) {
                    each++;
                }

            } else {// Each referans değerinden büyükse referans deger olana kadar azaltıyoruz
                while (each > referansDeger) {
                    each--;
                }
            }
        }
        return arr;
    }
}
