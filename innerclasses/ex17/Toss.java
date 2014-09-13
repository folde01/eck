
interface Tossable { 
  int toss();
}
interface TossableFactory { 
  Tossable getTossable(); 
}
class Coin implements Tossable { 
  public int toss() { 
    return 2;
  }
  public static TossableFactory factory = new TossableFactory() { 
    public Tossable getTossable() { return new Coin(); }
  };
}
class Dice implements Tossable { 
  public int toss() { 
    return 12;
  }
  public static TossableFactory factory = new TossableFactory() { 
    public Tossable getTossable() { return new Dice(); }
  };
}

public class Toss { 
  static void toss(TossableFactory factory) { 
    Tossable t = factory.getTossable();
    System.out.println("Toss: " + t.toss());
  }
  public static void main(String[] args) { 
    toss(Dice.factory);
    toss(Coin.factory);
  }
}
