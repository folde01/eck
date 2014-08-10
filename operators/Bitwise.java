import static net.mindview.util.Print.*;

public class Bitwise { 
  public static void main(String[] args) { 
    int i1 = 0xaaaaaaaa; // int: 32 bit, -(2^31) to (2^31 - 1); each hex 0-f can be 1 of 16 values. 16 is 2^4, so a 4-bit number. Hence 8 hex digits in a 32-bit int. A byte should then have two hex digits eg 0xaa 
    int i2 = ~i1;
    print(Integer.toBinaryString(i1));
    print(Integer.toBinaryString(i2));
    print(Integer.toBinaryString(i2 & i1));
    print(Integer.toBinaryString(i2 ^ i1));
    
  }
}
