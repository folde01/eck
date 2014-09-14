import static net.mindview.util.Print.*;

interface U { 
  void m1();
  void m2();
  void m3();
}

class A { 
  private static int i = 0;
  U getU() { 
    return new U() { 
      private int id = i++;
      public void m1() { print("A.m1() id: " + id); }
      public void m2() { print("A.m2()"); }
      public void m3() { print("A.m3()"); }
    };
  }
}

class B { 
  private int size = 4;
  private U[] uarray = new U[size];
  private int index = 0;

  void storeU(U u) { 
    if (index < size) uarray[index++] = u;
  }
  void nullU(int i) { 
    if (i < size) { 
      print("i: " + i);
      uarray[i] = null;
    }
  }
  void doU() { 
    for (int j=0; j < index; j++) { 
      doU(j);
    }
  }
  void doU(int j) { 
    if (uarray[j] != null) { 
      uarray[j].m1();
      uarray[j].m2();
      uarray[j].m3();
    } else { 
      print("null");
    }
  }
}

class Foo { 
  public static void main(String[] args) { 
    A a1 = new A();
    A a2 = new A();
    A a3 = new A();
    A a4 = new A();
    B b = new B();
    b.storeU(a1.getU());
    b.storeU(a2.getU());
    b.storeU(a3.getU());
    b.storeU(a4.getU());
    b.doU();
    b.nullU(2);
    b.doU();
  }
}
