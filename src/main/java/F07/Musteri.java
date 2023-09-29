package F07;

public class Musteri {
    public void ad(){}
    public void sil() {System.out.println("silindi"); }
    public void ekle() {System.out.println("eklendi"); }
    public   void guncelle() {System.out.println("guncellendi"); }
    public static int topla() { return 3 + 5;}
    public static String str(String a,String b){String concat = a+b; return a+b;}

    public static void main(String[] args) {

        Musteri yonetim = new Musteri();

        yonetim.ekle();
        yonetim.sil();
        yonetim.guncelle();

        System.out.println(topla());
    }

}
