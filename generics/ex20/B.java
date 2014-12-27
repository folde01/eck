class B { 
  <T extends I> void m1(T x) { 
    x.m1();
    x.m2();
  }
  public static void main(String[] args) { 
    B b = new B();
    I i = new A();
    b.m1(i);

  }

}
