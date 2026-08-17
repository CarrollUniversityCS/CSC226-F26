package medical_action_tracking;

public class LinkedStack<T> {
    private class Node {
        private T data;
        private Node next;
        
        Node(T data) {
            this.data = data;
        }
    }
    
    private Node top;
    private int size;
    
    public void push(T item) {
        // Student implements
    }
    
    public T pop() {
        return null;
        
    }
    
    public T peek() {
        return null;
    }
    
    public boolean isEmpty() {
        return false;
    }
    
    public int size() {
        return -1;
    }
}