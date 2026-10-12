package week5;

public class ArrayUnboundedQueue<T> implements QueueInterface<T> {
    private int rear,front;
    private T[] array;
    Public ArrayUnboundedQueue(int size){
        this.size=size;
        this.front=0;
        this.rear=0;
        this.array=new T[size];
    }

    @Override
    public void enqueue(T element) {
        if(isFull()){
             T[] copyArray =T[size*2];
             for(int i =0; i<size;i++){
                 copyArray[i]= newArray[i];
             }
        throw new UnsupportedOperationException("Array is full");
        }
        
        if(isEmpty()){
            front++;
            T[rear++]=size;
        }
    }

    @Override
    public T dequeue() {
        if(isEmpty()){
            throw new UnsupportedOperationException("Not implemented");
            // T[] copyArray =T[size*2];
            // for(int i =0; i<size;i++){
            //     copyArray[i]= newArray[i];
            // }
            if(front=rear){
                front=rear-1;

            }
        else{

        }


            // isEmpty(){
            // front=0;
            // rear=0;
            // array[rear]=element; }
        }
        throw new UnsupportedOperationException("Not implemented");
       
        

        
    }

    @Override
    public boolean isFull() {
        if(newArray[size-1]!= null){
            return true;

        }
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public boolean isEmpty() {
        if(count=0){
            return true;
        }
        
        throw new UnsupportedOperationException("Not implemented");
    }
}