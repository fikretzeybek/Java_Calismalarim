package F18;

public class Deneme {

    String isim = "John Doe";
    int yas = 40;

    public Deneme() {
        isim = "Seher";
        yas = 38;
    }

    public Deneme(String isim, int yas) {
        this.isim = isim;
        this.yas = 30;
    }

    public static void main(String[] args) {

        Deneme obj1 = new Deneme();

        Deneme obj2 = new Deneme("Fatih", 35);

        System.out.println("Isim : " + obj1.isim + "\nYas : " + obj2.yas);
    }
}
