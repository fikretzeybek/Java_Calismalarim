package F04;
public class F12_CarpimTablosuAlternatif {
    public static void main(String[] args) {
        int grupBoyutu = 5; // Her grupdaki çarpım sonuçları sayısı
        int sinir = 10; // Çarpım tablosunun sınırı

        for (int i = 1; i <= sinir; i++) {
            System.out.println(i + " çarpım tablosu:");
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
                if (j % grupBoyutu == 0) {
                    System.out.println(); // Her grup sonunda bir satır boşluk bırakır
                }
            }
            System.out.println(); // Her grup sonunda bir satır boşluk bırakır
        }
    }
}
