package F09;

public class F01_Runner {

    public static void main(String[] args) {
        // 5 araç nesnesi oluşturuluyor
        F01_Car car1 = new F01_Car("Toyota", "Avens", 2020, 180, 25000.0);
        F01_Car car2 = new F01_Car("Honda",  "Jazzz", 2019, 200, 28000.0);
        F01_Car car3 = new F01_Car("Suzuki", "Vitar", 2021, 160, 22000.0);
        F01_Car car4 = new F01_Car("Hyndai", "Syron", 2018, 220, 27000.0);
        F01_Car car5 = new F01_Car("Volvo",  "C6400", 2022, 190, 30000.0);

        System.out.println("Car1  : " + car1);
        System.out.println("Car2  : " + car2);
        System.out.println("Car3  : " + car3);
        System.out.println("Car4  : " + car4);
        System.out.println("Car5  : " + car5);


    }

}

