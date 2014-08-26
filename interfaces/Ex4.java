abstract class A { 
  abstract void method1();
}

class B extends A { 
  static private A a;
  void method1() { 
    System.out.println("B.method1()");
  }
  static void method2() { 
    a = new B();
    //((B)a).method1();
    a.method1();
  }
}

public class Ex4 { 
  public static void main(String[] args) { 
    B.method2();
  }
}
