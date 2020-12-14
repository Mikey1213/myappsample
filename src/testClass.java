import java.util.ArrayList;

public class testClass {
    public static void main(String[] args) {
        System.out.println("Hello world");
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("hello ");
        strings.add("world");
        strings.stream().forEach(System.out::print);
        System.out.println("new line or whatever");

    }
}
