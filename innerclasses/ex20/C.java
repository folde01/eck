interface A { 
  void f();
  class B implements A { 
    public void f() { 
      System.out.println("B.f()");
    }
  }
}

class C implements A { 
  public void f() { 
  }
  static B b() { 
    return new B();
  }
  public static void main(String[] args) { 
    C c = new C();
    B b = c.b();
    b.f();
  }
}
