import java.util.*;

class Command {
  String s;
  Command(String s) {
    this.s = s;
  }
  void operation() {
    System.out.println(s);
  }
}

class FillQueue {
  static Queue<Command> fill() {
    Queue<Command> q = new LinkedList<Command>();
    for (int i=0; i<10; ++i)
      q.offer(new Command("Command-" + i));
    return q;
  }
}

class CommandQueue {
  static void consume(Queue<Command> q) {
    while (q.peek() != null) { 
      q.remove().operation();
    }
  }
  public static void main(String[] args) {
    consume(FillQueue.fill());
  }
}
