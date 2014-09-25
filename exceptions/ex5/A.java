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
    boolean b = false;
    int i = 0;
    while(b == false) { 
      try { 
        ++i;
        if (i > 10)
          b = true;
        if (b == false)
          throw new MyException("foo");
      } catch (MyException e) { 
        e.printMsg();
        e.printStackTrace();
      } finally { 
        System.out.println("finally");
      }
    }
    System.out.println("resumed");

  }
}
