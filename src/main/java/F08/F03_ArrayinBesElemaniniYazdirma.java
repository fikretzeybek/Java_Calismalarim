package F08;

import java.util.Random;

public class F03_ArrayinBesElemaniniYazdirma {
    public static void main(String[] args) {
        // 1 ile 10 arası rastgele üretilmiş 20 adet sayı ,
        // her satırda 5 eleman olacak şekilde ekrandan
        // yazdıran bir kod yazınız


        Random random = new Random();

        int maxSayi = 10;
        int sayiAdeti = 20;

        for (int i = 1; i <= sayiAdeti; i++) {
            int rastgeleSayi = random.nextInt(maxSayi);
            System.out.print( rastgeleSayi  + "  " );

            if (i % 5 == 0){
                System.out.println(" ");
            }
        }

    }


}
