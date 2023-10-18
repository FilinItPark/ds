/**
 * @author 1ommy
 * @version 08.10.2023
 */
public class LinkedList<T> {
    private int size;
    private Node<T> firstNode;
    private Node<T> lastNode;


    public void add(T data) {
        if (firstNode == null) {
            firstNode = new Node<>(data);
            lastNode = firstNode;
            size++;
            return;
        }
        lastNode.next = new Node<>(data);
        lastNode = lastNode.next;
        size++;
    }

    public void add(T data, int index) {
        if (index > size) throw new IndexOutOfBoundsException("Индекс больше размера массива");

        if (index == size) {
            add(data);
            return;
        }

        if (index == 0) {
            var node = new Node<T>(data);
            node.next = firstNode;
            firstNode = node;
            return;
        }

        var currentNode = firstNode;

        int currentIndex = 0;
        while (currentIndex < index - 1) {
            currentNode = currentNode.next;
            currentIndex++;
        }

        var newNode = new Node<>(data);
        newNode.next = currentNode.next;

        currentNode.next = newNode;
    }

    public Node<T> find(T data) {
        var curNode = firstNode;
        while (curNode.next != null) {
            if (curNode.next.data.equals(data)) return curNode.next;
            curNode = curNode.next;
        }
        return null;
    }

    public void remove(T data) {
        if (data.equals(firstNode.data)) {
            firstNode = firstNode.next;
        }

        var curNode = firstNode;
        while (curNode.next != null) {
            if (curNode.next.data.equals(data)) {
                curNode.next = curNode.next.next;
                return;
            }
            curNode = curNode.next;
        }
    }


    public void printList() {
        var curNode = firstNode;
        while (curNode != null) {
            System.out.println(curNode.data);
            curNode = curNode.next;
        }
    }
}
