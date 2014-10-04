//: polymorphism/Shapes.java
// Polymorphism in Java.
import polymorphism.shape.*;

public class Shapes {
  static void rotate(Shape shp) { 
    if (! (shp instanceof Circle)) { 
      Class cls = shp.getClass();
      System.out.println("Rotating " + cls.getSimpleName());
    }
  }


  private static RandomShapeGenerator gen =
    new RandomShapeGenerator();
  public static void main(String[] args) {
    Shape[] s = new Shape[9];
    // Fill up the array with shapes:
    for(int i = 0; i < s.length; i++)
      s[i] = gen.next();
    // Make polymorphic method calls:
    String toHighlight = "Triangle";
    for(Shape shp : s) { 
      shp.draw();
      rotate(shp);
      Class cls = shp.getClass();
      if (cls.getSimpleName().equals(toHighlight)) { 
        shp.toggleHighlight();
      }
      System.out.println(shp);
      System.out.println("---------------");
    }
    Shape r = new Rhomboid();
    if (r instanceof Circle) { 
      Circle c = (Circle)r;
      System.out.println("yoda");
    }
    if (r instanceof Rhomboid) { 
      System.out.println("yoda2");
      Rhomboid r2 = (Rhomboid)r;
    }
  }
} 
