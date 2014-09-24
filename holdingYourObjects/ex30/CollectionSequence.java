//: holding/CollectionSequence.java
// Exercise 30: (5) Modify CollectionSequence.java so that it does not inherit from AbstractCollection, but instead implements Collection.

import typeinfo.pets.*;
import java.util.*;

//public class CollectionSequence extends AbstractCollection<Pet> {
public class CollectionSequence implements Collection<Pet> {
  private Pet[] pets = Pets.createArray(8);
  public int size() { return pets.length; }

  public void clear() { throw new UnsupportedOperationException(); }

  public boolean retainAll(Collection c) { throw new UnsupportedOperationException(); }
  public boolean removeAll(Collection c) { throw new UnsupportedOperationException(); }
  public boolean addAll(Collection c) { throw new UnsupportedOperationException(); }
  public boolean containsAll(Collection c) { throw new UnsupportedOperationException(); }
  public boolean remove(Object o) { throw new UnsupportedOperationException(); }
  public boolean add(Pet p) { throw new UnsupportedOperationException(); }
  public Object[] toArray() { throw new UnsupportedOperationException(); }
  public <Pet> Pet[] toArray(Pet[] a) { throw new UnsupportedOperationException(); }
  public boolean contains(Object o) { throw new UnsupportedOperationException(); }
  public boolean isEmpty() { throw new UnsupportedOperationException(); }

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
    CollectionSequence c = new CollectionSequence();
    InterfaceVsIterator.display(c);
    InterfaceVsIterator.display(c.iterator());
  }
} /* Output:
0:Rat 1:Manx 2:Cymric 3:Mutt 4:Pug 5:Cymric 6:Pug 7:Manx
0:Rat 1:Manx 2:Cymric 3:Mutt 4:Pug 5:Cymric 6:Pug 7:Manx
*///:~
