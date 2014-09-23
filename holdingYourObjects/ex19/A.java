import java.util.*;

// Exercise 19: (2) Repeat the previous exercise with a HashSet and LinkedHashSet.

class A {
  public static void main(String[] args) {
    HashSet<String> hs = new HashSet<String>();
    hs.add("abc");
    hs.add("bbc");
    hs.add("2abc");
    hs.add("Abc");
    hs.add("Labc");
    System.out.println(hs);
    Iterator<String> it = hs.iterator();
    while(it.hasNext())
      System.out.println(it.next().hashCode());
    System.out.println();
    TreeSet<String> ts = new TreeSet<String>(hs);
    Iterator<String> it2 = ts.iterator();
    while(it2.hasNext())
      System.out.println(it2.next().hashCode());
    System.out.println(ts);
    LinkedHashSet lhs = new LinkedHashSet<String>(ts);
    it2 = lhs.iterator();
    while(it2.hasNext())
      System.out.println(it2.next().hashCode());
    System.out.println(ts);
  }
}
