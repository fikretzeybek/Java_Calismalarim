package F13;

import java.util.ArrayList;

public class F04_ArrayList {

    public static void main(String[] args) {

        ArrayList<String> cars = new ArrayList<String>();

        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        for (int i = 0; i < cars.size(); i++) {

            System.out.print(cars.get(i) + " ");// Volvo BMW Ford Mazda

        /*     for-each ile

        for (String car : cars) {
            System.out.println(car);
            }
                                 */


        }
    }

}