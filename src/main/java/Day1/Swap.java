package Day1;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        //Kullanicidan iki sayi alip ikisinin degerlerini degistirin(swap).

        Scanner scanner = new Scanner(System.in);
        System.out.println("Iki tam sayi giriniz : ");
        int s1 = scanner.nextInt();
        int s2 = scanner.nextInt();

        s1 = s1 + s2;
        s2 = s1 - s2;
        s1 = s1 - s2;

        System.out.println(s1);
        System.out.println(s2);

        System.out.println("----------------");

        int bosKutu = 0;
        bosKutu = s1 ;
        s1 = s2;
        s2 = bosKutu;



        System.out.println(s1);
        System.out.println(s2);

    }
}
