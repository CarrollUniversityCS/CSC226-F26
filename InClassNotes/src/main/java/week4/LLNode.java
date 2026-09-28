package week4;

public class LLNode<T> {
    T info;
    LLNode<T> next;

    public LLNode(T info){
        this.next=null;
        this.info=info;
    }
    public void setNext(LLNode<T> nextNode){
        this.next=nextNode;
    }
    public LLNode<T> getNext(){
       return this.next; 
    }
    public void setInfo(T info){
        this.info=info;
    }
    public T getInfo(){
        return this.info;
    }
}