package F33_Collection;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedList_LIST {

    public static void main(String[] args) {

        List<String> isimler = new LinkedList<>();

        isimler.add("Ali");
        isimler.add("Beyhan");
        isimler.add("Veli");
        isimler.add("Mehmet");
        isimler.add(2,"Ceyhan");
        isimler.add("Veli");

        List<String> isimler2 = new LinkedList<>();

        isimler2.add("Samet");
        isimler2.add("Omer");
        isimler2.add("Ali");
        isimler2.add("Mehmet");
        isimler2.add("Suleyman");

        System.out.println(isimler.retainAll(isimler2));
        System.out.println(isimler);
        System.out.println(isimler2);
        System.out.println(isimler2.hashCode());


    }

}
