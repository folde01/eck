//: exceptions/Human.java
// Catching exception hierarchies.

class Annoyance extends RuntimeException {}
class Sneeze extends Annoyance {}

public class Human {
  public static void main(String[] args) {
    // Catch the exact type:
    try {
      throw new Sneeze();
    } catch(RuntimeException re) {
      System.out.println("Caught re");
      try { 
        throw re.getCause();
      } catch(Throwable sn) { 
        System.out.println("Caught Snees");
        sn.printStackTrace();
      }
    }
    // Catch the base type:
    try {
      throw new Sneeze();
    } catch(Annoyance a) {
      System.out.println("Caught Annoyance");
    }
  }
} /* Output:
Caught Sneeze
Caught Annoyance
*///:~
