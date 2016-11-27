//Is the code compilable? Does it throw an exception? What will be printed?
import java.util.*;
public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3);
        list.add(4);
        System.out.println(list.size());
    }
}
