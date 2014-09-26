class MyException extends RuntimeException { 
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
      throw new MyException("foo");
  }
}
