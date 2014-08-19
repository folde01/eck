class Cycle {
  int wheels() { 
    return 0;
  }
}

class Unicycle extends Cycle {
}

class Bicycle extends Cycle {
  @Override
  int wheels() { 
    return 2;
  }
}

class Cycling { 
  static void ride(Cycle c) { 
    System.out.println("Cycling.ride()");
  }
  public static void main(String[] args) { 
    /*
    ride(new Bicycle());
    ride(new Unicycle());
    ride(new Cycle());
    */
    Bicycle b = new Bicycle();
    ride(b);
    System.out.println(b.wheels());
    Unicycle u = new Unicycle();
    ride(u);
    Cycle c = new Cycle();
    ride(c);
    System.out.println(c.wheels());
  }
}

