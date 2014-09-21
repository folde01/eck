//: holding/ListFeatures.java
import typeinfo.pets.*;
import java.util.*;
import static net.mindview.util.Print.*;

public class ListFeatures {
  public static void main(String[] args) {
    Random rand = new Random(47);
    List<Pet> pets = Pets.arrayList(7);
    List<Integer> integers = new ArrayList<Integer>();
    for (int i=0; i<10; i++) { 
      integers.add(i);
    }
    print("1: " + pets);
    print("1: " + integers);
    Hamster h = new Hamster();
    pets.add(h); // Automatically resizes
    Integer n = new Integer(50);
    integers.add(n); // Automatically resizes
    print("2: " + pets);
    print("2: " + integers);
    print("3: " + pets.contains(h));
    print("3: " + integers.contains(n));
    pets.remove(h); // Remove by object
    integers.remove(n); // Remove by object
    Pet p = pets.get(2);
    Integer pi = integers.get(2);
    print("4: " +  p + " " + pets.indexOf(p));
    print("4: " +  pi + " " + integers.indexOf(pi));
    Pet cymric = new Cymric();
    Integer two = new Integer(2);
    print("5: " + pets.indexOf(cymric));
    print("5: " + pets.indexOf(two));
    print("6: " + pets.remove(cymric));
    print("6: " + pets.remove(two));
    // Must be the exact object:
    print("7: " + pets.remove(p));
    print("7: " + integers.remove(pi));
    print("8: " + pets);
    print("8: " + integers);
    pets.add(3, new Mouse()); // Insert at an index
    integers.add(3, new Integer(100)); // Insert at an index
    print("9: " + pets);
    print("9: " + integers);
    List<Pet> sub = pets.subList(1, 4);
    List<Integer> subi = integers.subList(1, 4);
    print("subList: " + sub);
    print("subList: " + subi);
    print("10: " + pets.containsAll(sub));
    print("10: " + integers.containsAll(subi));
    Collections.sort(sub); // In-place sort
    Collections.sort(subi); // In-place sort
    print("sorted subList: " + sub);
    print("sorted subList: " + subi);
    // Order is not important in containsAll():
    print("11: " + pets.containsAll(sub));
    print("11: " + integers.containsAll(subi));
    Collections.shuffle(sub, rand); // Mix it up
    Collections.shuffle(subi, rand); // Mix it up
    print("shuffled subList: " + sub);
    print("shuffled subList: " + subi);
    print("12: " + pets.containsAll(sub));
    print("12: " + integers.containsAll(subi));
    List<Pet> copy = new ArrayList<Pet>(pets);
    List<Integer> copyi = new ArrayList<Integer>(integers);
    sub = Arrays.asList(pets.get(1), pets.get(4));
    subi = Arrays.asList(integers.get(1), integers.get(4));
    print("sub: " + sub);
    print("subi: " + subi);
    copy.retainAll(sub);
    copy.retainAll(subi);
    print("13: " + copy);
    print("13: " + copyi);
    copy = new ArrayList<Pet>(pets); // Get a fresh copy
    copyi = new ArrayList<Integer>(integers); // Get a fresh copy
    copy.remove(2); // Remove by index
    copyi.remove(2); // Remove by index
    print("14: " + copy);
    print("14: " + copyi);
    copy.removeAll(sub); // Only removes exact objects
    copy.removeAll(subi); // Only removes exact objects
    print("15: " + copy);
    print("15: " + copyi);
    copy.set(1, new Mouse()); // Replace an element
    copyi.set(1, new Integer(999)); // Replace an element
    print("16: " + copy);
    print("16: " + copyi);
    copy.addAll(2, sub); // Insert a list in the middle
    copyi.addAll(2, subi); // Insert a list in the middle
    print("17: " + copy);
    print("17: " + copyi);
    print("18: " + pets.isEmpty());
    print("18: " + integers.isEmpty());
    pets.clear(); // Remove all elements
    integers.clear(); // Remove all elements
    print("19: " + pets);
    print("19: " + integers);
    print("20: " + pets.isEmpty());
    print("20: " + integers.isEmpty());
    pets.addAll(Pets.arrayList(4));
    print("21: " + pets);
    print("21: " + integers);
    Object[] o = pets.toArray();
    Object[] oi = integers.toArray();
    print("22: " + o[3]);
    print("22: " + oi[3]);
    Pet[] pa = pets.toArray(new Pet[0]);
    Integer[] ia = integers.toArray(new Integer[0]);
    print("23: " + pa[3].id());
  }
} /* Output:
1: [Rat, Manx, Cymric, Mutt, Pug, Cymric, Pug]
2: [Rat, Manx, Cymric, Mutt, Pug, Cymric, Pug, Hamster]
3: true
4: Cymric 2
5: -1
6: false
7: true
8: [Rat, Manx, Mutt, Pug, Cymric, Pug]
9: [Rat, Manx, Mutt, Mouse, Pug, Cymric, Pug]
subList: [Manx, Mutt, Mouse]
10: true
sorted subList: [Manx, Mouse, Mutt]
11: true
shuffled subList: [Mouse, Manx, Mutt]
12: true
sub: [Mouse, Pug]
13: [Mouse, Pug]
14: [Rat, Mouse, Mutt, Pug, Cymric, Pug]
15: [Rat, Mutt, Cymric, Pug]
16: [Rat, Mouse, Cymric, Pug]
17: [Rat, Mouse, Mouse, Pug, Cymric, Pug]
18: false
19: []
20: true
21: [Manx, Cymric, Rat, EgyptianMau]
22: EgyptianMau
23: 14
*///:~
