interface A { 
  void m1();
  void m2();
}

class B implements A { 
  public void m1() { 
    System.out.println("m1()");
  }
  public void m2() { 
    System.out.println("m2()");
  }
  public void m3() { 
    System.out.println("m3()");
  }
  public static void main(String[] args) { 
    B b = new B();
    b.m1();
    b.m2();
    b.m3();
  }
}
