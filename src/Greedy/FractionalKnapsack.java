package Greedy;
import java.util.*;
class Item {
    int value, weight;
    Item(int v, int w) {
        value = v;
        weight = w;
    }
}
public class FractionalKnapsack {
    public static void main(String[] args) {
        Item[] items = { new Item(60,10), new Item(100,20), new Item(120,30) };
        int W = 50;
        Arrays.sort(items, new Comparator<Item>() {
            public int compare(Item a, Item b) {
                double r1 = (double)a.value / a.weight;
                double r2 = (double)b.value / b.weight;
                return r2 > r1 ? 1 : r2 < r1 ? -1 : 0;
            }
        });
        double totalValue = 0;
        for(Item it : items) {
            if(W >= it.weight) {
                W -= it.weight;
                totalValue += it.value;
            } else {
                totalValue += it.value * ((double)W / it.weight);
                break;
            }
        }
        System.out.printf("Maximum value: %.2f\n", totalValue);
    }
}
