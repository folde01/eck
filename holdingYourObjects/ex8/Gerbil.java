import java.util.*;

class A {}


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
    List<A> a = new ArrayList<A>();
    Collections.addAll(a, new A(), new A());
    Iterator ita = a.iterator();
    A a1 = (A)ita.next();

    List<Gerbil> gerbils = new ArrayList<Gerbil>();
    for (int i=0; i<10; i++) { 
      gerbils.add(new Gerbil());
    }
    Iterator<Gerbil> it = gerbils.iterator(); 

    //for (int i=0; i< gerbils.size(); i++) { 
    while(it.hasNext()) {
      //gerbils.get(i).hop();
      Gerbil g = it.next();
      g.hop();
    }
  }
}
