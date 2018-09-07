package vxg180002;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        BoundedQueue<Integer> b1 = new BoundedQueue<>(10);
        for(int i=0;i<12;i++){
            System.out.println(b1.offer(i));
        }

        Scanner in = new Scanner(System.in);
        whileloop:
        while (in.hasNext()){
            int com = in.nextInt();
            switch(com) {
                case 1:  // peek at the first element
                    System.out.println("Peeked at "+b1.peek());
                    break;
                case 2:  // add element at rear
                    System.out.println("Enter the element to be added.");
                    System.out.println("Adding an element was "+b1.offer(in.nextInt()));
                    System.out.println("size of the queue is "+b1.size());
                    break;
                case 3:  // remove element from front
                    System.out.println("Polled element is "+b1.poll());
                    System.out.println("size of the queue is "+b1.size());
                    break;
                case 4:  // check if the queue is empty
                    System.out.println("Queue is empty? "+b1.isEmpty());
                    break;
                case 5:  // clear the queue
                    b1.clear();
                    System.out.println("Queue is empty? "+b1.isEmpty());
                    System.out.println("Queue size is  "+b1.size());
                    break;
                case 6:  // convert queue to array
                    Integer[] to_array = new Integer[b1.size()];
                    b1.toArray(to_array);
                    break;
                default:  // Exit loop
                    break whileloop;
            }
        }
    }
}
