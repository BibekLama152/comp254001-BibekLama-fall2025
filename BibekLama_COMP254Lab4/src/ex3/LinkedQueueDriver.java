package ex3;

public class LinkedQueueDriver {
    public static void main(String[] args) {
        LinkedQueue<Integer> Q1 = new LinkedQueue<>();
        LinkedQueue<Integer> Q2 = new LinkedQueue<>();

        Q1.enqueue(1);
        Q1.enqueue(2);
        Q2.enqueue(3);
        Q2.enqueue(4);

        Q1.concatenate(Q2);

        System.out.print("Q1 after concatenate: ");
        Q1.display();
        System.out.print("Q2 after concatenate: ");
        Q2.display();
    }
}
