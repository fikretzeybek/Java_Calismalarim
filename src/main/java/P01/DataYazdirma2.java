package P01;

import java.util.Scanner;

public class DataYazdirma2 {
    public static void main(String[] args) {
        //Kullanicidan ismini, soyismini ve yasini alip asagidaki formatta yazdirin.
        //girilen bilgiler : J Doe, 44

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen isminizi giriniz");
        char ilkHarf = scanner.next().charAt(0);
        System.out.println("Lutfen soyisminizi giriniz");
        String soyIsim = scanner.next();
        System.out.println("Lutfen yasinizi giriniz");
        int yas = scanner.nextInt();

        System.out.println("Girilen isim : " + ilkHarf + " " +soyIsim + "," + yas );


    }
}
