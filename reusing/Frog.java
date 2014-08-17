import static net.mindview.util.Print.*;

class Amphibian { 
  void swim() { 
    print("swim()");
  }
  static void gonzo(Amphibian a) { 
    a.swim();
  }
}

class Frog extends Amphibian { 
  void swim() { 
    print("frogswim()");
  }
  public static void main(String[] args) { 
    Frog f = new Frog();
    Amphibian.gonzo(f);
  }
}
