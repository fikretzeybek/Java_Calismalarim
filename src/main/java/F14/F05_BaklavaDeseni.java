package F14;

public class F05_BaklavaDeseni {
    public static void main(String[] args) {
    /*
        Yıldızlar (*) ile baklava deseni oluşturabileceğiniz bir kod yazınız.
        Sonuç böyle olmalıdır;

               *                     * * * *                         *
              * *                     * * *                         * *
             * * *                     * *                         * * *
            * * * *                     *                         * * * *
           * * * * *                                             * * * * *
            sekil 1                   sekil 2                     * * * *
                                                                   * * *
                                                                    * *
                                                                     *
                                                               ekran goruntusu

           şeklini konsola yazdiriniz.       */

        int desenUzunluk = 5;

        // sekil 1'e ait kodlama
        for (int i = 1; i <= desenUzunluk; i++) {
            for (int j = 1; j <= desenUzunluk - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        // sekil 2'ye ait kodlama
        for (int i = desenUzunluk - 1; i >= 1; i--) {
            for (int j = 1; j <= desenUzunluk - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(" *");
            }

            System.out.println();
        }
    }
}
