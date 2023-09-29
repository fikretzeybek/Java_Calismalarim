package F08;

import java.util.Random;

public class F02_ArraydaEnBuyukSayiBul_Random {
    public static void main(String[] args) {
        //10 elemanlı bir tamsayı dizisine 1 ile 100 arasında
        //rastgele sayılar yerleştirildikten sonra bu sayılardan en
        //büyüğünü bulup yazdıran programı yazınız

        int[] sayilar = new int[10];
        Random random = new Random();

        for (int i = 0; i < sayilar.length; i++) {
            sayilar[i] = random.nextInt(100);
        }

        int enBuyukSayi = sayilar[0];
        for (int j = 1; j < 10; j++) {

            if (sayilar[j] > enBuyukSayi) enBuyukSayi = sayilar[j];
        }
        System.out.println("En buyuk sayi = " + enBuyukSayi);

    }
}
