package arrayList;

import java.util.ArrayList;


public class add {
    public static void main(String[] args) {
        
    ArrayList<Integer> list = new ArrayList<>();
    list.add(3);
    list.add(2);
    list.add(33);
    list.add(343);
    list.add(2434);
    list.add(33343);

    for(int i = 0; i<list.size(); i++){
        System.out.println(list.get(i));
    }
    System.out.println(list);
    }
    
    
}
