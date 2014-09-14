class A { 
  class B { 
    int i;
    B(int i) { 
      this.i = i;
    }
    int getI() { 
      return i;
    }
  }
}

class Foo extends A.B { 
  Foo(A a) { 
    a.super(2);
  }
  public static void main(String[] args) { 
    A a = new A();
    Foo f = new Foo(a);
    System.out.println(Integer.toString(f.getI()));
  }
}
