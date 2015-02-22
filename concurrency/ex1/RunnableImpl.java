public class RunnableImpl implements Runnable { 
  private final int id;
  private static int count = 0;

  public RunnableImpl() { 
    id = ++count; 
  }

  public static void main(String[] args) { 
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
