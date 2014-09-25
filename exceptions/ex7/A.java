import java.util.logging.*;
import java.io.*;

class A { 
  public static void main(String[] args) { 
    Integer[] ia = new Integer[10];
    try { 
      ia[20] = 1;
    } catch(ArrayIndexOutOfBoundsException e) { 
      StringWriter trace = new StringWriter();
      e.printStackTrace(new PrintWriter(trace));
      Logger logger = Logger.getLogger("ArrayIndexOutOfBoundsException");
      logger.severe(trace.toString());
      
    } finally { 
      System.out.println("finally");
    }
  }
}
