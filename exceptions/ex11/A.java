class A { 
  static void f() throws MyException2 { 
    try { 
      g();
    } catch(MyException1 e) { 
      e.printStackTrace();
      throw new RuntimeException("from f()");
    }
  }
  static void g() throws MyException1 { 
    throw new MyException1("from g()");
  }
  public static void main(String[] args) { 
    try { 
      f();
    } catch(MyException2 e) { 
      e.printStackTrace();
    }
  }
}

class MyException1 extends Exception { 
  MyException1(String msg) { super(msg); }
}
class MyException2 extends Exception { 
  MyException2(String msg) { super(msg); }
}
