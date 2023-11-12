package F35_Proje;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Ogretmen {

    static Scanner scanner = new Scanner(System.in);
    static Map<String, String> ogretmenMap = new HashMap<>();

    public static void ogretmenDatasi() {
        ogretmenMap.put("12345698741", "Deniz, Nevfel, Edebiyat");
        ogretmenMap.put("12345698742", "Samet, Yıldırım, Fizik");
        ogretmenMap.put("12345698743", "Omer, Faruk, Kimya");
        ogretmenMap.put("12345698744", "Mehmet, Aydemir, Kimya");
        ogretmenMap.put("12345698745", "Berivan, Salman, İngilizce");
    }
    public static void ogretmenMenu() {
        String secenek ;

        do {

            System.out.println("=====OGRETMEN MENU=====\n" +
                    "1- Ekleme\n" +
                    "2- Kimlik No lle Silme\n" +
                    "3- Kimlik No lle Arama\n" +
                    "4- Listeleme\n" +
                    "A- ANAMENU\n");

            System.out.println("Lutfen Menuden secim yapiniz : ");
            secenek = scanner.nextLine();

            switch (secenek) {
                case "1":
                    ogretmenEkle();
                    break;
                case "2":
                    kimliknoIleSilme();
                    break;
                case "3":
                    kimliknoIleArama();
                    break;
                case "4":
                    listeYazdir();
                    break;
                case "a":
                case "A":
                    MMerkez.anaMenu();
                    break;
                default:
                    System.out.println("Lutfen gecerli bir secim yapiniz : ");
            }

        } while (!secenek.equalsIgnoreCase("a"));
        MMerkez.anaMenu();
    }

    public static void ogretmenEkle() {
        System.out.println("Tc No");
        String tcNo = scanner.nextLine();
        System.out.println("Ad");
        String ad = scanner.nextLine();
        System.out.println("Soyad");
        String soyAd = scanner.nextLine();
        System.out.println("Brans");
        String brans = scanner.nextLine();

        String eklenecekValue = ad + ", " + soyAd + ", " + brans;
        ogretmenMap.put(tcNo,eklenecekValue);
    }
    public static void kimliknoIleSilme() {
        System.out.println("Silmek istediginiz kisinin Kimlik Nosunu giriniz : ");
        String girilenKimlikno = scanner.nextLine();

        String arananValue = ogretmenMap.remove(girilenKimlikno);

        if (arananValue == null){
            System.out.println(girilenKimlikno + "  kayitlarinizda mevcut degildir ");
        }else System.out.println(arananValue + "  kayitlarinizdan silinmiştir");


    }

    public static void kimliknoIleArama() {
        System.out.println("Aramak istediginiz kisinin Kimlik Nosunu giriniz : ");
        String girilenKimlikno = scanner.nextLine();

        String arananValue = ogretmenMap.get(girilenKimlikno);
        System.out.println(arananValue);

        if (arananValue == null){
            System.out.println(girilenKimlikno + "Kayitlarda mevcut degildir ");
        }
    }

    public static void listeYazdir() {
        Set<Map.Entry<String, String>> ogretmenEntry = ogretmenMap.entrySet();
        System.out.println("=================OGRETMEN LISTESI==========\n" +
        "TC No           Ad         Soyad          Brans ");

        for (Map.Entry<String, String> each :ogretmenEntry
             ) {
            String eachKey = each.getKey();
            String eachValue = each.getValue();

            String[] eachValueArr = eachValue.split(", ");
            System.out.printf("%11s    %-8s   %-8s       %s \n" , eachKey, eachValueArr[0] ,
                                eachValueArr[1] , eachValueArr[2]);

        }




    }
}
