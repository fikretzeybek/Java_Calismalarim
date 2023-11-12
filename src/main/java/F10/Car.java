package F10;

public class Car {

    String marka = "Belirtilmedi";
    String model = "Belirtilmedi";
    String renk = "Belirtilmedi";
    String sehir = "Belirtilmedi";
    String yakit = "Belirtilmedi";
    int modelYili = 0;


     Car(){}

     Car(String marka){



    }

     Car(String marka, String model, String renk){


    }


    public Car(String hiz,String yakit){}

    public Car(String marka,String model, String sehir, int modelYili,String yakit){}

    public Car(int modelYili){}

    public Car(String marka,String model, String sehir, int modelYili){}

    public Car(String marka, String sehir, int modelYili,String yakit){}

    @Override
    public String toString() {
        return "Arac Cıktısı =>"+
                "  marka='" + marka + '\'' +
                "/ model='" + model + '\'' +
                "/ renk='" + renk + '\'' +
                "/ sehir='" + sehir + '\'' +
                "/ yakit='" + yakit + '\'' +
                "/ modelYili=" + modelYili ;
    }
}
