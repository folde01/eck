interface I { 
  void m();
}

class A { 
  I f() { 
    if (1 == 1) { 
      class B implements I {
        public void m() { 
          System.out.println("B.m()");
        }
      }
    return new B();
    } else return null;
  }
  public static void main(String[] args) { 
    A a = new A();
    I i = a.f();
    i.m();
  }
}
