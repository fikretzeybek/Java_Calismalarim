package day13_Arrays;

public class F05_PozitifTamsayiToplayiciForLoop {

    public static void main(String[] args) {

        int[] sayiGrubu = {3, -5, 8, 24, -19, 12, -17, 23, -12};


        int sonuc = toplamPozitifTamsayilar(sayiGrubu);
        System.out.println("Pozitif tamsayilarin toplami : " + sonuc);
    }

    public static int toplamPozitifTamsayilar(int[] sayiGrubu) {// Pozitif tamsayıları toplamak için bir method
        int toplam = 0;

        for (int sayi : sayiGrubu) {
            if (sayi > 0) {
                toplam += sayi;
            }
        }

        return toplam;
    }
}
