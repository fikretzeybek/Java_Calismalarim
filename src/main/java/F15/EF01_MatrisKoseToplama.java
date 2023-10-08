package F15;

public class EF01_MatrisKoseToplama {
    public static void main(String[] args) {
          /*
         5*5 bir matris olusturun ve bu matrisin elemanları 0 - 9 arasında rastgele sayılar olsun.
         rastgele sayilar icin Math class'indan Math.random() kullanabilirsiniz :)
         kosegen toplamlarini yazdirin
         */
        //ic ice array int
        int[][] matrix = new int[5][5];
        int toplam = 0;
        int toplam2 = 0;

        for (int satir = 0; satir < 5; satir++) {

            for (int sutun = 0; sutun < 5; sutun++) {
                matrix[satir][sutun] = (int) (Math.random() * 10);
                System.out.print(matrix[satir][sutun] + " ");
                // 1. kosegenin formulu
                if (satir == sutun) {
                    toplam += matrix[satir][sutun];
                }
                // 2. kosegenin formulu
                if (satir + sutun == 4) {
                    toplam2 += matrix[satir][sutun];
                }

            }
            System.out.println();
        }
        System.out.println("1. kosegen toplami --> " + toplam);
        System.out.println("2. kosegen toplami --> " + toplam2);

    }
}
