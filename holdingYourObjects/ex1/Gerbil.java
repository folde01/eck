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
    for (int i=0; i<10; i++) { 
      gerbils.add(new Gerbil());
    }
    for (int i=0; i< gerbils.size(); i++) { 
      gerbils.get(i).hop();
    }
  }
}
