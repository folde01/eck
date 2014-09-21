import java.util.*;

class A {
  static void stepThrough(Collection<A> c) {
    Iterator<A> it = c.iterator();
    while(it.hasNext()) {
      A o = it.next();
      System.out.println(o.toString());
    }
  }
  public static void main(String[] args) {
    List<A> a = new ArrayList<A>();
    Collections.addAll(a, new A(), new A());
    stepThrough(a);
  }
}
