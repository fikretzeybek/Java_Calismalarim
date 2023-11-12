package F10;

import java.util.Arrays;
import java.util.Scanner;

public class F02_KullaniciArrListOlustursun {
    public static void main(String[] args) {

        //Example 3: Kullanici ile beraber bir Array olusturunuz ve icine data ekleyiniz.
        //Bir ogretmenin sinifindaki ogrencilerin isimlerini application'a yuklemesini saglayan kodu yaziniz.


        Scanner input = new Scanner(System.in);
        System.out.println("Kac ogrenci ismi gireceksiniz");
        int isim = input.nextInt();

        String names[] = new String[isim];

        System.out.println("Girisi sonlandirmak icin Q harfine basiniz.");

        for (int i = 1; i <= isim; i++) {


            System.out.println("Lutfen " + i + ". ogrenci isminiz giriniz");

            String ogrenciIsimleri = input.next();

            if (ogrenciIsimleri.equalsIgnoreCase("Q")) {
                break;
            }

            names[i - 1] = ogrenciIsimleri;// [i-1] ==> 0'inci indexi alabilmek ici i-1 yazdik


        }
        System.out.println(Arrays.toString(names));

    }
}
