package F30_ATM_Proje;


import java.text.SimpleDateFormat;
import java.util.*;


public class atmProje {

    static Scanner scanner = new Scanner(System.in);
    private static final String musteriHesapNo = "1";
    private static String musteriSifre = "1";
    private static final String musteriAdi = "Ali Can ";
    private static final String eftIban = "TR430010001111610045010011"; //"TR430010001111610045010011";
    private static double bakiye = 5000;
    private static int girisDenemesi = 3;
    private static final Date sonBasariliGiris = new Date();
    private static final List<String> islemler = new ArrayList<>();

    public static void main(String[] args) throws InterruptedException {

        musteriGiris();
        anaEkran();
    }

    private static void musteriGiris() throws InterruptedException {
        System.out.println("Lütfen 10 haneli müşteri hesap numaranızı giriniz : ");
        String inputHesapNo = scanner.next();
        while (girisDenemesi > 0) {

            System.out.println("Lütfen 4 haneli müşteri şifrenizi giriniz : ");
            String inputSifre = scanner.next();

            System.out.println("Şifreniz kontrol ediliyor, lütfen bekleyiniz..");

            Thread.sleep(1000); // 5 saniye bekleme süresi

            if (inputHesapNo.equals(musteriHesapNo) && inputSifre.equals(musteriSifre)) {
                System.out.println("Sayın " + musteriAdi );
                break;// Doğru giriş yapıldığında döngüyü kır
            } else {
                girisDenemesi--;
                System.out.println("Şifreniz hatalıdır, kalan giriş hakkınız: " + girisDenemesi);
            }
        }
        if (girisDenemesi == 0) {
            System.out.println("\nHesabınız başarısız 3 giriş denemesinden dolayı bloke olmuştur.\n");

            cikisYap();
            System.exit(0);

        }
    }

    private static void anaEkran() throws InterruptedException {
        System.out.println("=====GELBANK ATM'YE HOŞGELDİNİZ=====\n");
        System.out.println("===Lütfen Yapmak İstediğiniz İşlemi Seçiniz===\n");
        System.out.println("[1] Bakiye Sorgulama");
        System.out.println("[2] Para Çekme");
        System.out.println("[3] Para Yatırma");
        System.out.println("[4] Para Gönderme");
        System.out.println("[5] Şifre Değiştirme");
        System.out.println("[6] Çıkış Yapma");

        int secim = scanner.nextInt();

        switch (secim) {
            case 1:
                bakiyeSorgula();
                break;
            case 2:
                paraCek();
                break;
            case 3:
                paraYatir();
                break;
            case 4:
                paraGonder();
                break;
            case 5:
                sifreDegistir();
                break;
            case 6:
                cikisYap();
                break;
            default:
                System.out.println("Geçersiz işlem seçimi. Lütfen tekrar deneyin.");
                anaEkran(); // Geçersiz seçim, tekrar anaEkranı çağırır
                break;
        }
    }

    private static void bakiyeSorgula() throws InterruptedException {

        SimpleDateFormat sonTarih = new SimpleDateFormat("dd.MM.yyyy");

        Calendar takvim = Calendar.getInstance();
        takvim.setTime(sonBasariliGiris);
        takvim.add(Calendar.DAY_OF_MONTH, -2);
        Date ikiGunOnce = takvim.getTime();

        System.out.println("Son başarılı girişiniz : " + sonTarih.format(ikiGunOnce) + " 'dür");

        System.out.println("\nHesabınızda yapılan son 5 işlem listelenmiştir:\n");
        islemler.add("Alınan EFT ---------------> 500 TL");
        islemler.add("Karttan yapılan harcama --> 100 TL");
        islemler.add("Karttan yapılan harcama -->  50 TL");
        islemler.add("Gönderilen Havale --------> 300 TL");
        islemler.add("ATM para çekme -----------> 200 TL");

        for (int i = Math.max(0, islemler.size() - 5); i < islemler.size(); i++) {
            System.out.println(islemler.get(i));
        }

        //for (int i = 0; i < 14; i++) {// i değeri kadar boş satır yazdıracak
        //    System.out.println();
        //}

        System.out.println("\nHesap bakiyeniz: " + bakiye + " TL'dir");
        System.out.println("Ana ekrana yönlendiriliyorsunuz, lütfen bekleyiniz..\n");
        Thread.sleep(1000);
        anaEkran();

    }

