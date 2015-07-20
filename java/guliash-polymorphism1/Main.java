public class Main {

    public static void main(String[] args) {
      	A a = new B();
        method(a);
    }

    public static void method(A a) {
     System.out.println("A");
    }

    public static void method(B b) {
        System.out.println("B");
    }

    static class A {

    }

    static class B extends A {

    }
}
