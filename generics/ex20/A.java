class A implements I { 
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

    A i = new A();
    i.m1();
    i.m2();
    i.m3();
  }
}