    private static void paraCek() throws InterruptedException {

        System.out.println("Bakiyeniz: " + bakiye + " TL");

        if (bakiye > 0) {
            System.out.println("Lütfen çekmek istediğiniz miktarı giriniz: ");
            double cekilecekMiktar = scanner.nextDouble();

            if (cekilecekMiktar > bakiye) {
                System.out.println("Çekmek istediğiniz miktar bakiyenizin üzerindedir, " +
                        "bakiyenizin üzerinde çekim yapamazsınız.");
                paraCek(); // Hatalı miktar, tekrar miktar girişi iste
                // return;
            } else {
                bakiye -= cekilecekMiktar;
                System.out.println("Çekim işlemi gerçekleştirildi, bakiyeniz: " + bakiye + " TL' dir");
            }

            System.out.println("Başka bir işlem yapmak ister misiniz? \n[1] Evet  \n[0] Hayır");
            int devamEtSecimi = scanner.nextInt();
            if (devamEtSecimi == 1) {
                anaEkran(); // Ana ekrana geri dön
            } else {
                cikisYap(); // Çıkış yap

            }

        }

    }

    private static void paraYatir() throws InterruptedException {

        System.out.println("Yatırmak istediğiniz tutarı lütfen giriniz : ");
        double yatirilacakMiktar = scanner.nextDouble();
        System.out.println("İşleminiz yapılıyor lütfen bekleyiniz..");
        Thread.sleep(4000);
        bakiye += yatirilacakMiktar;
        System.out.println("Para yatırma işleminiz başarılı bir şekilde gerçekleştirilmiştir.");
        System.out.println("Yeni bakiyeniz: " + bakiye + " TL'dir.");

        System.out.println("Başka bir işlem yapmak ister misiniz? \n[1] Evet  \n[0] Hayır");
        int devamEtSecimi = scanner.nextInt();
        if (devamEtSecimi == 1) {
            anaEkran(); // Ana ekrana geri dön
        } else {
            cikisYap(); // Çıkış yap
        }
    }

    private static void paraGonder() throws InterruptedException {

        System.out.println("Gönderilecek kişinin 26 haneli IBAN numarasını giriniz : ");
        String inputIban = scanner.next();

        System.out.println("Bilgileriniz kontrol ediliyor, lütfen bekleyiniz.");
        Thread.sleep(1000); // 5 saniye bekleme süresi

        if (!inputIban.equals(eftIban)) {
            System.out.println("Hatalı veya geçersiz IBAN numarası girdiniz. Lütfen kontrol edip tekrar giriniz : ");
            paraGonder(); // Hatalı IBAN veya geçersiz IBAN, tekrar IBAN girişi iste

        } else {
            System.out.println("Göndermek istediğiniz miktarı giriniz: ");
            double gonderilenMiktar = scanner.nextDouble();

            if (gonderilenMiktar > bakiye) {
                System.out.println("Göndereceğiniz miktar bakiyenizin üstünde olamaz.");
                paraGonder();
            } else {
                bakiye -= gonderilenMiktar;
                System.out.println("Gönderme işlemi başarılı! Yeni bakiyeniz: " + bakiye + " TL");
            }

        }

        System.out.println("Başka bir işlem yapmak ister misiniz? \n[1] Evet  \n[0] Hayır ");
        int devamEtSecimi = scanner.nextInt();

        if (devamEtSecimi == 1) {
            anaEkran(); // Ana ekrana geri dön
        } else {
            cikisYap(); // Çıkış yap
        }
    }

    private static void sifreDegistir() throws InterruptedException {

        System.out.println("Lütfen 4 haneli şifrenizi giriniz: ");
        String inputSifre = scanner.next();

        if (!inputSifre.equals(musteriSifre)) {
            System.out.println("Girdiğiniz şifre hatalıdır, lütfen tekrar giriniz.");
            sifreDegistir();
        }

        System.out.println("Yeni bir şifre oluşturunuz: ");
        String yeniSifre1 = scanner.next();

        System.out.println("Oluşturduğunuz şifrenizi tekrar giriniz: ");
        String yeniSifre2 = scanner.next();

        System.out.println("Girdiğiniz şifreler kontrol ediliyor, lütfen bekleyiniz.");
        Thread.sleep(1000); // 1 saniye bekleme süresi

        if (!yeniSifre1.equals(yeniSifre2)) {
            System.out.println("Girdiğiniz şifreler eşleşmemektedir, lütfen tekrar deneyiniz.");
            sifreDegistir();
        }
        if (yeniSifre2.equals(inputSifre)) {
            System.out.println("Yeni şifreniz, eski şifrenizle aynı olamaz, lütfen tekrar deneyiniz.");
            sifreDegistir();
        } else {
            musteriSifre = yeniSifre2;
        }

        System.out.println("Şifre değiştirme işlemi gerçekleştirilmiştir, şifreniz : " + musteriSifre);
        System.out.println("Girişe yönlendiriliyorsunuz, lütfen bekleyiniz..");
        Thread.sleep(1000);
        musteriGiris();
        anaEkran();
    }

    private static void cikisYap() {
        System.out.println("=====İYİ GÜNLER DİLERİZ=====");

    }


}

