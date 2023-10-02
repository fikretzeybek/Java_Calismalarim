package F03;

import java.util.Scanner;

public class F06_incesesliKalinsesli {
    public static void main(String[] args) {
        // kullanicidan aldiginiz sesli harfin
        // ince mi kalin mi olduğunu yazdiran bir kod yazin

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen bir sesli harf giriniz :");
        char hrf = scanner.next().toLowerCase().charAt(0);

        switch (hrf) {
            case 'a':
            case 'o':
            case 'u':
            case 'ı':
                System.out.println("Kalin sesli harftir");
               break;
            default:
                System.out.println("Ince sesli harftir");

        }
    }
}
