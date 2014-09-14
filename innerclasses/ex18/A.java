class A { 
  static class B { 
    void f() { 
      System.out.println("B.f()");
    }
  }
  static B b() { 
    return new B();
  }
  public static void main(String[] args) { 
    B b = b(); 
    b.f();
  }
}
