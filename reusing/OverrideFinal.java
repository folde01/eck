class A { 
  //final void m() { 
  void m() { 
    System.out.println("m()");
  }
}

class OverrideFinal extends A { 
  @Override void m() { 
    System.out.println("m() overrrrridden");
  }
  public static void main(String[] args) { 
    OverrideFinal o = new OverrideFinal();
    o.m();
  }
}
