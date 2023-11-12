package day13_Arrays;

public class F04_PozitifTamsayiToplayiciForEach {

    public static void main(String[] args) {

        int[] sayiler =  {3, -5, 8, 4, -9, 12, -17,23, -12};
        int sonuc = toplamPozitifTamsayilar(sayiler);
        System.out.println("Pozitif Tamsayilarin Toplami: " + sonuc);
    }

    public static int toplamPozitifTamsayilar(int[] sayiler) {// Pozitif tamsayıları toplamak için bir method
        int toplam = 0;

        for (int i = 0; i < sayiler.length; i++) {
            if (sayiler[i] > 0) {
                toplam += sayiler[i];
            }
        }

        return toplam;
    }
}
