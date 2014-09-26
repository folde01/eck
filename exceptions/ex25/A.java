class E1 extends Exception { }
class E2 extends E1 { }
class E3 extends E2 { }

class A { 
  void f() throws E1 { 
    throw new E1();
  }
  public static void main(String[] args) { 
    A c = new C();
    try { 
      c.f();
    } catch(E1 e) { 
      e.printStackTrace();
    }

  }
}

class B extends A { 
  void f() throws E2 { 
    throw new E2();
  }
}

class C extends B { 
  void f() throws E3 { 
    throw new E3();
  }
}


