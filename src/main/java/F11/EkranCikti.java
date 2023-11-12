package F11;

public class EkranCikti {
    public static void main(String[] args) {



        Arac arac1 = new Arac("Passat",2016,"Benzin");
        System.out.println("Arama 1 : " + arac1);

        Arac arac2 = new Arac();
        System.out.println("Arama 2 : " + arac2);

        Arac arac3 = new Arac("Ford","Focus","Gri",2013);
        System.out.println("Arama 3 : " + arac3);

        Arac arac4 = new Arac("Honda");
        System.out.println("Arama 4 : " + arac4);




    }

}
