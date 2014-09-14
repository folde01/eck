interface A { 
  void g();
  class B implements A { 
    public void g() { 
      System.out.println("B.g()");
    }
    static void f(A a) { 
      a.g();
    }
  }
}

class C implements A { 
  public void g() { 
    System.out.println("C.g()");
  }
  public static void main(String[] args) { 
    A c = new C();
    new B().f(c);
  }
}
