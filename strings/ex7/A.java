class A { 
  static boolean check(String s) { 
    return s.matches("[A-Z].*\\.");
  }
  public static void main(String[] args) { 
    String s = "Fjflk j lsdfklds .";
    System.out.println(check(s));
    String t = "jflk j lsdfklds .";
    System.out.println(check(t));
    String u = "Jflk j lsdfklds ";
    System.out.println(check(u));
  }
}
