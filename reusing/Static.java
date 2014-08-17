class HasStaticFinal { 
  static final Foobar fb = new Foobar();
  HasStaticFinal() { 
    System.out.println("HasStaticFinal()");
  }
}

class HasFinal { 
  final Foobar fb = new Foobar();
  HasFinal() { 
    System.out.println("HasFinal()");
  }
}

class Foobar {
  static int i = 0;
  Foobar() { 
    System.out.println("Foobar: " + i++);
  }
}

class StaticFinal { 
  public static void main(String[] args) { 
    new HasFinal(); 
    new HasFinal(); 
    new HasStaticFinal(); 
    new HasStaticFinal(); 
  }
}
