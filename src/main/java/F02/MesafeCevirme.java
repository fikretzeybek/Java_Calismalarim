package F02;

import java.util.Scanner;

public class MesafeCevirme {
    public static void main(String[] args) {
        /*
      Kullanicidan mesafeyi kilometre olarak alin ve cevirmek istedigi birimi
      sorun, istedigi birim metre veya santimetre ise cevirip yazdirin, yoksa
      "istediginiz birim sisteme kayitli degil" yazdirin.
 */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen mesafeyi kilometre olarak giriniz :");
        int mesafe = scanner.nextInt();

        System.out.println("Lutfen kilometreyi cevirmek istediginiz birimi giriniz : \nMetre : 'm' \nSantimetre : 's'");
        char birim = scanner.next().toLowerCase().charAt(0);

        if (birim == 'm') {
            System.out.println("Girdiginiz kilometrenin metre olarak degeri : " + mesafe * 1000 + " metredir");

        } else if (birim == 's') {
            System.out.println("Girdiginiz kilometrenin santimetre olarak degeri : " + mesafe * 100000 + " santimetredir");

        } else {
            System.out.println("Hatali giris yaptiniz, lutfen tekrar giriniz");
        }


    }
}
