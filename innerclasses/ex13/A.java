interface I { 
  void m();
}

class A { 
  I n() { 
    return new I() { 
      public void m() { System.out.println("anon m()"); };
    };
  }
  public static void main(String[] args) { 
    A a = new A();
    I i = a.n();
    i.m();
  }
  
}

