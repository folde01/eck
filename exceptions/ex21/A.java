// Exercise 21: (2) Demonstrate that a derived-class constructor cannot catch exceptions
// thrown by its base-class constructor.

class C { 
  C() throws Exception { 
    System.out.println("yoda");
    throw new Exception();
  }
}

class B extends C { 
  B() throws Exception { 
    try { 
      C c = new C();
    } catch(Exception e) { 
      e.printStackTrace();
      System.out.println("caught");
    }
  }
}

class A { 
  public static void main(String[] args) { 
    try { 
      //C c = new C();
    } catch(Exception e) { 
      e.printStackTrace();
    }
    try { 
      B b = new B();
    } catch(Exception e) { 
      e.printStackTrace();
    }
  }
}
