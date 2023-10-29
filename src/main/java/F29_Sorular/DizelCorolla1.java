package F29_Sorular;

abstract class Araba1 {
    public abstract String model();
    abstract int tekerSayisi();
}
abstract class toyota1 extends Araba1 {
    public abstract void motor();
    int tekerSayisi() {
        return 4;
    }
    abstract String vitesTuru();
}
abstract class Corolla1 extends toyota1 {
    public String model() {
        return "Corolla";
    }
    abstract String kasa();
}

public class DizelCorolla1 extends Corolla1 {
    public void motor() {
        System.out.println("Corolla Dizel araclar 1.6 dizel motor kullanir");
    }

    @Override
    String vitesTuru() {
        return null;
    }

    @Override
    String kasa() {
        return null;
    }
}