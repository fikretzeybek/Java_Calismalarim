package F08;

public class F06_Runner {
    public static void main(String[] args) {

        F06_Car car1 = new F06_Car();

        car1.marka = "Fiat";
        car1.model = "Egea";
        car1.yil =2023;
        car1.hiz = 220;
        car1.fiyat = 1000000;

        System.out.println("Car1 "+ car1);

        F06_Car car2 = new F06_Car("Citroen","C5",2020,240,1200000);
        System.out.println("Car2 "+ car2);

        F06_Car car3 = new F06_Car("Ford","Mustang",2010,280,1800000);
        System.out.println("Car3 "+ car3);

        F06_Car car4 = new F06_Car("Opel","Corsa",2020,220,950000);
        System.out.println("Car4 "+ car4);


    }
}
