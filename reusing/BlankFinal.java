class HasBlankFinal { 
  //final A a;
  A a;
  HasBlankFinal() { 
    System.out.println("HasBlankFinal()");
    a = new A();
    a = new A();
  }
}

class A { 
  A() { 
    System.out.println("A()");
  }
}

class BlankFinal { 
  public static void main(String[] args) { 
    new HasBlankFinal();
  }
}
