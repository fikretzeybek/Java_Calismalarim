package P05;

import java.util.Scanner;

public class SifreKOntrolu {
    public static void main(String[] args) {


    /*
Kullanicidan  sifre isteyin asagidaki sartlari saglamayan
sifrelerde hatalari yazdirip, kullanicinin yeni sifre girmesi isteyin
Gecerli bir sifre yazilincaya kadar bu islemi tekrar edin gecerli sifre
yazilinca “sifreniz basari ile kaydedildi” yazdirin

   1-  Kullanicidan  sifre isteyin = javaCAndir123

   2- Şartların kontrol edilmesi
   2.1- İlk karakter küçük olmalı
   2.2- Son karakter rakam olmalı
   2.3- Boşluk içermemeli
   2.4- Özel karakter içermeli
   2.5- Uzunluğu 8 karakterden uzun olmalı

   3- Gecerli değilse tekrar şifre iste
   4- Geçerliyse “sifreniz basari ile kaydedildi” yazdirin   */

        Scanner scanner = new Scanner(System.in);
        String sifre = "";
        boolean dogruMU = false;
        char ilkHarf;
        char sonHarf;

        while (!dogruMU) {
            System.out.println("Şifrenizi belirleyin:");
            sifre = scanner.nextLine();
            ilkHarf = sifre.charAt(0);
            sonHarf = sifre.charAt(sifre.length() - 1);

            if (ilkHarf < 'a' || ilkHarf > 'z') {
                System.out.println("İlk karakter küçük olmalı");

            } else if (sonHarf < '0' || sonHarf > '9') {
                System.out.println("Son karakter rakam olmalı");

            } else if ((sifre.contains(" "))) {
                System.out.println("Boşluk içermemeli");

            } else if (!(sifre.contains("[@#$%^&*()_+-=[]{};':,/,|.<>?]+") )) {
                System.out.println("Özel karakter içermeli");

            } else if (!(sifre.length() >= 8)) {
                System.out.println("Uzunluğu 8 karakterden uzun olmalı");

            } else {
                System.out.println("Şifreniz oluşturuldu");
                dogruMU = true;

            }
        }


    }

}

