package Queue;
import java.util.*;
public class ArrayImplementation {
    public static class queueA{
        private int r = -1;
        private int f = -1;
        int size = 0;
        private int[] arr;
        queueA(int capacity) {
            arr = new int[capacity];
        }
        public void add(int val){
            if(r== arr.length-1){
                System.out.println("Queue is Full!");
                return;
            }
            if(f==-1){ //Queue is currently empty.
                f=r=0;
                arr[0] = val;
            }
            else{
                arr[++r] = val;
            }
            size++;
        }
        public int remove(){
            if(size==0){
                System.out.println("Queue is Empty!!");
                return -1;
            }
            int x = arr[f];
            f++;
            size--;
            //if (size==0) f = r = -1;
            return x;
        }
        public int peek(){
            if(size==0){
                System.out.println("Queue is Empty!!");
                return -1;
            }
            return arr[f];
        }
        public boolean isEmpty(){
            return size==0;
        }
        public void display(){
            if(size==0){
                System.out.println("Queue is Empty!!");
            }
            else{
                for (int i = f; i <= r; i++) {
                    System.out.print(arr[i]+" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter queue size: ");
        int n = sc.nextInt();
        queueA q = new queueA(n);

        System.out.print("Enter number of elements to add: ");
        int m = sc.nextInt();
        System.out.println("Enter elements:");
        for (int i = 0; i < m; i++) {
            q.add(sc.nextInt());
        }
        System.out.print("Queue: ");
        q.display();
        System.out.println("Removed element: " + q.remove());
        System.out.print("Queue after removal: ");
        q.display();
        System.out.println("Front element: " + q.peek());
        System.out.println("Is queue empty? " + q.isEmpty());
    }

}
