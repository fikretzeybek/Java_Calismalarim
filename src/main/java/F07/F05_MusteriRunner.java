package F07;

public class F05_MusteriRunner {
    public static void main(String[] args) {

        F04_Musteri yonetim = new F04_Musteri();

        yonetim.ekle();
        yonetim.sil();
        yonetim.guncelle();

        System.out.println(F04_Musteri.topla());




    }
}
