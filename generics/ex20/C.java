class C { 
  <T extends A> void mc(T t) { 
    t.m1();
    t.m2();
  }
  
  public static void main(String[] args) { 
    C c = new C();
    c.mc(new B());
  }
}
