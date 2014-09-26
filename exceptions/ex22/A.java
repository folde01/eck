// Exercise 22: (2) Create a class called FailingConstructor with a constructor that
// might fail partway through the construction process and throw an exception. In main( ),
// write code that properly guards against this failure.

import java.util.*;

class FailingConstructor { 
  static Random rand = new Random();
  FailingConstructor() throws Exception { 
    if (rand.nextInt(10) > 3)
      throw new Exception();
  }
}

class A { 
  public static void main(String[] args) { 
    FailingConstructor fc = null;
    try { 
      fc = new FailingConstructor();
    } catch(Exception e) { 
      e.printStackTrace();
    }
    if (fc == null)
      System.out.println("null");
  }
}
