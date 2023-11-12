package F25_Abstract;

public class Memur extends Muhasebe {


    @Override
    protected int saatUcreti() {
        return 20;
    }

    @Override
    protected int aylikCalismaSuresi() {
        return 250;
    }
}
