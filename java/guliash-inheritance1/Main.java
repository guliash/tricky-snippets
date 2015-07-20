public class Main {

    public static void main(String[] args) {
      	A a = new B();
        a.method();
    }

    static class A {
        public void method() {
            System.out.println("A");
        }
    }

    static class B extends A {
        public void method() {
            System.out.println("B");
        }
    }
}
