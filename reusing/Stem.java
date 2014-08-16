import static net.mindview.util.Print.*;

class Component1 { 
  Component1(int i) { 
    print("Component1");
  }
}

class Root { 
  Root(int i) { 
    print("Root");
    Component1 c1 = new Component1(i);
  }
  //static Root r = new Root();
}

class Stem extends Root { 
  Stem(int i) { 
    super(i);
    print("Stem");
  }
  public static void main(String[] args) { 
    new Stem(1);
    new Stem(1);
    new Stem(2);
  }
}
