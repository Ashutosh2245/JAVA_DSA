package Heaps;
public class MaxHeapUsingArray {
    private int[] arr;
    private int size;

    MaxHeapUsingArray(int capacity){
        arr = new int[capacity];
        size = 0;
    }
    public void add(int val) throws Exception{
        if(size == arr.length) throw new Exception("Heap is Full!");
        arr[size] = val;
        upHeapify(size);
        size++;
    }
    public void upHeapify(int idx){
        if(idx == 0) return;
        int parent = (idx - 1)/2;
        if(arr[idx] > arr[parent]){
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
        int left = 2*i + 1, right = 2*i + 2;
        int maxIdx = i;
        if(left < size && arr[left] > arr[maxIdx]){
            maxIdx = left;
        }
        if(right < size && arr[right] > arr[maxIdx]){
            maxIdx = right;
        }
        if(i == maxIdx) return;
        swap(i, maxIdx);
        downHeapify(maxIdx);
    }
    public static void main(String[] args) throws Exception{
        MaxHeapUsingArray mH = new MaxHeapUsingArray(10);
        mH.add(15);
        mH.add(35);
        mH.add(25);
        mH.add(5);
        mH.add(45);
        mH.add(50);
        mH.add(30);
        mH.add(10);
        mH.add(40);
        mH.add(20);

        System.out.println("Size of Heap: " + mH.size());
        System.out.println("Peek: " + mH.peek());
        System.out.println("Remove: " + mH.remove());
        System.out.println("New Peek: " + mH.peek());
        System.out.println("New Size: " + mH.size());
        System.out.print("Max Heap: ");
        while (mH.size() > 0){
            System.out.print(mH.remove() +" ");
        }
        System.out.println();
        System.out.println("New Size: "+mH.size());
    }
}
