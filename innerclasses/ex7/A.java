class A { 
  private String s = "A.s";
  private void mA() { 
    System.out.println(s);
  }
  void callB() { 
    B b = new B();
    b.mB();
  }
  class B { 
    void mB() { 
      A.this.s = "mB wuz here... runnin ur methdz";
      A.this.mA();
    }
  }
  public static void main(String[] args) { 
    A a = new A();
    a.callB();
  }
}
