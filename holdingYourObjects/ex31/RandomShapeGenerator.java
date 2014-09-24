//: polymorphism/shape/RandomShapeGenerator.java
// A "factory" that randomly creates shapes.
import java.util.*;

public class RandomShapeGenerator implements Iterable<Shape> {
  int n;
  RandomShapeGenerator(int n) {
    this.n = n;
  }
  private Random rand = new Random(47);
  public Shape next() {
    switch(rand.nextInt(3)) {
      default:
      case 0: return new Circle();
      case 1: return new Square();
      case 2: return new Triangle();
    }
  }
  public Iterator<Shape> iterator() {
    return new Iterator<Shape>() {
      private int index = 0;
      public boolean hasNext() {
        return index < n; 
      }
      public Shape next() {
        index++;
        return RandomShapeGenerator.this.next();
        //return new Circle();
      }
      public void remove() { throw new UnsupportedOperationException(); }
    };
  }
} ///:~
