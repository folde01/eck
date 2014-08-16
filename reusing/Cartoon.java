//: reusing/Cartoon.java
// Constructor calls during inheritance.
import static net.mindview.util.Print.*;

class Art {
  Art() { print("Art constructor"); }
}

class Drawing extends Art {
  Drawing() { print("Drawing constructor"); }
}

public class Cartoon extends Drawing {
  //public Cartoon() { print("Cartoon constructor"); }
  static void f() { 
    print("f");
  }
  public static void main(String[] args) {
    Cartoon x = new Cartoon();
    Cartoon.f();
  }
} /* Output:
Art constructor
Drawing constructor
Cartoon constructor
*///:~
