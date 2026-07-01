package arrayList;

import java.util.ArrayList;

public class list {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<Integer>();
        // add elements
        list.add(0);
        list.add(1);
        list.add(2);

        System.out.println(list);

        // get elements
        int element  = list.get(2);
        System.out.println(element);

        // add element in between
        list.add(2,5);
        System.out.println(list);

        // set element
        list.set(0, 5);
        System.out.println(list);

        // delete elements

        list.remove(3);
        System.out.println(list);

        //size
        int size = list.size();
        System.out.println(size);

        // loops
        for(int i = 0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
        System.out.println();
    }
}
