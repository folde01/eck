import java.lang.reflect.*;

class A extends B { 
  static void showClasses(Object o) { 
    Class c = o.getClass();
    if (c.getName().equals("java.lang.Object")) { 
      System.out.println("java.lang.Object");
      return;
    }
    else { 
      System.out.println(c.getName());
      for (Field f : c.getDeclaredFields()) { 
        System.out.println("yoda");
        System.out.println(f);
      }
      System.out.println("-------------");
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
class C {
  int i = 1;
}
