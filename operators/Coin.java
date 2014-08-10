import java.util.Random;

public class Coin { 
  String flip() { 
    String result;
    Random rand = new Random();
    int hi = 100000;
    int r = rand.nextInt(hi);
    if (r >= hi/2) { 
      result = "heads";
    } else { 
      result = "tails";
    }
    return result;
  }
  public static void main(String[] args) { 
    Coin coin = new Coin();
    int i = 0;
    while (i++ < 100000) { 
      System.out.println(coin.flip());
    }
  }
}
