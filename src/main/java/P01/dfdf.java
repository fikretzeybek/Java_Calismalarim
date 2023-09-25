package P01;


import java.util.Scanner;

public class dfdf {
    public static void main(String[] args) {
        String str1="Common Lang";
        String str2=null;
        String str3="";
        String str4=new String();
        System.out.println(str4.isBlank());

        // Split ile metni parçalarız

        String S1 = "Merhaba Java Dersi";
        String[] kelime = S1.split(" ");

        System.out.println(kelime[0].charAt(1)); // Merhaba
        System.out.println(kelime[1].charAt(2)); // Java
        System.out.println(kelime[2].charAt(1)); // Dersi

        // compareTo Normal Karşılaştırır
        // compareToIgnoreCase Büyük-Küçük Harf Ayrımı Yapmaz

        String S01 = "ABC";
        String S02 = "ABc";


        System.out.println(S02.compareTo(S1));
        System.out.println(S02.compareToIgnoreCase(S1));

        // replace() ilk parametresi hedef kelime
        // ikinci parametresi yeni kelime olarak doldurulur

        String S11 = "Merhaba Dünya Nasılsın? ";
        System.out.println(S11.replace("Nasılsın?", "Selam")); // Geçici Değişiklik
        S11 = S11.replace("Nasılsın?", "Selam"); // Kalıcı Değişiklik
        System.out.println(S11);

        // substring bize metnin hedeflediğimiz kısmını verir
        // ilk indis dahildir, son indis dahil değildir
        // Yani son indisteki karakteri göz önüne almaz

        String S21 = "Merhaba Dünya";

        System.out.println(S21.substring(8));
        // Başlangıç indisten sonrasını parçalamak
        System.out.println(S21.substring(0,7));
        // İki hedef indis arasını parçalamak
        System.out.println(S21.substring(4,11).toUpperCase());

        // String.valueOf metodu sayısal, karakter, object bir veriyi Stringe dönüştürür

        String S31 = "";

        int sayi1 = 45;
        float sayi2 = 50.5f;

        S31 = String.valueOf(sayi1);
        S31 = String.valueOf(sayi2);
        System.out.println(S31.charAt(0));



    }
}
