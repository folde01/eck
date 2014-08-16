//: reusing/Detergent.java
// Inheritance syntax & properties.
import static net.mindview.util.Print.*;

class Cleanser {
  private String s = "Cleanser";
  public void append(String a) { s += a; }
  public void dilute() { append(" dilute()"); }
  public void apply() { append(" apply()"); }
  public void scrub() { append(" scrub()"); }
  public String toString() { return s; }
  public static void main(String[] args) {
    Cleanser x = new Cleanser();
    x.dilute(); x.apply(); x.scrub();
    print(x);
  }
}	

public class Cheer extends Detergent { 
  public void scrub() { 
    append(" Cheer.scrub()");
    super.scrub(); // Call base-class version
  }
  public void sterilize() { 
    append(" sterilize()");
  }
  public static void main(String[] args) {
    Cheer x = new Cheer();
    x.dilute();
    x.apply();
    x.scrub();
    x.foam();
    print(x);
    print("Testing base class:");
    Detergent.main(args);
  }	
}

class Detergent extends Cleanser {
  // Change a method:
  public void scrub() {
    append(" Detergent.scrub()");
    super.scrub(); // Call base-class version
  }
  // Add methods to the interface:
  public void foam() { append(" foam()"); }
  // Test the new class:
  public static void main(String[] args) {
    Detergent x = new Detergent();
    x.dilute();
    x.apply();
    x.scrub();
    x.foam();
    print(x);
    print("Testing base class:");
    Cleanser.main(args);
  }	
} /* Output:
Cleanser dilute() apply() Detergent.scrub() scrub() foam()
Testing base class:
Cleanser dilute() apply() scrub()
*///:~

class DetergentUsingDelegation { 
  private Cleanser cleanser = new Cleanser();
  public void append(String f) { 
    cleanser.append(f);
  }
  public void scrub() { 
    append(" Detergent.scrub()");
    cleanser.scrub();
  }
  public void dilute() { 
    cleanser.dilute();
  }
  public void apply() { 
    cleanser.apply();
  }
  public void foam() { 
    append(" foam()");
  }
  public String toString() { 
    return cleanser.toString();
  }
  public static void main(String[] args) { 
    DetergentUsingDelegation x = new DetergentUsingDelegation();
    x.dilute();
    x.apply();
    x.scrub();
    x.scrub();
    x.scrub();
    x.foam();
    print(x);
    print("yoda");
    print("Testing base class:");
    Cleanser.main(args);
  }
}
