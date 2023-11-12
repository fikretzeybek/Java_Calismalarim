package F13;

import java.util.Scanner;

public class F07_CumledekiHarfSayisiniBulma {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Harf sayisini ogrenmek istediginiz bir cumle giriniz  : ");
        String cml = scanner.nextLine();

        int sayac = 0;
        String yeniCml = cml.toLowerCase().replaceAll(" ","");
        System.out.println(yeniCml);

        for (int i = 0; i < yeniCml.length(); i++) {
            sayac ++;

        }
        System.out.println("Girdiginiz cumlenin harf sayisi ==> " + sayac);

    }
}
