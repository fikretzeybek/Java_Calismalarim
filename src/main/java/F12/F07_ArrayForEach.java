package F12;

public class F07_ArrayForEach {

    public static void main(String[] args) {

        int arr[] = {1, 3, 5, 7, 9};

        for (int a : arr) {

            System.out.print(a + " ");//1 3 5

            if (a > 4) {

                break;

            }

        }

    }

}