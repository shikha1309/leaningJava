import java.util.ArrayList;

import java.util.Collections;

public class ArrayList1 {
    public static void main(String args[]){
        ArrayList<Integer> list1 = new ArrayList<Integer>();

        // add element
        list1.add(9);
        list1.add(19);
        list1.add(29);
        System.out.println(list1);
        // get element

        int element = list1.get(0);
        System.out.println(element);
        // add e1 in between;
        list1.add(1,99);
        System.out.println(list1);

        // set element
        list1.add(0, 55);
        System.out.println(list1);

        // delete element
        list1.remove(0);
        System.out.println(list1);


        //size
        int size = list1.size();
        System.out.println(size);
        // also iterate like Array

        // sorting
        Collections.sort(list1);
        System.out.println(list1);









    }
}
