class A { 
  private String s = "abc";
  private void m() { 
   System.out.println("A.m()");
  }
  static A foo() { 
    return new A() { 
      String s = "123";
    };
  }
  public static void main(String[] args) { 
    A a = foo();
    a.m();
    System.out.println(a.s);
    System.out.println(foo().s);
  }
}
