package F03;
import java.util.Scanner;

public class F05_forLoop1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir kelime giriniz?");
        String kelime = scanner.nextLine(); //Kişiselleştirilmiştir //  sesli=8 sessiz=13

        String sesliHarflar="aeıioöuü";
        int sesli=0;

        for (int i = 0; i < kelime.length(); i++) {
            for (int j = 0; j < sesliHarflar.length(); j++) {
                if (kelime.charAt(i)==sesliHarflar.charAt(j)){
                    sesli++;


                }

            }

        }

        System.out.println("sesli harf : " +sesli);
        System.out.println("sessiz harf : " +(kelime.replaceAll(" ","").length()-sesli));

    }
}