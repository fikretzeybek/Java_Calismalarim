package F09;
public class F03_DizidekiArdisikSayilarToplami {

    public static void main(String[] args) {

        int[] arr = {3, 5, 1, 2, 7, 9, 2, 3, 5, 7};
        int[] toplam = arrTopla(arr);

        System.out.println("Dizideki ardışık sayıların toplamı : ");
        for (int w : toplam) {
            System.out.print(w + "  ");
        }
    }

    public static int[] arrTopla(int[] arr) {
        int[] toplam = new int[arr.length - 1];

        for (int i = 0; i < arr.length - 1; i++) {
            toplam[i] = arr[i] + arr[i + 1];
        }

        return toplam;

    }
}
