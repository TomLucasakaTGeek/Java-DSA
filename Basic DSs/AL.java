import java.util.*;

class ListOfArray {
    public static void main(String args[]) {
        
        ArrayList<Integer> list=new Arraylist<>();
        //add elements
        list.add(0);
        list.add(1);
        System.out.println(list);
        
        //get elements
        int a = list.get(0);
        System.out.println(list);
        
        //add ele in btwn
        list.add(0,10);
        System.out.println(list);
        
        //set or replace element
        list.set(1,11);
        System.out.println(list);

        //delete ele
        list.remove(1);
        System.out.println(list);
        
        //size of ele
        int size = list.size();
        System.out.println(size);
        
        //sorting (any collection)
        Collections.sort(list);
        System.out.println(list);
}}
