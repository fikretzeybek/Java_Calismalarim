package F08;

public class F06_Car {
    String marka;
    String model;
    int yil;
    int hiz;
    int fiyat;

    public F06_Car() {

    }


    public F06_Car(String marka, String model, int yil, int hiz, int fiyat) {
        this.marka = marka;
        this.model = model;
        this.yil = yil;
        this.hiz = hiz;
        this.fiyat = fiyat;
    }

    public String toString() {
        return " Arac Bilgisi  : " +
                "\nMarka : " + marka +
                "\nModel : " + model +
                "\nYil   : " + yil +
                "\nHiz   : " + hiz +
                "\nFiyat : " + fiyat;
    }


}
