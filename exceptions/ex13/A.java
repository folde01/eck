class MyException1 extends Exception { }
class MyException2 extends Exception { }
class MyException3 extends Exception { }

class A { 
  static int i = 0;
  static void f() throws MyException1, MyException2, MyException3 { 
    ++i;
    switch(i) { 
    case 1 : throw new MyException1();
    case 2 : throw new MyException2();
    case 3 : throw new MyException3();
    case 4 : throw new NullPointerException();
    }
  }
  public static void main(String[] args) { 
    for (int i=0; i<4; ++i) { 
      try { 
        f();
      } catch (Exception e) { 
        e.printStackTrace();
      } finally { 
        System.out.println("finally");
      }
    }
  }
}
