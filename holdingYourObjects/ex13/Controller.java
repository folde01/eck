//: innerclasses/controller/Controller.java
// The reusable framework for control systems.
//package innerclasses.controller;
import java.util.*;

public class Controller {
  // A class from java.util to hold Event objects:
  //private List<Event> eventList = new ArrayList<Event>();
  private List<Event> eventList = new LinkedList<Event>();
  public void addEvent(Event c) { eventList.add(c); }
  public void run() {
    /*
    while(eventList.size() > 0)
      // Make a copy so you're not modifying the list
      // while you're selecting the elements in it:
      //for(Event e : new ArrayList<Event>(eventList))
      for(Event e : new LinkedList<Event>(eventList))
        if(e.ready()) {
          System.out.println(e);
          e.action();
          eventList.remove(e);
        }
    */
    while(eventList.size() > 0) {
      Iterator<Event> it = (new ArrayList<Event>(eventList)).iterator();
      while(it.hasNext()) {
        Event e = it.next();
        if(e.ready()) {
          System.out.println(e);
          e.action();
          eventList.remove(e);
        }
      }
    }
  }
} ///:~
