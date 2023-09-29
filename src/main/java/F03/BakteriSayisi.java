package F03;

import java.util.Scanner;

public class BakteriSayisi {
    public static void main(String[] args) {
        // Bir tane bakteri var ve bu bakteri her bir saatte 2 ye bölunup 2 bakteri olusturuyor.
        // her bir saatte kac tane bakteri olustugunu

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen saat sayisini giriniz");
        int saat = scanner.nextInt();

        int ilkBakteri = 1;

        int toplamBakteriSayisi = 0;


        for (int ilkSaat = 1; ilkSaat <= saat; ilkSaat++) {

            ilkBakteri *= 2;

            toplamBakteriSayisi = ilkBakteri;

            System.out.println(ilkSaat + " saatteki bakteri sayisi: " + toplamBakteriSayisi);
        }


    }
}
