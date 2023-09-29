package F03;

import java.util.Scanner;

public class SesliSessizHarfSayisi {// Bugun EVE dogru giderken gordugum bir maNZARA aklimda kaldi.

    public static void main(String[] args) {


        SesliMiSessizMi();

    }

    public static void SesliMiSessizMi() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen sesli ve sessiz harf sayilarini ogrenmek istediginiz bir cumle giriniz : ");
        String cumle = scanner.nextLine().toLowerCase();

        int sesliHarfSayisi = 0;
        int sessizHarfSayisi = 0;


        for (int i = 0; i < cumle.length(); i++) {

            char karakter = cumle.charAt(i);

            if (Character.isLetter(karakter)) {

                if ("aeıioöuü".contains(String.valueOf(karakter))) {

                    sesliHarfSayisi++;

                } else {

                    sessizHarfSayisi++;

                }
            }
        }

        System.out.println("Girilen metnin length'i : " + cumle.length());
        System.out.println("Sesli harf sayısı: " + sesliHarfSayisi);
        System.out.println("Sessiz harf sayısı: " + sessizHarfSayisi);
        System.out.println("Harfler disindaki tum karakterler : " + (cumle.length() - (sesliHarfSayisi + sessizHarfSayisi)));
    }

public static String sehirVer(){

       return "van";

}

}
