//: holding/Statistics.java
// Simple demonstration of HashMap.
import java.util.*;

public class Statistics {
  static Map<Integer,Integer> run() {
    Random rand = new Random();
    Map<Integer,Integer> m = new HashMap<Integer,Integer>();
    for(int i = 0; i < 10000; i++) {
      // Produce a number between 0 and 20:
      int r = rand.nextInt(20);
      Integer freq = m.get(r);
      m.put(r, freq == null ? 1 : freq + 1);
    }
    System.out.println(m);
    return m;
  }
  public static void main(String[] args) {
    Map<Integer,Integer> mtot = new HashMap<Integer,Integer>();
    for(int i=0; i<80000; ++i) {
      Map<Integer,Integer> m = run();
      for (int k : m.keySet()) {
        int v = m.get(k);
        Integer freq = mtot.get(k);
        mtot.put(k, freq == null ? 1 : freq + v);
      }
    }
    System.out.println(mtot);
  }
}
