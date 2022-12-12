package iterator;

import java.util.*;

public class test {
    public static void main(String[] args) {
        ArrayList<Integer> name = new ArrayList<>();
        name.add(1);
        name.add(2);
        name.add(3);
        name.add(4);
        name.add(5);
        name.add(6);
        name.add(7);
//        System.out.println(name.set(1,12));
//        Object[] number = name.toArray();
//        for(Object i : number){
//            System.out.println(i);
//        }

        ArrayList<Integer> subNum = new ArrayList<>();
        subNum.add(134);
        subNum.add(1123);
        subNum.add(11);
        name.removeAll(subNum);
        for(int i : name){
            System.out.println(i);
        }
//        while (strName.hasNext()) {
//            Integer element = strName.next();
//            if (element < 3) {
//                strName.remove();
//            }
//            System.out.println(element);
//
//        }
//        Collection
//        List
//        ArrayList
//        Object[] hello;
//        Object[] newOOP = {1,3,12,12};
//        newOOP = name.toArray();
//        for(Object iii : newOOP){
//            System.out.println(iii);
//
//        }
    }
}
