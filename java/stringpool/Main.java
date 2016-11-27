public class Main {
    public static void main(String[] args) {
        String a = "HELLO";
        String b = new String(a);
        String c = "HELL";
        c += "O";
        String d = "HELLO";
        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(a == d);
    }
}
