class MyException1 extends Exception { }
class MyException2 extends Exception { }
class MyException3 extends Exception { }

class A { 
  static int i = 0;
  static void f() throws MyException1, MyException2, MyException3 { 
    ++i;
    if (i == 1) throw new MyException1();
    if (i == 2) throw new MyException2();
    if (i == 3) throw new MyException3();
  }
  public static void main(String[] args) { 
    for (int i=0; i<3; ++i) { 
      try { 
        f();
      } catch (Exception e) { 
        e.printStackTrace();
      }
    }
  }
}
