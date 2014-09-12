package pkg3;
import pkg2.A;
import pkg1.Interface1;

class C extends A { 
  public B getB() {
    return super.getB();
  }
  public Interface1 getInterface1() {
    return (Interface1)getB();
  }
  public static void main(String[] args) { 
    C c = new C();
    B b = c.getB();
    b.method1();
    Interface1 i1 = c.getInterface1();
    i1.method1();
  }
}
