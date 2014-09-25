class MyException extends Exception { 
  String msg;
  MyException(String msg) { 
    this.msg = msg;
  }
  void printMsg() { 
    System.out.println(msg);
  }
}

class A { 
  static void f() throws MyException { 
    throw new MyException("throwing from A.f()");
  }
  public static void main(String[] args) { 
    try { 
      //throw new MyException("foo");
      f(); 
    } catch (MyException e) { 
      e.printMsg();
      e.printStackTrace();
    } finally { 
      System.out.println("finally");
    }

  }
}
