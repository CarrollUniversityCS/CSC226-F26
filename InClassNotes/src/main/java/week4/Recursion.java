package week4;


public class Recursion {
    public int fib(int n){
    
        if(n<= 1){
            return n;

        }
        return n*fib(n-1);
        

        
    }
    public static Integer countHi(String value){
        return 0;
    }
    public static <T> void iterativePrinter(LLNode<T> node){
        while(node !=null){
            if(node.getInfo()!=null){
                System.out.println(node.getInfo());
            }
            node=node.getNext();
        }
    }
    public static <T> void recursivePrinter(LLNode<T> node){
        if(node==null){
            return;
        }
        if(node.getInfo()!=null){
            System.out.println(node.getInfo());
        }
        recursivePrinter(node.getNext());
       
    }

    public static <T> int recursiveCounter(LLNode<T> node, int counter){
        for(int i=0; i<counter; i++){
            if(node.getInfo()!=null){
                counter++;
            }
            node=node.getNext();
        }
        return counter;
    }

}
