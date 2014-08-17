import static net.mindview.util.Print.*;

class A { 
  void meth() {
    print("meth()");
  }
  void meth(int i) {
    print("meth(int i)");
  }
  void meth(float f) {
    print("meth(float f)");
  }
}

class B extends A { 
  void meth(char c) {
    print("meth(char c)");
  }
}

class Ex13 { 
  public static void main(String[] args) { 
    B b = new B();
    b.meth('a');
    b.meth(1.0f);
    b.meth(1);
    b.meth();
  }
}
