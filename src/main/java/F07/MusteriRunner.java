package F07;

public class MusteriRunner {
    public static void main(String[] args) {

        Musteri yonetim = new Musteri();

        yonetim.ekle();
        yonetim.sil();
        yonetim.guncelle();

        System.out.println(Musteri.topla());




    }
}
