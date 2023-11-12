package F34_Pratik_01;

import java.util.Arrays;

public class F09_AnagramMi {
    public static void main(String[] args) {


        System.out.println(anagramMi("arcelik","kralice"));
        System.out.println(anagramMi("bamya","bayam"));
        System.out.println(anagramMi("elma","lame"));
        System.out.println(anagramMi("Ahmet","Hatem"));


    }

    public static boolean anagramMi(String str1, String str2) {

        String[] str1Arr = str1.toUpperCase().split("");
        String[] str2Arr = str2.toUpperCase().split("");

        Arrays.sort(str1Arr);
        Arrays.sort(str2Arr);

        return Arrays.equals(str1Arr, str2Arr);

    }
}
