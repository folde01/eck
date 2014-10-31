class A<T> { 
  A<T> a1;
  A<T> a2;
  A<T> a3;
  A() { 
    a1 = new A<T>();
    a2 = new A<T>();
    a3 = new A<T>();
  }
  A<T> get1() { return a1; }
  A<T> get2() { return a2; }
  A<T> get3() { return a3; }
  void set1(A<T> a1) { this.a1 = a1; }
  void set2(A<T> a2) { this.a2 = a2; }
  void set3(A<T> a3) { this.a3 = a3; }
}
