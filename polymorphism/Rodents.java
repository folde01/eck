import static net.mindview.util.Print.*;
import java.util.*;

class Rodent { 
  public String toString() { 
    return "I'm a Rodent";
  }
  void sound() { 
    print("Rodent.sound()");
  }
  void move() { 
    print("Rodent.move()");
  }
}

class Mouse extends Rodent { 
  public String toString() { 
    return "I'm a Mouse";
  }
  void sound() { 
    squeak();    
  }
  void move() { 
    run();
  }
  void squeak() { 
    print("Mouse.squeak()");
  }
  void run() { 
    print("Mouse.run()");
  }
}

class Hamster extends Rodent { 
  public String toString() { 
    return "I'm a Hamster";
  }
  void sound() { 
    meep();    
  }
  void move() { 
    squirm();
  }
  void meep() { 
    print("Hamster.meep()");
  }
  void squirm() { 
    print("Hamster.squirm()");
  }
}

class Gerbil extends Rodent { 
  public String toString() { 
    return "I'm a Gerbil";
  }
  void sound() { 
    peep();    
  }
  void move() { 
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
