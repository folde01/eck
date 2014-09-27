//: strings/Receipt.java
import java.util.*;

public class Receipt {
  private double total = 0;
  private Formatter f = new Formatter(System.out);
  int cwa = 25;
  int cwb = 20;
  int cwc = 10;
  public void printTitle() {
    f.format("%-" + cwa + "s %" + cwc + "s %" + cwb + "s\n", "Item", "Qty", "Price");
    f.format("%-" + cwa + "s %" + cwc + "s %" + cwb + "s\n", "----", "---", "-----");
  }
  public void print(String name, int qty, double price) {
    f.format("%-" + cwa + "." + cwa + "s %" + cwc + "d %" + cwb + ".2f\n", name, qty, price);
    total += price;
  }
  public void printTotal() {
    f.format("%-" + cwa + "s %" + cwc + "s %" + cwb + ".2f\n", "Tax", "", total*0.06);
    f.format("%-" + cwa + "s %" + cwc + "s %" + cwb + "s\n", "", "", "-----");
    f.format("%-" + cwa + "s %" + cwc + "s %" + cwb + ".2f\n", "Total", "",
      total * 1.06);
  }
  public static void main(String[] args) {
    Receipt receipt = new Receipt();
    receipt.printTitle();
    receipt.print("Jack's Magic Beans", 4, 4.25);
    receipt.print("Princess Peas", 3, 5.1);
    receipt.print("Three Bears Porridge", 1, 14.29);
    receipt.printTotal();
  }
} /* Output:
Item              Qty      Price
----              ---      -----
Jack's Magic Be     4       4.25
Princess Peas       3       5.10
Three Bears Por     1      14.29
Tax                         1.42
                           -----
Total                      25.06
*///:~
