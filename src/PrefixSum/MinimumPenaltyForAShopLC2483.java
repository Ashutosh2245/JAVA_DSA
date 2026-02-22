package PrefixSum;
public class MinimumPenaltyForAShopLC2483 {
    public static int bestClosingTime(String str) {
        int n = str.length();
        int[] pre = new int [n+1];
        for(int i = 1; i < n+1; i++){
            pre[i] = pre[i-1];
            if(str.charAt(i-1) == 'N'){
                pre[i] += 1;
            }
        }
        int[] suf = new int[n+1];
        for(int i = n-1; i >= 0; i--){
            suf[i] = suf[i+1];
            if(str.charAt(i) == 'Y'){
                suf[i] += 1;
            }
        }
        int min = Integer.MAX_VALUE;
        int ans = 0;
        for(int i = 0; i <= n; i++){
            int penalty = pre[i] + suf[i];
            if(penalty < min){
                min = penalty;
                ans = i;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String s = "YYNNYY";
        int ans = bestClosingTime(s);
        System.out.println("Minimum Penalty hour : "+ans);
    }
}
