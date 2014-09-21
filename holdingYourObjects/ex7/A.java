import java.util.*;

class B {}

class A {
  private static B[] b = new B[]{new B(), new B(), new B(), new B()};
  public static void main(String[] args) {
    List<B> l = new ArrayList<B>();  
    Collections.addAll(l, b); 
    System.out.println(l);
    List<B> sub = l.subList(0,1);
    l.removeAll(sub);
    System.out.println(l);

  }
}



