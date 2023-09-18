import java.util.*;
class Links {
  public static void main(String args[]) {
    LinkedList<String> list = new LinkedList<String>();
//adding elements on First
    list.addFirst("a");
    list.addFirdt("is");
//adding elements in Last
    list.addLast("this");
    list.add("list");
//iterating over list
  for(int i=0;i<list.size();i++) {
    System.out.println(list.get(i)+"->");
  }System.out.println("null");
//remove first element
    list.removeFirst();
//remove last element
    list.removeLast();
//printing LinkedList
    System.out.println(list);
//size of LinkedList
    System.out.println(list.size());  
