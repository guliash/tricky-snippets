//is the code compilable? If it is what will be printed?
public class Main {
  public static void main(String[] args) {
    A<?> a = new A<String>();
    a.add(null);
  }
  
  static class A <T> {
    void add(T t) {
      System.out.println("WOW");
    }
    
    void add(String string) {
      System.out.println("WOW1");
    }
  }
}
