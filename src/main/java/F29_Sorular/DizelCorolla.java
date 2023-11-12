package F29_Sorular;

abstract class Araba {
    public abstract String model();
}

abstract class Toyota extends Araba {
    public abstract void motor();
}

abstract class Corolla extends Toyota {
    public String model() {
        return "Corolla";
    }
}

public class DizelCorolla extends Corolla {
    public void motor() {
        System.out.println("Corolla Dizel araclar 1.6 dizel motor kullanir");
    }

}