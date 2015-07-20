//What will be printed?
public class Main {
    public static void main(String...args) {
        Integer a = 100;
        Integer b = 100;
        if(a == b) {
            System.out.println("1");
        }
        a = 200;
        b = 200;
        if(a == b) {
            System.out.println("2");
        }
    }
}
