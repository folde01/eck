import java.util.*;

class Gerbil { 
  private static long counter;
  private final long gerbilNumber;
  Gerbil() { 
    gerbilNumber = counter++;
  }
  void hop() { 
    System.out.println("Gerbil " + gerbilNumber + " is hopping.");
  }
  public static void main(String[] args) { 
    List<Gerbil> gerbils = new ArrayList<Gerbil>();
    Map<String,Gerbil> gerbilMap = new HashMap<String,Gerbil>();
    for (int i=0; i<10; i++) { 
      gerbils.add(new Gerbil());
    }
    for (int i=0; i< gerbils.size(); i++) { 
      gerbils.get(i).hop();
    }
    gerbilMap.put("Fuzzy", new Gerbil());
    gerbilMap.put("Bear", new Gerbil());
    gerbilMap.put("Goober", new Gerbil());
    gerbilMap.put("Millie", new Gerbil());
    Iterator<String> it = gerbilMap.keySet().iterator();
    while(it.hasNext()) {
      String name = it.next();
      System.out.println(name);
      Gerbil g = gerbilMap.get(name);
      g.hop();

    }
  }
}
