package F11;

public class Arac {
    // instance variable veya class level

    String marka = "Belirtilmedi";
    String model = "Belirtilmedi";
    String renk = "Belirtilmedi";
    String yakit = "Belirtilmedi";
    String sehir = "Belirtilmedi";
    int modelYili = 0;


    public Arac() {


    }

    public Arac(String marka) {// arac4

        this.marka = "Fiat";

    }

    public Arac(String model, int modelYili, String yakit) {

        this.model = model;
        this.modelYili = 2015;
        this.yakit = yakit;


    }

    public Arac(String marka, String model, String renk, int modelYili) {

        this.marka = marka;
        this.model = model;
        this.renk = "Titan";
        this.modelYili = 2020;


    }

    public static void main(String[] args) {

        Arac arac1 = new Arac("Honda", "Civic", "Diesel", 2020);
        Arac arac2 = new Arac("Honda");
        Arac arac3 = new Arac("Civic", 2020, "Diesel");

        System.out.println("Arac1 : " + arac1);
        System.out.println("Arac2 : " + arac2);
        System.out.println("Arac3 : " + arac3);

    }

    @Override
    public String toString() {
        return "Arac{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", renk='" + renk + '\'' +
                ", yakit='" + yakit + '\'' +
                ", sehir='" + sehir + '\'' +
                ", modelYili=" + modelYili +
                '}';
    }
}
