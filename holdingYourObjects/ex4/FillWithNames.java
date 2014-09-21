import java.util.*;

class NameGenerator { 

  String[] names;
  NameGenerator(String[] names) { 
    this.names = names;
  }
  private int i = 0;
  String next() { 
    return i < names.length-1 ? names[i++] : names[i=0];
  }
}

class FillWithNames { 
  static Collection<String> fillCollection(Collection<String> c, String[] s, int max) { 
    NameGenerator g = new NameGenerator(s);
    for (int i=0; i < max; i++) { 
      c.add(g.next());
    }
    return c;
  }

  public static void main(String[] args) { 

    String[] names = new String[] { 
      "A",
      "B",
      "C",
      "D",
      "E",
      "F",
      "G"
    };

    int maxNames = 20;
    NameGenerator g = new NameGenerator(names);

    int size = 10;
    String[] s = new String[10]; 
    for (int i=0; i < s.length; i++) { 
      s[i] = g.next();
    }

    System.out.println(Arrays.toString(s));
    System.out.println(fillCollection(new ArrayList<String>(), names, 20));
    System.out.println(fillCollection(new LinkedList<String>(), names, 20));
    System.out.println(fillCollection(new HashSet<String>(), names, 20));
    System.out.println(fillCollection(new LinkedHashSet<String>(), names, 20));
    System.out.println(fillCollection(new TreeSet<String>(), names, 20));

  }
}
