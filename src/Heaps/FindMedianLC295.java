package Heaps;
import java.util.*;
class MedianFinder {
    PriorityQueue <Integer> minHeap;
    PriorityQueue <Integer> maxHeap;
    public MedianFinder() {
        minHeap = new PriorityQueue<>();
        maxHeap = new PriorityQueue<>(Collections.reverseOrder());
    }
    public void addNum(int num) {
        if(maxHeap.isEmpty()){
            maxHeap.add(num);
        }
        else{
            if(num < maxHeap.peek()) maxHeap.add(num);
            else minHeap.add(num);
        }

        if(maxHeap.size() == minHeap.size()+2){
            int top = maxHeap.remove();
            minHeap.add(top);
        }
        if(minHeap.size() == maxHeap.size()+2){
            int top = minHeap.remove();
            maxHeap.add(top);
        }
    }
    public double findMedian() {
        if (maxHeap.isEmpty() && minHeap.isEmpty()) {
            throw new IllegalStateException("No numbers added yet!");
        }
        if(maxHeap.size() == minHeap.size()){
            return (maxHeap.peek() + minHeap.peek())/2.0;
        }
        else if(maxHeap.size() > minHeap.size()){
            return maxHeap.peek();
        }
        else return minHeap.peek();
    }

    public static void main(String[] args) {
        MedianFinder mf = new MedianFinder();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int num : arr) {
            mf.addNum(num);
            System.out.println("Added: " + num + ", Current Median: " + mf.findMedian());
        }
    }
}

