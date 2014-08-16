class FooClass {
  FooClass() { 
    System.out.println("FooClass object constructed");
  }
}

public class LazyInitialization { 
  FooClass f;
  LazyInitialization() { 
    System.out.println("LazyInitialization object constructed");
  }
  void makeF() { 
    f = new FooClass();
  }


  public static void main(String[] args) { 
    LazyInitialization li = new LazyInitialization(); 
    li.makeF();
  }
}
