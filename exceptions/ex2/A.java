class A { 
  void method1() {}
  public static void main(String[] args) { 
    A a = null;
    try { 
      a.method1();
    } catch (NullPointerException e) { 
      e.printStackTrace(System.out);
    } finally { 
      System.out.println("finally");
    }
  }
}
