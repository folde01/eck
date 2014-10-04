class A extends B { 
  static void showClasses(Object o) { 
    Class c = o.getClass();
    if (c.getName().equals("java.lang.Object")) { 
      System.out.println("java.lang.Object");
      return;
    }
    else { 
      System.out.println(c.getName());
      try { 
        showClasses(c.getSuperclass().newInstance());
      } catch(Exception e) { 
        e.printStackTrace();
      }
    }
  }
  public static void main(String[] args) { 
    A a = new A();
    showClasses(a);
  }
}

class B extends C {}
class C {}
