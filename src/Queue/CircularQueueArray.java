package Queue;
public class CircularQueueArray {
    public static class cQueueArray{
        int front = -1;
        int rear = -1;
        int size = 0;
        int[] arr = new int[5];

        public void add(int val) throws Exception{
            if(size==arr.length){
              throw new Exception("Queue is Full!");
            }
            else if (size==0) {
                front = rear = 0;
                arr[0] = val;
            }
            else if (rear<arr.length-1){ //normal case
                rear++;
                arr[rear] = val;
            }
            else if(rear==arr.length-1){
                rear = 0;
                arr[0] = val;
            }
            size++;
        }
        public int remove() throws Exception{
            if(size==0){
                throw new Exception("Queue is empty");
            }
            else{
                int val = arr[front];
                if(front==arr.length-1) front = 0;
                else front++;
                size--;
                return val;
            }
        }
        public int peek() throws Exception{
            if(size==0){
                throw new Exception("Queue is Empty!");
            }
            else return arr[front];
        }
        public boolean isEmpty(){
            return size==0;
        }
        public void display() {
            if(size==0){
                System.out.println("Queue is empty!");
            }
            else if(front<=rear){
                for (int i = front; i <=rear ; i++) {
                    System.out.print(arr[i]+" ");
                }
            }
            else{//rear < front
                for (int i = front; i <arr.length ; i++){
                    System.out.print(arr[i]+" ");
                }
                for (int i = 0; i <= rear ; i++) {
                    System.out.print(arr[i]+" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) throws Exception{
        cQueueArray q = new cQueueArray();
        q.display();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.display(); // 1 2 3 4
        System.out.println("Peek Element: "+q.peek());
        q.remove();
        q.display(); // 2 3 4
        System.out.println(q.isEmpty());
        System.out.println("Size: "+q.size);
        q.add(5);
        q.display(); // 2 3 4 5
        q.add(6);
        q.display(); // 6 2 3 4 5(Array) ->> 2 3 4 5 6(Queue)
        //q.add(7); // Exception
        System.out.println("Size: "+q.size);
        System.out.print("Array: ");
        for (int i = 0; i < q.arr.length; i++) {
            System.out.print(q.arr[i]+" ");
        }
    }
}
