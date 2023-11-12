package F35_Proje;

import java.util.Scanner;

public class MMerkez {
    static Scanner scanner = new Scanner(System.in);

    public static void anaMenu() {
        String secenek = "";
        do {
            System.out.println("\t====================================\n" +
                    "\t ÖĞRENCİ VE ÖĞRETMEN YÖNETİM PLATFORMU\n" +
                    "\t====================================\n" +
                    "\t 1- ÖĞRENCİ İŞLEMLERİ\n" +
                    "\t 2- ÖĞRETMEN İŞLEMLERİ\n" +
                    "\t Q- ÇIKIŞ");

            System.out.println("Lutfen Menuden secim yapiniz : ");
            secenek = scanner.nextLine();

            switch (secenek) {
                case "1":
                    break;
                case "2":
                    Ogretmen.ogretmenMenu();
                    break;
                case "q":
                case "Q":
                    break;
                default:
                    System.out.println("Lutfen gecerli bir secim yapiniz : ");
            }


        } while (!secenek.equalsIgnoreCase("q"));

        uygulamaBitir();
    }

    public static void uygulamaBitir() {

        System.out.println("Uygulamadan cikis yapildi ");
        System.exit(0);
    }


}
