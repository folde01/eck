class A { 
  int i;
  String s = "abc";
  A(int i) {
    this.i = i;
  }
}

class B { 
  A m() { 
    return new A(1) {
      public int ii() { 
        return i;
      }
    };
  }
  public static void main(String[] args) { 
    B b = new B();
    A a = b.m();
    System.out.println(a.i);
  }
}
