import static net.mindview.util.Print.*;

class A { 
  void a() { 
    print("A.a()");
    b();
  }
  void b() { 
    print("A.b()");
  }
}

class B extends A { 
  void b() { 
    print("B.b()");
  }
}

class Ex10 { 
  static void upcast(A aa) { 
    aa.a(); 
  }
  public static void main(String[] args) { 
    B bb = new B();  
    Ex10.upcast(bb); 
  }
}
