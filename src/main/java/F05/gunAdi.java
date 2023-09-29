package F05;

import java.util.Scanner;

public class gunAdi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String gunAdi;

        while (true) {
            System.out.print("Lütfen bir gün adı girin veya çıkmak için 'esc' tuşuna basın: ");
            String giris = scanner.nextLine().toLowerCase();

            if (giris.equals("esc")) {
                break;
            }

            gunAdi = giris;

            if (gunAdi.equals("pazartesi")) {
                System.out.println("Simdi calisma zamani, tatile 4 gün var.");
            } else if (gunAdi.equals("salı")) {
                System.out.println("Simdi calisma zamani, tatile 3 gün var.");
            } else if (gunAdi.equals("çarşamba")) {
                System.out.println("Simdi calisma zamani, tatile 2 gün var.");
            } else if (gunAdi.equals("perşembe")) {
                System.out.println("Simdi calisma zamani, tatile 1 gün var.");
            } else if (gunAdi.equals("cuma")) {
                System.out.println("Simdi calisma zamani, tatile 0 gün var.");
            } else if (gunAdi.equals("cumartesi") || gunAdi.equals("pazar")) {
                System.out.println("Simdi dinlenme zamani.");
            } else {
                System.out.println("Geçersiz gün adı girdiniz.");
            }
        }


    }
}

