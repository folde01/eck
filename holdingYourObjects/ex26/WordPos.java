//: holding/UniqueWords.java
import java.util.*;
import net.mindview.util.*;

public class WordPos {
  public static void main(String[] args) {
    Map<String, ArrayList<Integer>> map = new HashMap<String, ArrayList<Integer>>();
    int pos = 0;
    for (String w : new TextFile("words.txt", "\\W+")) {
      ++pos;
      ArrayList<Integer> wposlist = new ArrayList<Integer>();
      if (map.get(w) == null) 
        wposlist.add(pos);
      else {
        wposlist.addAll(map.get(w));
        wposlist.add(pos);
      }
      map.put(w, wposlist);
    }
    System.out.println(map);
    Map<Integer,String> sentence = new TreeMap<Integer,String>();
    for (String k : map.keySet()) {
      List<Integer> posl = new ArrayList<Integer>(map.get(k));
      for (int i : posl)
        sentence.put(i,k);
    }
    System.out.println(sentence);
  }
}
