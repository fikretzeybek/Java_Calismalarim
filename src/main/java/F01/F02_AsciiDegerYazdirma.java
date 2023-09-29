package F01;

import java.util.Scanner;

public class F02_AsciiDegerYazdirma {
    public static void main(String[] args) {
        // char 'a' nin int karsiligi : 97
        // kullanicidan bir char alip
        // ascii table'da o kararkterden sonra gelen 3 karakteri yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen ASCII table' dan bir karakter giriniz");
        char krk = scanner.next().charAt(0);
        System.out.println((char) (krk + 1));
        System.out.println((char) (krk + 2));
        System.out.println((char) (krk + 3));
    }
}
