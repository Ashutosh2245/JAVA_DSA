package HashSets_HashMaps;
import java.util.*;
public class Finding3DigitEvenNoLC2094 {
    public static int[] findEvenNumbers(int[] arr) {
        HashMap <Integer, Integer> map = new HashMap<>();
        for(int ele : arr){
            if(map.containsKey(ele)){
                int freq = map.get(ele);
                map.put(ele, freq+1);
            }
            else map.put(ele, 1);
        }
        ArrayList <Integer> ans = new ArrayList <>();
        for(int i = 100; i <= 998; i+=2){
            int x = i;
            int c = x%10;
            int b = (x / 10) % 10;
            int a = (x / 100) % 10;

            if(map.containsKey(a)){
                int aFreq = map.get(a);
                map.put(a, aFreq-1);
                if(aFreq == 1) map.remove(a);

                if(map.containsKey(b)){
                    int bFreq = map.get(b);
                    map.put(b,bFreq-1);
                    if(bFreq == 1) map.remove(b);

                    if(map.containsKey(c)){
                        int cFreq = map.get(c);
                        map.put(c,cFreq-1);
                        if(cFreq == 1) map.remove(c);

                        ans.add(i);

                        map.put(c, cFreq);
                    }
                    map.put(b, bFreq);
                }
                map.put(a, aFreq);
            }
        }
        int[] answer = new int[ans.size()];
        for(int i = 0; i < answer.length; i++){
            answer[i] = ans.get(i);
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of elements in array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] ans = findEvenNumbers(arr);
        System.out.print("All Possible 3 digit even no's are: ");
        for (int ele : ans){
            System.out.print(ele + " ");
        }
    }
}