import net.mindview.util.*;
import java.util.*;

class B extends A {}
class A { 
  public static void main(String[] args) { 
    Map<A, List<? extends A>> map = New.map();
  }
}
