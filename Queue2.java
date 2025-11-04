import java.util.Stack;

public class Queue2 {
    static class QueueImpl {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        // Check if the queue is empty
        public boolean isEmpty() {
            return s1.isEmpty() && s2.isEmpty();
        }

        // Enqueue an element into the queue
        public void enqueue(int data) {
            s1.push(data);
        }

        // Dequeue an element from the queue
        public int dequeue() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }

            if (s2.isEmpty()) {
                // Move all elements from s1 to s2
                while (!s1.isEmpty()) {
                    s2.push(s1.pop());
                }
            }

            return s2.pop();
        }

        // Peek at the front element of the queue
        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }

            if (s2.isEmpty()) {
                // Move all elements from s1 to s2
                while (!s1.isEmpty()) {
                    s2.push(s1.pop());
                }
            }

            return s2.peek();
        }
    }

    public static void main(String[] args) {
        QueueImpl q = new QueueImpl();

        q.enqueue(5);
        q.enqueue(6);
        q.enqueue(7);

        System.out.println("Front element: " + q.peek()); // Should print 1
        System.out.println("Removed: " + q.dequeue());    // Should print 1
        System.out.println("Front element: " + q.peek()); // Should print 2

        q.enqueue(4);
        q.enqueue(5);

        while (!q.isEmpty()) {
            System.out.println("Removed: " + q.dequeue());
        }

        System.out.println("Queue empty: " + q.isEmpty()); // Should print true
    }
}
