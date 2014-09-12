interface I { 
  void m();
}

class A { 
  I f() { 
    class B implements I {
      public void m() { 
        System.out.println("B.m()");
      }
    }
    return new B();
  }
  public static void main(String[] args) { 
    A a = new A();
    I i = a.f();
    i.m();
  }
}
