package F16;

public class Sinif extends Okul {

    int sayi1 = 30;
    int sayi3 = 40;
    String isim2 = "Ayse";
    String isim3 = "Fatma";

    Sinif() {

        System.out.println("Sinif Constructor");

        System.out.println(this.sayi1);//30
        System.out.println(super.sayi1);//10
        System.out.println(this.sayi2);//15
        System.out.println(super.sayi2);//15
        System.out.println(this.sayi3);//40
        //System.out.println(super.sayi3);
        super.isim1 = "Hatice";
        System.out.println(this.isim1);//Hatice
        System.out.println(super.isim1);//Hatice
        this.isim2 = "Kemal";
        System.out.println(this.isim2);//Kemal
        System.out.println(super.isim2);//Veli
        System.out.println(this.isim3);//Fatma
        //System.out.println(super.isim3);//
    }


    public static void main(String[] args) {

        Sinif obj = new Sinif();
    }
}