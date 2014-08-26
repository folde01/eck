import static net.mindview.util.Print.*;
import java.util.*;

class Trait { 
  private String s;
  Trait(String s) { 
    this.s = s;
    print("Trait: " + s);
  }
}

//abstract class Rodent { 
interface Rodent { 

  //Trait t;

  String toString();
  void sound();
  void move();

  /*
  public String toString() { 
    return "I'm a Rodent";
  }
  void sound() { 
    print("Rodent.sound()");
  }
  void move() { 
    print("Rodent.move()");
  }
  */

}

class Mouse implements Rodent { 
  Trait t = new Trait("Mousey");
  Mouse() { 
    print("Mouse()");
  }

  public String toString() { 
    return "I'm a Mouse";
  }
  public void sound() { 
    squeak();    
  }
  public void move() { 
    run();
  }
  void squeak() { 
    print("Mouse.squeak()");
  }
  void run() { 
    print("Mouse.run()");
  }
}

class Hamster implements Rodent { 
  Trait t = new Trait("Hamstery");
  Hamster() { 
    print("Hamster()");
  }
  public String toString() { 
    return "I'm a Hamster";
  }
  public void sound() { 
    meep();    
  }
  public void move() { 
    squirm();
  }
  void meep() { 
    print("Hamster.meep()");
  }
  void squirm() { 
    print("Hamster.squirm()");
  }
}

class Gerbil implements Rodent { 
  Trait t = new Trait("Gerbilly");
  Gerbil() { 
    print("Gerbil()");
  }
  public String toString() { 
    return "I'm a Gerbil";
  }
  public void sound() { 
    peep();    
  }
  public void move() { 
    scurry();
  }
  void peep() { 
    print("Gerbil.peep()");
  }
  void scurry() { 
    print("Gerbil.scurry()");
  }
}

class RandomRodentGenerator { 

  private static Random rand = new Random();

  public static Rodent next() { 
    print("Filling array...");
    int i = rand.nextInt(3);
    switch(i) { 
      default: 
      case 0: return new Gerbil();
      case 1: return new Mouse();
      case 2: return new Hamster();
    }
  }

}

class Rodents { 
  static int numRod = 10; 
  static Rodent[] rodents = new Rodent[numRod];

  public static void main(String[] args) { 
    print("Looping...");
	  for (int i = 0; i < numRod; i++) { 
	    rodents[i] = RandomRodentGenerator.next(); 
	  }
	  for (Rodent r : rodents) { 
	    print(r);
	    r.sound();
	    r.move();
	  }
  }
}
