package CollectionFramwork;

import java.util.ArrayList;
import java.util.List;

public class ArrayList1 {
    public static void main(String[] args){
        List<String> list = new ArrayList<>();
        list.add("banana");
        list.add("orange");
        list.add("Apple");
        list.add("Mango");

        System.out.println("My fruits: "+list);

        String index0 = list.get(0);
        System.out.println("index 0 :- "+index0);

        String setdated  = list.set(1,"papaya");
        System.out.println("updated fruits: "+setdated);

        System.out.println("updated fruits list : "+list);

        list.remove("banana");
        System.out.println("apple remove: "+list);

        int sizelist = list.size();
        System.out.println("size of list : "+sizelist);

        boolean checkIsEmpty = list.isEmpty();
        System.out.println("check is empty : "+checkIsEmpty);

        boolean contain = list.contains("Apple");
        System.out.println("apple is present or not : "+contain);


    }
}
