package pkg2;
import pkg1.Interface1;

public class A { 
  protected class B implements Interface1 { 
    public void method1() { 
      System.out.println("B.method1()");
    }
  }
  public B getB() { 
    return new B();
  }
  public static void main(String[] args) { 
    A a = new A();
    A.B ab = a.new B();
    ab.method1();
  }
}
