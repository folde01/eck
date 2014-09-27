class A { 
  int i;
  long l;
  float f;
  double d;
  A() { 
    i = 1;
    l = 1000000000;
    f = (float)11.000001;
    d = 33.3333333333333333333333333;
  }
  public String toString() { 
    StringBuilder result = new StringBuilder();
    result.append(String.format("%d ", i));
    result.append(String.format("%d ", l));
    result.append(String.format("%f ", f));
    result.append(String.format("%.200f\n", d));
    return result.toString();
  }
  public static void main(String[] args) { 
    A a = new A();
    System.out.println(a);
  }
}
