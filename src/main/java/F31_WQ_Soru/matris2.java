package F31_WQ_Soru;

public class matris2 {

    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int satirUzunlugu = matrix.length;
        int sutunUzunlugu = matrix[0].length;
        int satirToplami = 0;
        int sutunToplami = 0;


        for (int i = 0; i < satirUzunlugu; i++) {
            satirToplami = 0;

            for (int j = 0; j < sutunUzunlugu; j++) {
                satirToplami += matrix[i][j];


            }

            System.out.println(i + 1 + ". satirin indexlerinin toplami = " + satirToplami);
        }

        for (int i = 0; i < satirUzunlugu; i++) {
            sutunToplami = 0;

            for (int j = 0; j < sutunUzunlugu; j++) {
                sutunToplami += matrix[j][i];
            }
            System.out.println(i + 1 + ". sutunun indexlerinin toplami = " + sutunToplami);

        }

    }

}