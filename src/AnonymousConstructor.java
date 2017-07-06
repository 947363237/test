//: innerclasses/AnonymousConstructor.java
// Creating a constructor for an anonymous inner class.www

abstract class Base {
  public Base(int i) {
    System.out.println("Base constructor, i = " + i);
  }
  public abstract void f();
}	

public class AnonymousConstructor {
  public static Base getBase(int i) {
    return new Base(i=2) {
      { System.out.println("Inside instance initializer");
      }
      public void f() {
        System.out.println("In anonymous f()");
      }
    };
  }
  public static void main(String[] args) {
    Base base = getBase(47);
    base.f();
  }
} /* Output:
Base constructor, i = 47
Inside instance initializer
In anonymous f()
*///:~
