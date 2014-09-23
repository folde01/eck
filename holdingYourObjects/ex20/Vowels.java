import net.mindview.util.*;
import java.util.*;

class Vowels {
  public static void main(String[] args) {
    Set<String> words = new LinkedHashSet<String>(new TextFile("UniqueWords.java", "\\W+")); 
    System.out.println(words);
    Iterator<String> it = words.iterator();
    Set<Character> vowels = new HashSet<Character>();
    Collections.addAll(vowels, 'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u');
    Map<Character, Integer> vmap = new HashMap<Character, Integer>();
    int total = 0;
    while(it.hasNext()) {
      //List<Character> chars = new ArrayList<Character>();
      int cur = 0;
      String w = it.next();
      for (char c : w.toCharArray()) 
        //chars.add(c);
        for (char v : vowels) 
          if (c == v) {
            Integer numv = vmap.get(v);
            vmap.put(c, vmap.get(v) == null ? 1 : numv + 1);
            ++total;
            ++cur;
          }
      System.out.println(w + ": " + cur);
    }
    System.out.println("total: " + total);
    System.out.println(vmap);

  }
}
