//: holding/UniqueWords.java
import java.util.*;
import net.mindview.util.*;

public class CountEachWord {
  public static void main(String[] args) {
    Map<String, Integer> map = new HashMap<String, Integer>();
    List<String> list = new ArrayList<String>();
    for (String w : new TextFile("UniqueWords.java", "\\W+")) {
      Integer numw = map.get(w);
      list.add(w);
      map.put(w, numw == null ? 1 : numw + 1);
    }

    System.out.println(map);

    Collections.sort(list,String.CASE_INSENSITIVE_ORDER);
    System.out.println(list);

    for (String w : new LinkedHashSet<String>(list))
      System.out.println(w + ": " + map.get(w));




  }
}
