package SerbestCalisma;

public class MultiDimensionalArray {
    public static void main(String[] args) {

        String[][] sehirler = new String[3][3];

        sehirler[0][0] = "Ankara";
        sehirler[0][1] = "Çorum";
        sehirler[0][2] = "Konya";
        sehirler[1][0] = "Manisa";
        sehirler[1][1] = "İzmir";
        sehirler[1][2] = "Uşak";
        sehirler[2][0] = "Bursa";
        sehirler[2][1] = "Bilecik";
        sehirler[2][2] = "Kocaeli";

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                System.out.println(sehirler[i][j]);


            }
            System.out.println("-----------");
        }



    }



}
