package ATM_Proje;


import java.text.SimpleDateFormat;
import java.util.*;

public class atmProje {

    static Scanner scanner = new Scanner(System.in);
    private static final String musteriHesapNo = "111111111111";
    private static String musteriSifre = "aaaa";
    private static final String musteriAdi = "Alimiz Canımız ";
    private static final String musteriIban = "TR320010009999901234567890"; //"TR320010009999901234567890";
    private static double bakiye = 5000;
    private static int girisDenemesi = 3;
    private static final Date sonBasariliGiris = new Date();
    private static final List<String> islemler = new ArrayList<>();

    public static void main(String[] args) throws InterruptedException {

        //musteriGiris();
        //anaEkran();
    }

    public static void musteriGiris() throws InterruptedException {
        System.out.println("Lütfen 12 haneli müşteri hesap numaranızı giriniz : ");
        String inputHesapNo = scanner.next();
        while (girisDenemesi > 0) {

            System.out.println("Lütfen 4 haneli müşteri şifrenizi giriniz : ");
            String inputSifre = scanner.next();

            System.out.println("Bilgileriniz kontrol ediliyor, lütfen bekleyiniz.");

            Thread.sleep(1000); // 5 saniye bekleme süresi

            if (inputHesapNo.equals(musteriHesapNo) && inputSifre.equals(musteriSifre)) {
                System.out.println("Sayın " + musteriAdi + "hoş geldiniz.");
                break; // Doğru giriş yapıldığında döngüyü kır
            } else {
                girisDenemesi--;
                System.out.println("Şifreniz hatalıdır, kalan giriş hakkınız: " + girisDenemesi);
            }
        }

        if (girisDenemesi == 0) {
            System.out.println("Hesabınız başarısız 3 giriş denemesinden dolayı bloke olmuştur.");
            //cikisYap();
        }

    }


}

