//: generics/ClassTypeCapture.java
import java.util.*;

class Building {}
class House extends Building {}

public class ClassTypeCapture<T> {
  static int n = 0;
  Class<T> kind;
  Map<String,Class<?>> map;
  public ClassTypeCapture(Class<T> kind) {
    this.kind = kind;
    map = new HashMap<String,Class<?>>();
    System.out.println("n: " + ++n);
  }
  public boolean f(Object arg) {
    return kind.isInstance(arg);
  }	
  public void addType(String typename, Class<?> kind) { 
    map.put(typename, kind);
  }
  public T createNew(String typename) { 
    if map.containsKey(typename) { 

    } else { 
      System.out.println("No " + typename + " class available.");
      return null;
    }

  }
  public static void main(String[] args) {
    ClassTypeCapture<Building> ctt1 =
      new ClassTypeCapture<Building>(Building.class);
    System.out.println(ctt1.f(new Building()));
    System.out.println(ctt1.f(new House()));
    ctt1.addType("BLDG", Building.class);
    ClassTypeCapture<House> ctt2 =
      new ClassTypeCapture<House>(House.class);
    System.out.println(ctt2.f(new Building()));
    System.out.println(ctt2.f(new House()));
  }
} /* Output:
true
true
false
true
*///:~
