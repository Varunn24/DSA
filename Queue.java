import java.util.*;

public class Queue {
    static class QueueImpl {
        static int[] arr;
        static int size;
        static int rear;

        // Constructor
        QueueImpl(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
        }

        // Check if the queue is empty
        public boolean isEmpty() {
            return rear == -1;
        }

        // Add an element to the queue
        public void add(int data) {
            if (rear == size - 1) { // Queue is full
                System.out.println("Queue is full");
                return;
            }
            rear++;
            arr[rear] = data;
        }

        // Remove an element from the front of the queue
        public int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            int front = arr[0];
            // Shift elements to the left
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear--;
            return front;
        }

        // Peek at the front element of the queue
        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[0];
        }
    }

    public static void main(String[] args) {
        QueueImpl q = new QueueImpl(5); // Create a queue of size 5

        q.add(1);
        q.add(2);
        q.add(3);

        System.out.println("Front element: " + q.peek()); // Should print 1
        System.out.println("Removed: " + q.remove());    // Should print 1
        System.out.println("Front element: " + q.peek()); // Should print 2

        q.add(4);
        q.add(5);
        q.add(6); // Should print "Queue is full"

        while (!q.isEmpty()) {
            System.out.println("Removed: " + q.remove());
        }

        System.out.println("Queue empty: " + q.isEmpty()); // Should print true
    }
}

