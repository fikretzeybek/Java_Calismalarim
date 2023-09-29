package F03;

import java.util.Scanner;

public class ArananHarf {
    public static void main(String[] args) {
        /*
    Verilen bir kelime 2 ile 4 arasında 'a'karakter iceriyorsa dogru, icermiyorsa yanlıs

    kullanıcıdan bir kelime veya cümle alacağız
    kelime veya cümle içerisinde hangi harfi aratmak istediğini soracağız
    daha sonra aratmak istediği harf kelimede veya cümlede olup olmadığını söyleyeceğiz
    eğer varsa kaç tane harf olduğunu söyleyeceğiz.

    Program çıktısı
    -Bir kelime veya cümle giriniz
    --Java Candır.
    -Hangi harfi aratmak istiyorsunuz
    --a
    --a harfi cümlede mevcut
    --a harfinden cümlede 3 tane a harfi var.

    */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen bir kelime veya cümle giriniz"); //Java Candır
        String girilenMetin = scanner.nextLine();
        System.out.println("Aratmak istediğiniz harfi giriniz");//a
        char arananHarf = scanner.next().charAt(0);

        int sayac = 0;

        for (int i = 0; i < girilenMetin.length(); i++) {

            if (girilenMetin.charAt(i) == arananHarf) {

                sayac++;

            }

        }
        System.out.println("Girilen metinde " + arananHarf + " harfi " + sayac + " tanedir");


    }


}