package F08;

public class F05_ {
    public static void main(String[] args) {

        int[] sayilar = {19, 3, 15, 7, 11, 9, 13, 5, 17, 1};
        String rakam = "";
        rakam += "Sira\tRakam\t\tSekilGorunum";

        yazdir(sayilar, rakam);

    }

    static void yazdir(int[] sayilar, String rakam) {

        for (int i = 0; i < sayilar.length; i++) {
            rakam += "\n" + i + "\t\t" + sayilar[i] + "\t\t\t";
            for (int j = 1; j <= sayilar[i]; j++) {
                rakam += "$";
            }
        }
        System.out.print(rakam);
        /*
        Burada iki for döngüsü var. İlk for döngüsü, sayilar dizisinin her elemanını işlemek için kullanılır.
        Şimdi, bu iç içe geçmiş for döngülerini sırayla izleyelim:

        İlk döngü: for (int i = 0; i < sayilar.length; i++)

        i değeri başlangıçta 0'dır.
        İlk adımda, rakam dizisine sıra numarası (i), rakam değeri (sayilar[i]), ve boşluk karakteri eklenir.
        Ardından, iç içe geçmiş ikinci döngüye geçilir.

        İkinci döngü: for (int j = 1; j <= sayilar[i]; j++)

        j değeri başlangıçta 1'dir.
        Bu döngü, sayilar[i] değeri kadar yıldız (*) ekler. Örneğin, eğer sayilar[i] 3 ise, 3 yıldız ekler.
        İkinci döngü tamamlandığında, iç içe geçmiş döngü sona erer ve bir sonraki i değeri için döngü
        başa döner.

        Bu işlem, sayilar dizisinin her bir elemanı için sırayla tekrarlanır.
        Bu sayede her bir sayının sıra numarası, rakam değeri ve yıldız (*) şekli hesaplanır
        ve rakam karakter dizisine eklenir.
         */
    }
}
