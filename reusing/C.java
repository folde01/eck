class A { 
  A(int i) { 
    System.out.println("A");
  }
}

class B { 
  B(int i) { 
    System.out.println("B");
  }
}

class C extends A { 
  C(int i) { 
    super(i);
  }
  static B bs = new B(1);
  B b = new B(1);
  public static void main(String[] args) { 
    C c = new C(1);
  }
} 
