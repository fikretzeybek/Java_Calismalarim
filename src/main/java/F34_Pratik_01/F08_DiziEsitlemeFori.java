package F34_Pratik_01;


import java.util.Arrays;

public class F08_DiziEsitlemeFori {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 3, 2, 4, 1, 1, 3, 2, 4, 3, 2, 2, 3, 1};
        int referansDeger = 3;

        diziEsitle(arr, referansDeger);

        System.out.println("Dizi esitlenmis olarak : " + Arrays.toString(arr));
    }

    public static int[] diziEsitle(int[] arr, int referansDeger) {

        for (int i = 0; i < arr.length; i++) {
                 //Dizinin herbir elementini tek tek ele alalim

            if (arr[i] == referansDeger) {
                // Eleman zaten referans değere eşitse bir şey yapmayın

            } else if (arr[i] < referansDeger) {
                // Eleman referans değerinden küçükse 2 olana kadar artırın
                while (arr[i] < referansDeger) {
                    arr[i]++;
                }

            } else {
                // Eleman referans değerinden büyükse 2 olana kadar azaltın
                while (arr[i] > referansDeger) {
                    arr[i]--;
                }
            }
        }
        return arr;
    }


}
