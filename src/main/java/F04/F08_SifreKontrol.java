package day11_WhileLoopDoWhileLoop;
import java.util.Scanner;

public class F08_SifreKontrol {
    public static void main(String[] args) {

        /*    Kullanicidan bir sifre isteyip,
               asagidaki sartlari kontrol edin,
               kullaniciya duzeltmesi gereken tum eksikleri soyleyin ve yeni deger isteyin
               eger tum sartlari saglarsa, "sifre basariyla kaydedildi" yazdirin
                - ilk harf kucuk harf olmali
                - son karakter rakam olmali
                - sifre bosluk icermemeli
                - uzunlugu en az 10 karakter olmali */

        Scanner scanner = new Scanner(System.in);
        String sifre;

        while (true) {
            System.out.print("Lütfen bir şifre girin: ");
            sifre = scanner.nextLine();

            if (sifreKontrol(sifre)) {
                System.out.println("Şifre başarıyla kaydedildi.");
                break;
            }
        }

        scanner.close();
    }

    public static boolean sifreKontrol(String sifre) {
        if (sifre.length() < 10) {
            System.out.println("Şifre en az 10 karakter içermelidir.");
            return false;
        }

        char ilkKarakter = sifre.charAt(0);
        char sonKarakter = sifre.charAt(sifre.length() - 1);

        if (!Character.isLowerCase(ilkKarakter)) {
            System.out.println("İlk harf küçük harf olmalıdır.");
            return false;
        }

        if (!Character.isDigit(sonKarakter)) {
            System.out.println("Son karakter bir rakam olmalıdır.");
            return false;
        }

        if (sifre.contains(" ")) {
            System.out.println("Şifre boşluk içeremez.");
            return false;
        }

        return true;
    }
}
