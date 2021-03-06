//: generics/RandomList.java
import java.util.*;

public class RandomList<T> {
  private ArrayList<T> storage = new ArrayList<T>();
  private Random rand = new Random(47);
  public void add(T item) { storage.add(item); }
  public T select() {
    return storage.get(rand.nextInt(storage.size()));
  }
  public static void main(String[] args) {
    RandomList<String> rs = new RandomList<String>();
    RandomList<Integer> ri = new RandomList<Integer>();
    for(String s: ("The quick brown fox jumped over " +
        "the lazy brown dog").split(" "))
      rs.add(s);
    for(int i = 0; i < 11; i++) { 
      System.out.print(rs.select() + " ");
      ri.add(i);
    }
    for(int i = 0; i < 11; i++) 
      System.out.print(ri.select() + " ");
  }
} /* Output:
brown over fox quick quick dog brown The brown lazy brown
*///:~
