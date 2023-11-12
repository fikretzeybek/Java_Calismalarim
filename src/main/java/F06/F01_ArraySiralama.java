package F06;


import java.util.ArrayList;
import java.util.List;

public class F01_ArraySiralama {
    public static void main(String[] args) {



        Integer[] arr = {3,2,5,6,7,2,8,9,0,1,2,3,4,7,5,4};

        List<Integer> yeniArr = new ArrayList<>();

        for (Integer w : arr) {


            yeniArr.add(w);
        }

        System.out.println("Liste : " + yeniArr);
    }
}
