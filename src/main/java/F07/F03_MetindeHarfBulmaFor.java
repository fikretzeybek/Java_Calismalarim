package F07;

public class F03_MetindeHarfBulmaFor {
    // For döngüsü kullanarak
    // "Ava gidip de avdan donene avci denmez, ne denir?"
    // cümlesindeki a ve d harflerinin
    // adedini bulan bir program yazınız:

    public static void main(String[] args) {
        int aSayac = 0;
        int dSayac = 0;
        String cumle = "Ava gidip de avdan donene avci denmez, ne denir?";

        for (int i = 0; i < cumle.length(); i++) {
            char c = cumle.charAt(i);
            if (c == 'a') {
                aSayac++;
            }
            if (c == 'd') {
                dSayac++;
            }
        }
        System.out.println("a harfi adedi = " + aSayac + "\nd harfi adedi = " + dSayac);
    }
}
