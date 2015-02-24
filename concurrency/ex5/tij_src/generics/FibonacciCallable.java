//: generics/Fibonacci.java
// Generate a Fibonacci sequence.
import net.mindview.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//public class FibonacciRunnable implements Generator<Integer>, Runnable {
public class FibonacciCallable implements Generator<Integer>, Callable {
  private int n = 0;
  private int count = 0;

  public FibonacciCallable(int n) { 
    this.n = n;
  }

  public Integer next() { return fib(count++); }
  private int fib(int n) {
    if(n < 2) return 1;
    return fib(n-2) + fib(n-1);
  }
  //public void run() { 
  public int run() { 
    private int result;
    System.out.println("STARTING fib(" + n + ")");
    FibonacciRunnable gen = new FibonacciRunnable(n);
    for(int i = 0; i < n; i++)
      result += gen.next(); 
    System.out.println("\nRESULT fib(" + n + ") = " + result);
    return result;
  }
  public static void main(String[] args) { 
    ExecutorService exec = Executors.newCachedThreadPool();
    exec.execute(new FibonacciRunnable(3));
    exec.execute(new FibonacciRunnable(6));
    exec.execute(new FibonacciRunnable(9));
    exec.shutdown();
  }

} /* Output:
1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584
*///:~
