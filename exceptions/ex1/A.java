// Exercise 1: (2) Create a class with a main( ) that throws an object of class Exception
// inside a try block. Give the constructor for Exception a String argument. Catch the
// exception inside a catch clause and print the String argument. Add a finally clause and
// print a message to prove you were there.

class A {
  public static void main(String[] args) {
    try {
      throw new Exception("blah");
    } catch(Exception e) {
      System.out.println(e);
    } finally {
      System.out.println("finally");
    }
  }
}
