import java.util.concurrent.ExecutorService;
import java.util.concurrent.*;
//import static java.util.concurrent.Executors;

public class RunnableImpl implements Runnable { 
  private final int id;
  private static int count = 0;

  public RunnableImpl() { 
    id = ++count; 
  }

  public static void main(String[] args) { 
    ExecutorService exec = Executors.newThreadCachePool();
    for (int i=0; i<5; ++i) { 
      new Thread(new RunnableImpl()).start();
    }
  }

  @Override
  public void run() { 
    System.out.println(id);
    Thread.yield();
    System.out.println(id);
    Thread.yield();
    System.out.println(id);
    Thread.yield();
    return;
  }
}
