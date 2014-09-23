//: holding/UniqueWords.java
import java.util.*;
import net.mindview.util.*;

class WordEntry implements Comparable {
  String word;
  int count;
  WordEntry(String word) {
    this.word = word;
    count = 1;
  }
  public String toString() {
    return word + ": " + count;
  }
  public int compareTo(Object w) {
    return w == word ? 0 : 1;
  }
}

public class CountEachWord {
  public static void main(String[] args) {
    Map<String, Integer> map = new HashMap<String, Integer>();
    List<String> list = new ArrayList<String>();
    Set<WordEntry> set = new TreeSet<WordEntry>();
    for (String w : new TextFile("UniqueWords.java", "\\W+")) {
      System.out.println("w: " + w);

      Iterator<WordEntry> it = set.iterator();
      boolean newWord = true;
      while(it.hasNext()) {
        WordEntry we = it.next();
        System.out.println("we.word: " + we.word + " w: " + w);
        if (we.word.equals(w)) {
          ++we.count;
          newWord = false; 
        }
      }
      if (newWord) {
        set.add(new WordEntry(w)); 
      }
    }
    Collections.sort(list,String.CASE_INSENSITIVE_ORDER);
    //for (String w : new LinkedHashSet<String>(list))
    //  System.out.println(w + ": " + map.get(w));
    System.out.println(set);





  }
}
