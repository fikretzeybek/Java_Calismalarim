package F12;

public class F06_ArrayForEach {
    public static void main(String[] args) {
        int arr[] = {12, 21, 13};

        for (int each : arr) {

            System.out.print(each + " ");//12 21 13

        }
        /*
        int arr1[][] = { {12}, {21}, {13} };
             for(int[] w : arr) {
            System.out.print(w + " ");
            Not: int[] w degil int w olacaktı CTE verir

        }   */


    }
}
