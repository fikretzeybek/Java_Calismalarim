package F12;

import java.util.Arrays;

public class F05_ArraysLength {
    public static void main(String[] args) {

        int arr[][] = { {1,2,3}, {4}, {5, 6}};

        for(int[] w : arr){

            System.out.print(w.length + " ");//3 1 2

        }
        System.out.println();

        System.out.println("length : " +arr.length);// length : 3

        System.out.println(Arrays.toString(arr[1]));// [4]
    }
}
