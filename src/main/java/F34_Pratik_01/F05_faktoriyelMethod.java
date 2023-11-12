package F34_Pratik_01;

import java.util.Scanner;

public class F05_faktoriyelMethod {

    public static void main(String[] args) {

        /*
            Girilen sayının faktöriyelini hesaplayan bir program yazınız.
            Bunu bir method içerisinde yapınız ve return ifadesi ile sonucu geri döndürünüz

            Faktöriyel
            1'den başlayarak belirli bir sayma sayısına  kadar olan sayıların çarpımına
            o sayının faktöriyeli denir.    Örneğin: 6! (6'nın faktöriyeli)

            6 sayısı için
            1 * 1 = 1
            1 * 2 = 2
            1* 2 * 3 = 6
            1* 2 * 3 * 4 = 24
            1* 2 * 3 * 4 * 5 = 120
            1* 2 * 3 * 4 * 5 * 6 = 720



                                            */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Faktoriyel hesabi icin bir sayi giriniz : ");
        int input = scanner.nextInt();

        System.out.println(input + " ! = " + faktoriyelAl(input));

    }

    public static int faktoriyelAl(int sayi) {

        int sonuc = 1;

        for (int i = 1; i <= sayi; i++) {

            sonuc = sonuc * i;

        }

        return sonuc;
    }

}
