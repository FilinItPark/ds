/**
 * @author 1ommy
 * @version 15.10.2023
 */
public class Queue {
    private int capacity;
    private int[] array;
    private int front;
    private int rear;
    private int size;

    public Queue(int capacity) {
        this.capacity = capacity;
        array = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void insert(int value) {
        array[(front + size++) % capacity] = value;
        rear = (front + size) % capacity;
    }

    public int getFront() {return array[front];}
    public int getRear() {return array[front];}

}
