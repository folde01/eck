import java.util.*;

class A {
  static List<Integer> li = new LinkedList<Integer>();
  static void addMid(Integer n) {
    ListIterator<Integer> lit = li.listIterator();
    int mid = li.size()/2;
    for (int i=0; i<mid; i++)
      if(lit.hasNext())
        lit.next();
    lit.add(n);
  }
  public static void main(String[] args) {
    for (int i=0; i<10; i++) { 
      addMid(new Integer(i));
      System.out.println(li);
    }
  }
}
