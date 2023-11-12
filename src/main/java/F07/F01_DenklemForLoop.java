package F07;

public class F01_DenklemForLoop {

    public static void main(String[] args) {
        // ∑ 3*x2 + 2*x + 5 denkleminin 0-100 arasındaki
        // sonucunu bulun:


        int sonuc = 0;

        for (int x = 0; x < 100; x++) {
            sonuc += 3 * (x * x) + 2 * x + 5;
        }
        System.out.println("Sonuc = " + sonuc);
    }
}
