package H_Abstract;

public class Runner {

    public static void main(String[] args) {

        PersonelComputer osKullanici = new PersonelComputer();
        osKullanici.javaDataBase = new Windows();
        osKullanici.osSistem();
        osKullanici.javaDataBase = new Linux();
        osKullanici.osSistem();
        osKullanici.javaDataBase = new IOS();
        osKullanici.osSistem();


    }
}
