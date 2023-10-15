package SerbestCalisma;

import java.util.ArrayList;

public class cozumleme {
    public static void main(String[] args) {
        //List<String> list = new ArrayList<>();
        //list.add("Ali");
        //System.out.println(list);[Ali]

        //List<String> list = new ArrayList<>();
        //list.add("Ali");
        //list.add("Ayse");
        //System.out.println(list);[Ali, Ayse]

       //List<String> list = new ArrayList<>();
       //list.add("Ali");
       //list.add(0, "Ayse");
       //System.out.println(list);[Ayse, Ali]

        //List<String> list = new ArrayList<>();
        //list.add("Ali");
        //list.add("Ayse");
        //System.out.println(list.length);
        // length degil size() olacak dolsyisiyle CTE verir

        //List<Integer> list = new ArrayList<>();
        //list.add(123);
        //System.out.println(list.contains("123"));//String  degil direk(123) yazilacak
                                                 // bu hali ile cikti "false"

        //List<Integer> list = new ArrayList<>();
        //list.add(7);
        //list.add(8);
        //list.add(9);
        //list.remove(9);
        //System.out.println(list); RTE verir, 9 u index olarak algilar


        ArrayList<Character> list = new ArrayList<Character>();
        for (char i = 'a'; i <= 'e' ; i++) {
            list.clear();
            list.add(i);

        }

        System.out.println(list);// [e]
    }
}
