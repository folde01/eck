//: strings/JGrep.java
// A very simple version of the "grep" program.
// {Args: JGrep.java "\\b[Ssct]\\w+"}
import java.util.regex.*;
import java.io.*;
import java.util.*;
import net.mindview.util.*;

public class JGrep {
  public static void main(String[] args) throws Exception {
    File f = new File(args[0]);
    File[] files = null;
    if (f.isDirectory())
      files = new File(args[0]).listFiles();
    else if (f.isFile()) { 
      files = new File[1];
      files[0] = f; 
    }
    //System.out.println("files: " + Arrays.toString(files));
    //files = new File("foo1.txt").listFiles();
    //System.out.println("files: " + Arrays.toString(files));
    if(args.length < 2) {
      System.out.println("Usage: java JGrep file regex");
      System.exit(0);
    }

    for (File file : files) { 
      System.out.println("-------- " + file + " --------");
      Pattern p = Pattern.compile(args[1]);
      // Iterate through the lines of the input file:
      int index = 0;
      Matcher m = p.matcher("");
      for(String line : new TextFile(file.toString())) {
        m.reset(line);
        while(m.find())
          System.out.println(index++ + ": " +
            m.group() + ": " + m.start());
      }
    }
  }
} /* Output: (Sample)
0: strings: 4
1: simple: 10
2: the: 28
3: Ssct: 26
4: class: 7
5: static: 9
6: String: 26
7: throws: 41
8: System: 6
9: System: 6
10: compile: 24
11: through: 15
12: the: 23
13: the: 36
14: String: 8
15: System: 8
16: start: 31
*///:~
