//: holding/NonCollectionSequence.java
import typeinfo.pets.*;
import java.util.*;

class PetSequence {
  protected Pet[] pets = Pets.createArray(8);
}

public class NonCollectionSequence extends PetSequence implements Iterable {
  public Iterable<Pet> reversed() {
    return new Iterable<Pet>() {
      public Iterator<Pet> iterator() {
        return new Iterator<Pet>() {
          private int index = pets.length - 1;
          public boolean hasNext() {
            return index > -1;
          }
          public Pet next() { return pets[index--]; }
          public void remove() { throw new UnsupportedOperationException(); }
        };
      }
    };
  }
  public Iterator<Pet> iterator() {
    return new Iterator<Pet>() {
      private int index = 0;
      public boolean hasNext() {
        return index < pets.length;
      }
      public Pet next() { return pets[index++]; }
      public void remove() { // Not implemented
        throw new UnsupportedOperationException();
      }
    };
  }
  public static void main(String[] args) {
    NonCollectionSequence nc = new NonCollectionSequence();
    InterfaceVsIterator.display(nc.iterator());
    //InterfaceVsIterator.display(nc.reversed());
  }
} /* Output:
0:Rat 1:Manx 2:Cymric 3:Mutt 4:Pug 5:Cymric 6:Pug 7:Manx
*///:~
