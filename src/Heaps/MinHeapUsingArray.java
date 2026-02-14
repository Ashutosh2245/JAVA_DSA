package Heaps;
public class MinHeapUsingArray {
    private int[] arr;
    private int size;
    MinHeapUsingArray(int capacity){
        arr = new int[capacity];
        size = 0;
    }
    public void add(int num) throws Exception{
        if(size == arr.length) throw new Exception("Heap is full");
        arr[size] = num;
        upHeapify(size);
        size++;
    }
    public void upHeapify(int idx){
        if(idx == 0) return;
        int parent = (idx - 1) / 2;
        if(arr[idx] < arr[parent]){
            swap(idx, parent);
            upHeapify(parent);
        }
    }
    public void swap(int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public int peek() throws Exception{
        if(size == 0) throw new Exception("Heap is Empty!");
        return arr[0];
    }
    public int size(){
        return size;
    }
    public int remove() throws Exception{
        if(size == 0) throw new Exception("Heap is Empty!");
        int peek = arr[0];
        swap(0, size-1);
        size--;
        downHeapify(0);
        return peek;
    }
    public void downHeapify(int i){
        if(i >= size-1) return;
        int leftChild = 2*i + 1, rightChild = 2*i+2;
        int minIdx = i;
        if(leftChild < size && arr[leftChild] < arr[minIdx]){
            minIdx = leftChild;
        }
        if(rightChild < size && arr[rightChild] < arr[minIdx]){
            minIdx = rightChild;
        }
        if(i == minIdx) return;
        swap(i, minIdx);
        downHeapify(minIdx);

    }
    public static void main(String[] args) throws Exception{
        MinHeapUsingArray mp = new MinHeapUsingArray(10);
        mp.add(20);
        mp.add(30);
        mp.add(50);
        mp.add(40);
        mp.add(25);
        mp.add(35);
        mp.add(15);
        mp.add(10);
        mp.add(45);
        mp.add(5);

        System.out.println("Size of Heap: " + mp.size());
        System.out.println("Peek: " + mp.peek());
        System.out.println("Remove: " + mp.remove());
        System.out.println("New Peek: " + mp.peek());
        System.out.println("New Size: " + mp.size());
        System.out.print("Min Heap: ");
        while (mp.size() > 0){
            System.out.print(mp.remove() + " ");
        }
        System.out.println();
        System.out.print("Size: "+mp.size());

    }
}
