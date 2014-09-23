import java.util.*;

class A {
  public static void main(String[] args) {
    Map<String,Integer> map = new LinkedHashMap<String,Integer>();
    map.put("ab", 2);
    map.put("abc", 3);
    map.put("abcd", 4);
    map.put("bcd", 3);
    map.put("3e", 2);
    System.out.println(map);
    TreeMap<String,Integer> smap = new TreeMap<String,Integer>(map);
    System.out.println(smap);
    map.clear();
    map.putAll(smap);
    System.out.println(map);
  }
}
