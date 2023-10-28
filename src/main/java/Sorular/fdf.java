package Sorular;

import java.util.Scanner;

public class fdf {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        double sayi = 0;
        double sum = 0;

        while (true)
        {
            System.out.println("sayi giriniz q basarsanız durur yoksa en son toplamı verir");
            try {
                sayi = scanner.nextDouble();
                sum += sayi;
            } catch (Exception e) {
                String girilenharf = scanner.next();
                if
                (girilenharf.equalsIgnoreCase("q")) {

                    break;

                }else {
                    System.out.println("q yada sayı gir");
                }

            }


        }
        System.out.println("girilen syaıların toplamı :" + sum);
    }
}