package F21;

public class Varargs2 {

    public static void main(String[] args) {

        // Kactane string argument yazilirsa yazilsin
        // Argumentlerin en uzun olanini yazdiran bir method olusturun
        // Not : en uzun kelime olarak birden fazla kelime varsa, ilkini yazdirin

        enUzunuYazdir("Ilyas","Berivan","Murat");
        enUzunuYazdir("Mehmet","Vahit","Nurcann","Java","Zafer","Kerime","Samet");
    }

    private static void enUzunuYazdir(String... kelimeler) {

        String enUzunKelime=kelimeler[0];

        for (String eachKelime: kelimeler
        ) {

            if (eachKelime.length()>enUzunKelime.length()){
                enUzunKelime=eachKelime;
            }
        }

        System.out.println(enUzunKelime);
    }
}