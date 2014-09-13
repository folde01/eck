interface Cycle { 
  int wheels();
}

interface CycleFactory { 
  Cycle getCycle();
}

class Bicycle implements Cycle { 
  public int wheels() { 
    return 2;
  }
  public static CycleFactory factory = new CycleFactory() { 
    public Cycle getCycle() { return new Bicycle(); };
  };
}

class Unicycle implements Cycle { 
  public int wheels() { 
    return 1;
  }
  public static CycleFactory factory = new CycleFactory() { 
    public Cycle getCycle() { return new Unicycle(); };
  };
}
class Tricycle implements Cycle { 
  public int wheels() { 
    return 3;
  }
  public static CycleFactory factory = new CycleFactory() { 
    public Cycle getCycle() { return new Tricycle(); };
  };
}

public class Cycling { 
  public static void cycle(CycleFactory factory) { 
    Cycle c = factory.getCycle();
    System.out.println("Wheels: " + c.wheels());
  }
  public static void main(String[] args) { 
    cycle(Bicycle.factory);
    cycle(Tricycle.factory);
    cycle(Unicycle.factory);
  }
}
