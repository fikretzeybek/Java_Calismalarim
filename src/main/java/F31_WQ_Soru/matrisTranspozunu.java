package F31_WQ_Soru;


public class matrisTranspozunu {
    public static void main(String[] args) {


        /*Soru 1:
Matrisin Transpozunu Yazdir
Bir matrisin transpozu, satırları sütunla değiştirerek bulunabilir;
yani orijinal matrisin satırları, yeni matrisin sütunları haline gelecektir.
verilen matris
1 2 3
4 5 6
7 8 9
ise
Beklenilen output
transpozu:
1 4 7
2 5 8
3 6 9

seklinde olmalidir*/


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
