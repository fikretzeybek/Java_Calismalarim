package F08;

public class F01_ArrayIsimlistArananIsimBulma {

    public static void main(String[] args) {
        String[] isimler = {"Ahmet", "Mehmet", "Ayşe", "Fatma", "Ali", "Zeynep", "Osman", "Emre"};
        String arananIsim = "Omer";

        System.out.println(isimBul(isimler, "Omer"));

    }
    public static boolean isimBul(String[] isimArray, String arananIsim) {

        for (String w : isimArray) {

            if (w.equals(arananIsim)) {

                return true;
            }
        }
        return false;
    }
}