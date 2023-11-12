package F18;

public class Deneme1 {
    String isim = "John Doe";
    int yas = 40;

    public Deneme1() {
        isim = "Seher";
        System.out.println("isim : " + isim);
    }

    public Deneme1(String isim) {
        this();
        this.yas = 30;
        System.out.println("isim : " + isim);
    }

    public Deneme1(String isim, int yas) {
        this("Murat");
        this.yas = 45;
    }

    public static void main(String[] args) {
    }

    Deneme1 obj1 = new Deneme1("Esra");
    Deneme1 obj2 = new Deneme1("Fatih", 35);

}
