//Is the code compilable? Does it throw an exception? What will be printed?
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Set<MyObject> treeSet = new TreeSet<MyObject>();
        Set<MyObject> hashSet = new HashSet<MyObject>();
        add(treeSet, new MyObject());
        add(hashSet, new MyObject());
        System.out.println(treeSet.size());
        System.out.println(hashSet.size());
    }

    public static void add(Set<MyObject> set, MyObject obj) {
        set.add(obj);
    }
}

class MyObject {
}
