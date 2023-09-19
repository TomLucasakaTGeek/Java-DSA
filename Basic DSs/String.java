import java.util.*;

class ObjOfChars {
  public static void main(String args[]) {
    Scanner o = new Scanner(System.in);
    System.out.println("Enter text");
    String s = o.nextLine();   // o.next() can be used too

    for(int i=0;i<s.length();i++)
      System.out.println(s.charAt(i));
  }
}
