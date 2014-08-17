//: reusing/Beetle.java
// The full process of initialization.
import static net.mindview.util.Print.*;

class Insect {
  private int i = 9;
  protected int j;
  Insect() {
    print("i = " + i + ", j = " + j);
    j = 39;
  }
  private static int x1 =
    printInit("static Insect.x1 initialized");
  static int printInit(String s) {
    print(s);
    return 47;
  }
}

class Beetle extends Insect {
  private int k = printInit("Beetle.k initialized");
  public Beetle() {
    print("k = " + k);
    print("j = " + j);
  }
  private static int x2 =
    printInit("static Beetle.x2 initialized");
  static void main2() { 
    print("main2 starting");
    Beetle b = new Beetle();
    print("main2 done");
  }
  /*
  public static void main(String[] args) {
    print("Beetle constructor");
    Beetle b = new Beetle();
    main2();
  }
  */
} 

class Ladybug extends Beetle { 
  public static void main(String[] args) { 
    print("Ladybug makin...");
    Ladybug b = new Ladybug();
  }
}

/* Output:
static Insect.x1 initialized
static Beetle.x2 initialized
Beetle constructor
i = 9, j = 0
Beetle.k initialized
k = 47
j = 39
*///:~
