import java.util.*;

class A {
  static List<Integer> l1 = new ArrayList<Integer>();
  static List<Integer> l2 = new ArrayList<Integer>();
  public static void main(String[] args) {
    for (int i=0; i<5; ++i) {
      l1.add(i);
      l2.add(10 * i);
    }
    /*
    for (Integer i : l1)
      System.out.println(i);
    for (Integer i : l2)
      System.out.println(i);
    */
    ListIterator<Integer> lit1 = l1.listIterator();
    ListIterator<Integer> lit2 = l2.listIterator();
    while (lit1.hasNext())
      lit1.next();
    while (lit1.hasPrevious()) {
      Integer p = lit1.previous();
      if (lit2.hasNext()) {
        //lit2.next();
        l2.set(lit2.nextIndex(), p);
      }
    }
    for (Integer i : l1)
      System.out.println(i);
    for (Integer i : l2)
      System.out.println(i);
  }
}
