package String;
public class MaxValueInStringArray {
    public static void main(String[] args) {
        String [] arr = {"45555","543333","99993","99","000000000999"};
        String maxS = arr[0];
        for (int i = 0; i < arr.length; i++) {
            maxS = max(maxS,arr[i]);
        }
        System.out.println(maxS);
    }
    public static String max(String a, String b){
        String s = purify(a), t = purify(b);
        if(s.length()>t.length()) return a;
        if(s.length()<t.length()) return b;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)!=t.charAt(i)){
                if(s.charAt(i)>t.charAt(i)) return a;
                else return b;
            }

        }
        if(a.length()>=b.length()) return a;
        else return b;
    }
    public static  String purify(String s){// Remove leading zeroes
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)!='0') return s.substring(i);
        }
        return s;
    }
}
