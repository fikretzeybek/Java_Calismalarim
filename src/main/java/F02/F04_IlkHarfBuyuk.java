package F02;

import java.util.Scanner;

public class F04_IlkHarfBuyuk {
    public static void main(String[] args) {
        //Soru 2-Kullanicidan main method icinde  ayri ayri isim ve soyismini alin
        //Isim ve soyismi ilk harfleri buyuk diger harfler kucuk olacak sekilde duzenleyip,
        //isim bosluk soyisim seklinde bize donduren bir method olusturun
        //input: isim : Ali  soyisim :YILMAZ.     output : Ali Yilmaz

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen Isminizi Giriniz:");
        String isim= scanner.nextLine();

        System.out.println("Lutfen Soyisminizi Giriniz:");
        String soyisim= scanner.nextLine();

        System.out.println(isimSoyisim(isim,soyisim));

    }
    public static String isimSoyisim(String a,String b) {
        a = a.substring(0, 1).toUpperCase() + a.substring(1).toLowerCase();
        b = b.substring(0, 1).toUpperCase() + b.substring(1).toLowerCase();


        return a+ " " + b;
    }
}
