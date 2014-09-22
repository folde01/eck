import java.util.*;
import net.mindview.util.Stack;

class Evaluate {
  public static void main(String[] args) {
    String s = "+U+n+c---+e+r+t---+a-+i-+n+t+y---+ -+r+u--+l+e+s---";
    Stack<Character> lc = new Stack<Character>();
    for (int i=0; i<s.length(); i++) {
      char c = s.charAt(i);
      if (c == '+')
        lc.push(new Character(s.charAt(++i)));
      else if (c == '-') 
        System.out.print(lc.pop());
    }
    //System.out.println(lc);
  }
}
