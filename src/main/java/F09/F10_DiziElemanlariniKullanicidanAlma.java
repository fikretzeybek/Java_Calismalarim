package F09;

import java.util.Scanner;

public class F10_DiziElemanlariniKullanicidanAlma {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Dizinizin eleman sayisini giriniz :");
        int diziUzunluk = scanner.nextInt();
        scanner.nextLine();

        String[] isimler = new String[diziUzunluk];

        for (int i = 0; i < isimler.length; i++) {
            System.out.println("Dizinizin " + (i) + ". index degerini giriniz : ");
            isimler[i] = scanner.nextLine();
        }
        for (String w : isimler) {
            System.out.println("\n" + w);

        }

    }

}

