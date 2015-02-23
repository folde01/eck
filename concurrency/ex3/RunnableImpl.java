import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunnableImpl implements Runnable { 
  private final int id;
  private static int count = 0;

  public RunnableImpl() { 
    id = ++count; 
  }

  public static void main(String[] args) { 
    ExecutorService exec = Executors.newCachedThreadPool();
    //ExecutorService exec = Executors.newFixedThreadPool(1);
    //ExecutorService exec = Executors.newFixedThreadPool(1000);
    //ExecutorService exec = Executors.newSingleThreadExecutor();
    for (int i=0; i<5000; ++i) { 
      //new Thread(new RunnableImpl()).start();
      exec.execute(new RunnableImpl());
    }
    exec.shutdown();
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
