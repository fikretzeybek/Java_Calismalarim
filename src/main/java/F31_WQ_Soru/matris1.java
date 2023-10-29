package F31_WQ_Soru;


public class matris1 {
    public static void main(String[] args) {

        int[][] matris = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] devrikMatris = new int[matris.length][matris[0].length];

        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[i].length; j++) {

                devrikMatris[i][j] = matris[j][i];

                System.out.print(devrikMatris[i][j] + " ");

            }
            System.out.println();

        }
    }
}
