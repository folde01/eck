package foopkg;
import ex5.A;
import static net.mindview.util.Print.*;

class B implements A { 
  public void method1() { 
    //System.out.println("B.method1()");
    print("B.method1()");
  }
}

class ImplementEx5 { 
  public static void main(String[] args) { 
    B b = new B();
    b.method1();
  }
}
