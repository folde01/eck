abstract class A { 
  A() { print(); }
  abstract void print();
}

class B extends A { 
  private int i = 1;
  void print() { 
    System.out.println("B.i:" + i);
  }
}

class Ex3 { 
  public static void main(String[] args) { 
    B b = new B();
    b.print();
  }
}
