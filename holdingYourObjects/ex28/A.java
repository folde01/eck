import java.util.*;

class A {
  public static void main(String[] args) {
    PriorityQueue<Double> pqd = new PriorityQueue<Double>();
    Random rand = new Random();
    for (int i=0; i<10; ++i) {
      pqd.offer(rand.nextDouble());
    }
    Double d;
    while((d = pqd.poll()) != null) {
      System.out.println(d);
      System.out.println(pqd);
    }
  }
}
