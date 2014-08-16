import static net.mindview.util.Print.*;

class NonDefault { 
  NonDefault(int i) { 
    print("NonDefault(int i)");    
  }
}

class HasBoth extends NonDefault { 
  HasBoth() { 
    super(1);
    print("HasBoth()");    
  }
  HasBoth(int i) { 
    super(i);
    print("HasBoth(int i)");    
  }
  public static void main(String[] args) { 
    new HasBoth();
    new HasBoth(1);
  }
}
