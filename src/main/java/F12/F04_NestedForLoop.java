package F12;

public class F04_NestedForLoop {
    public static void main(String[] args) {
        int arr[][] = { {1, 2}, {3}, {4, 5, 6} };

        int sum = 0;

        for(int[] each : arr) {

            for(int z : each){

                sum = sum + z;

            }

        }

        System.out.println(sum);//21
    }
}
