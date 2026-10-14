package medical_action_tracking;

public class LinkedQueue<T> {
    private class Node {
        private T data;
        private Node next;

        private Node(T data) {
            this.data = data;
        }
    }

    private Node front;
    private Node rear;
    private int size;

    public LinkedQueue() {
        // TODO: Initialize an empty queue.
        front =null;
        rear=null;
        size=0;
        
    }

    public void enqueue(T item) {
        // TODO: Add a node at the rear. Update both references when the queue is empty.
        if (item == null) {
            throw new IllegalArgumentException("Cannot enqueue null item");
        }
        Node newNode = new Node(item);
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;

    }

    public T dequeue() {
        // TODO: Remove and return the front item, or return null if empty.
        // TODO: When removing the last item, make both front and rear null.
        if (isEmpty()) {
            return null;
        }
        T item = front.data;
        front = front.next;
        size--;
        if (isEmpty()) {
            rear = null;
        }

        return item;
    }

    public T peekFront() {
        // TODO: Return the front item without removing it, or null if empty.
        if (isEmpty()) {
            return null;
        }
        return front.data;
    }

    public boolean isEmpty() {
        // TODO: Determine whether the queue contains any items.
        return front == null;
    }

    public int size() {
        // TODO: Return the number of queued items.
        return size;
    }

    @Override
    public String toString() {
        // TODO: Recursively build a string from front to rear without changing the queue.
        StringBuilder result = new StringBuilder("[");
        appendNodesRecursively(front, result);
        result.append("]");
        return result.toString();
    }

    private void appendNodesRecursively(Node current, StringBuilder result) {
        // TODO: Add the current node's data, then recursively visit current.next.
        // TODO: Stop at the null-node base case.
      // result.append("["); // forgot to add this and my code ended up not working properly for test case never mind i was stupidly wrong 
        if (current == null) {
            // result.append("[");
            // result.append("]");
            return;
        }
        if (result.length() > 1) { // this is what i needed for the coma to be after the first value and not before it or after the last value
            result.append(", ");
        }
        result.append(current.data);
        appendNodesRecursively(current.next, result);
       
    }
}
