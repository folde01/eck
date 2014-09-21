import static net.mindview.util.Print.*;
import java.util.*;

class Trait { 
  private String s;
  Trait(String s) { 
    this.s = s;
    print("Trait: " + s);
  }
}

class Rodent { 

  Trait t = new Trait("Rodenty");

  Rodent() { 
    print("Rodent()");
  }
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
  Trait t = new Trait("Mousey");
  Mouse() { 
    print("Mouse()");
  }

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
  Trait t = new Trait("Hamstery");
  Hamster() { 
    print("Hamster()");
  }
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
  Trait t = new Trait("Gerbilly");
  Gerbil() { 
    print("Gerbil()");
  }
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
  //static Rodent[] rodents = new Rodent[numRod];
  static List<Rodent> rodents = new ArrayList<Rodent>();

  public static void main(String[] args) { 
    print("Looping...");
	  for (int i = 0; i < numRod; i++) { 
	    rodents.add(RandomRodentGenerator.next()); 
	  }
    Iterator<Rodent> it = rodents.iterator();
	  //for (Rodent r : rodents) { 
	  while (it.hasNext()) { 
      Rodent r = it.next();
	    print(r);
	    r.sound();
	    r.move();
	  }
  }
}
