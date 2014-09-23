//: holding/UniqueWords.java
import java.util.*;
import net.mindview.util.*;

public class CountEachWord {
  public static void main(String[] args) {
    Map<String, Integer> map = new HashMap<String, Integer>();
    for (String w : new TextFile("UniqueWords.java", "\\W+")) {
      Integer numw = map.get(w);
      map.put(w, numw == null ? 1 : numw + 1);
    }

    System.out.println(map);


  }
}
