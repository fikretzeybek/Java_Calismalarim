package F15;

import java.util.Random;

public class F01_MatrixKoseToplama {
    public static void main(String[] args) {

        int[][] matrixBesli = new int[5][5];
        Random random = new Random();

        for (int i = 0; i < matrixBesli.length; i++) {
            for (int j = 0; j < matrixBesli[i].length; j++) {
                matrixBesli[i][j] = random.nextInt(10);
                System.out.print(matrixBesli[i][j] + "\t");
            }
            System.out.println();

        }

        int kosegen1 = 0;
        for (int i = 0; i < matrixBesli.length; i++) {
            kosegen1 += matrixBesli[i][i];
        }

        int kosegen2 = 0;
        int ikinci = matrixBesli[0].length - 1;
        for (int i = 0; i < matrixBesli.length; i++) {

            kosegen2 += matrixBesli[i][ikinci - i];
            System.out.print(kosegen2);
        }
        System.out.println("Ilk Kosegen Toplami :" + kosegen1);
        System.out.println("Ikinci Kosegen Toplami :" + kosegen2);

    }
}
