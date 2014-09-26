// Exercise 22: (2) Create a class called FailingConstructor with a constructor that
// might fail partway through the construction process and throw an exception. In main( ),
// write code that properly guards against this failure.

// Exercise 23: (4) Add a class with a dispose( ) method to the previous exercise. Modify
// FailingConstructor so that the constructor creates one of these disposable objects as a
// member object, after which the constructor might throw an exception, after which it creates a
// second disposable member object. Write code to properly guard against failure, and in
// main( ) verify that all possible failure situations are covered.

import java.util.*;

class FailingConstructor { 
  static Random rand = new Random();
  HasDispose hd1 = null;
  HasDispose hd2 = null;

  void dispose1() { 
    hd1.dispose();
  }
  void dispose2() { 
    hd2.dispose();
  }

  FailingConstructor() throws Exception { 
    hd1 = new HasDispose();
    if (rand.nextInt(10) > 3)
      throw new Exception();
    hd2 = new HasDispose();
  }
}

class HasDispose { 
  void dispose() { 
    System.out.println("HasDispose.dispose()");
  }
}

class A { 
  public static void main(String[] args) { 
    FailingConstructor fc = null;
    try { 
      fc = new FailingConstructor();
      try { 
      } finally { 
        fc.dispose1();
        fc.dispose2();
      }
    } catch(Exception e) { 
      e.printStackTrace();
    }
    if (fc == null)
      System.out.println("null");
  }
}
