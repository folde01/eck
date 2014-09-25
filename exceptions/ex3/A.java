class A { 
  public static void main(String[] args) { 
    Integer[] ia = new Integer[10];
    try { 
      ia[20] = 1;
    } catch(ArrayIndexOutOfBoundsException e) { 
      e.printStackTrace();
    } finally { 
      System.out.println("finally");
    }
  }
}
