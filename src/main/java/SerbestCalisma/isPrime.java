package SerbestCalisma;

import java.util.Scanner;

public class isPrime {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int number = scan.nextInt();

        boolean isPrime = true;// isPrime=asalMı

        if (number == 1){
            System.out.println(number+" sayısı Asal bir sayı değildir.");
            return;
        }

        for (int i = 2; i < number; i++) {

            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(number+" sayısı Asal bir sayıdır.");
        } else {
            System.out.println(number+" sayısı Asal bir sayı değildir.");
        }


    }

}
