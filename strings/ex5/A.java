// %[argument_index$][flags][width][.precision]conversion

import java.util.*;

class A { 
  public static void main(String[] args) { 
    Formatter f = new Formatter(System.out);
    f.format("%2$-20d %1$050d\n", 123, 234); 
    f.format("%2$10c %1$-20c\n", 100, 101);
    boolean b = false;
    f.format("%2$-30b %1$b\n", b, 1); 
    f.format("%2$20.3s %1$20s\n", "abcdefg", "12345678");
    f.format("%2$-10.2f %1$010.3f\n", 1.00234, 5302.57282);
    f.format("%2$-10.2e %1$010.3e\n", .00234, 5302.57282);
    f.format("%2$-20x %1$020x\n", 234, 530257282);
    f.format("%2$-20h %1$20h\n", 234, 530257282);
    f.format("%%\n");

  }
}
