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
  public static void main(String[] args) { 
    try { 
      throw new MyException("foo");
    } catch (MyException e) { 
      e.printMsg();
      e.printStackTrace();
    } finally { 
      System.out.println("finally");
    }

  }
}
