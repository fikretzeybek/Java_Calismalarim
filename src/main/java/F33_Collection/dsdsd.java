package F33_Collection;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class dsdsd {

    public static void main(String[] args) {

        int [] arr = {1,3,4,3,2,2,2,8,9,8,5,6,5,4,3,3,2,1,0,0,8,7,3,1,1,2};

        Set<Integer> tekrarsizSet = new TreeSet<>();

        for (Integer each:arr
             ) {
            tekrarsizSet.add(each);
        }

        System.out.println(tekrarsizSet);//[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]



        arr = new int[tekrarsizSet.size()];
        System.out.println(Arrays.toString(arr));
        int index = 0;


        for (Integer each:tekrarsizSet
             ) {
            arr[index]=each;
            index++;
        }

        System.out.println(Arrays.toString(arr));

    }
}
