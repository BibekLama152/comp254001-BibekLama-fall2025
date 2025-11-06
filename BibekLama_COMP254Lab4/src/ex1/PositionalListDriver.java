package ex1;

public class PositionalListDriver {
    public static void main(String[] args) {
        PositionalListMethod<String> list = new PositionalListMethod<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        System.out.println("Index of C: " + list.indexOf("C"));
        System.out.println("Index of A: " + list.indexOf("A"));
    }
}
