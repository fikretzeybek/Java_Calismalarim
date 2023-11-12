package F34_Pratik_01;

public class F10_MetindekiRakamlarToplami {

    public static void main(String[] args) {


      rakamlariTopla("Istanbul1453");
      rakamTopla("Istanbul1453");

    }
    public static void rakamlariTopla(String metin){
        int toplam = 0;

        // Metindeki rakamları bulup toplamı hesapla
        metin = metin.replaceAll("[^0-9]", "");
        for (int i = 0; i < metin.length(); i++) {
            int rakam = Integer.parseInt(String.valueOf(metin.charAt(i)));
            toplam += rakam;
        }

        System.out.println("Rakamların Toplamı: " + toplam);
    }
    public static void rakamTopla(String metin){

        int toplam = 0;
        char karakter;

        for (int i = 0; i < metin.length(); i++) {

            karakter = metin.charAt(i);

            if (Character.isDigit(karakter)){

                toplam += Character.getNumericValue(karakter);
            }



        }
        System.out.println("Rakamlar toplami = " + toplam);
    }
}
