public class Q26 {
    private int[] queue;
    private int front, rear, size, capacity;

    public Queue(int size) {
        capacity = size;
        queue = new int[capacity];
        front = rear = 0;
        this.size = 0;
    }

    public void enqueue(int value) {
        if (size == capacity) {
            System.out.println("Queue is full");
        } else {
            queue[rear] = value;
            rear = (rear + 1) % capacity;
            size++;
            System.out.println(value + " enqueued to queue");
        }
    }

    public int dequeue() {
        if (size == 0) {
            System.out.println("Queue is empty");
            return -1;
        } else {
            int value = queue[front];
            front = (front + 1) % capacity;
            size--;
            return value;
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public static void main(String[] args) {
        Queue queue = new Queue(5);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println(queue.dequeue() + " dequeued from queue");
    }
}

