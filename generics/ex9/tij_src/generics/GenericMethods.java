//: generics/GenericMethods.java

public class GenericMethods {
  public <T,U,Integer> void f(T x, U u, Integer i) {
    System.out.println(x.getClass().getName());
    System.out.println(u.getClass().getName());
    System.out.println(i.getClass().getName());
  }
  public static void main(String[] args) {
    GenericMethods gm = new GenericMethods();
    gm.f("", 1, 8);
    gm.f(1.0F, gm, 4);
  }
} /* Output:
java.lang.String
java.lang.Integer
java.lang.Double
java.lang.Float
java.lang.Character
GenericMethods
*///:~
