package F13;
import java.util.ArrayList;
import java.util.Arrays;

public class F05_ArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> myNumbers = new ArrayList<Integer>();

        myNumbers.add(10);
        myNumbers.add(15);
        myNumbers.add(20);
        myNumbers.add(25);
        myNumbers.remove(3);
        myNumbers.set(2,59);

        for (int i : myNumbers) {
            System.out.print(i + " ");//10 15 59
        }
        System.out.println("");

    }


}