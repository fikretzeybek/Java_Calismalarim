package F09;

public class F01_Car {
    String marka;
    String model;
    int yil;
    int hiz;
    double fiyat;

    // Constructor
    public F01_Car(String marka, String model, int yil, int hiz, double fiyat) {
        this.marka = marka;
        this.model = model;
        this.yil = yil;
        this.hiz = hiz;
        this.fiyat = fiyat;
    }

    // Getter ve Setter Metotları (Opsiyonel)
    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYil() {
        return yil;
    }

    public void setYil(int yil) {
        this.yil = yil;
    }

    public int getHiz() {
        return hiz;
    }

    public void setHiz(int hiz) {
        this.hiz = hiz;
    }

    public double getFiyat() {
        return fiyat;
    }

    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }
    public String toString() {
        return " Arac Bilgisi  : " +
                " Marka :   " + marka +
                " Model :   " + model +
                " Yil   :   " + yil +
                " Hiz   :   " + hiz +
                " Fiyat :   " + fiyat;
    }
}

