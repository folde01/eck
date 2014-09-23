// Exercise 18: (3) Fill a HashMap with key-value pairs. Print the results to show
// ordering by hash code. Extract the pairs, sort by key, and place the result into a
// LinkedHashMap. Show that the insertion order is maintained.

import java.util.*;

class A {
  public static void main(String[] args) {
    Map<Integer, Integer> m = new HashMap<Integer, Integer>();
    Random rand = new Random();
    for (int i=0; i<20; i++) {
      int r = rand.nextInt(i+1);
      m.put(r, r*100);
      System.out.println(m.get(r) + ":");
      System.out.println(m.hashCode());
    }
    System.out.println(m);
    Map<String, String> sm = new HashMap<String, String>();
    sm.put("99a", "abc");
    sm.put("a", "abc");
    sm.put("A", "dabc");
    sm.put("1z", "fbc");
    sm.put("LKd", "1fbc");
    sm.put("lKd", "a1fbc");
    sm.put("LKe", "g2fbc");
    System.out.println(sm);
    System.out.println(sm.get("LKe").hashCode());
    System.out.println(sm.get("LKd").hashCode());
    System.out.println(sm.get("1z").hashCode());
    System.out.println(sm.get("a").hashCode());
    System.out.println(sm.get("99a").hashCode());
    Set<String> keys = new TreeSet<String>();
    keys = sm.keySet();
    System.out.println(keys);
    LinkedHashMap<String, String> lhm = new LinkedHashMap<String, String>();
    for (String k : keys)
      lhm.put(k, sm.get(k));
    System.out.println(lhm);



    
  }
}
