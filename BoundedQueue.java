package vxg180002;

public class BoundedQueue<T>{

    private Object[] queue;
    private int front;
    private int rear;
    private int size = 0;

    private void incFront(){
        front = (front +1)%queue.length;
    }

    private void incRear(){
        rear = (rear +1)%queue.length;
    }

    public BoundedQueue(int size){
        queue = new Object[size];
        front = size = 0;
        rear = -1;
    }

    public boolean offer(T ele){
        if(this.size() < queue.length){
            this.incRear();
            queue[rear] = ele;
            size++;
            return true;
        }else{
            return false;
        }
    }

    public T peek(){
        return (this.isEmpty())?null:(T) queue[front];
    }

    public T poll(){
        if(this.isEmpty()){
            return null;
        }else{
            T pollEle = (T) queue[front];
            this.incFront();
            size--;
            return pollEle;
        }
    }
    
    public int size(){
        return size;
    }

    public void clear(){
        front = size = 0;
        rear = -1;
    }

    public boolean isEmpty(){
        return (size == 0);
    }

    public void toArray(T[] arr){
        int cur = front;
        for (int i=0;i<this.size();i++){
            arr[i] = (T) queue[cur];
            cur++;
        }
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }
}
