package Dynamic_Programming;

import java.util.Scanner;

public class BoardPath {
    public static void main(String[] args) {
        int n = 10;
        int[] dp = new int[n];
        System.out.println(BPBU(n));
        System.out.println(BPTD(0,n,dp));
        System.out.println(BPRecursion(0,n));
    }

    //Reccursion
    public static int BPRecursion(int curr,int end){
        if(curr==end){
            return 1;
        }
        if(curr>end){
            return 0;
        }
        int count=0;
        for (int dice = 1; dice <=6 ; dice++) {
            count+=BPRecursion(curr+dice,end);
        }
        return count;
    }

    public static int BPTD(int curr,int end,int[] dp){
        if(curr==end){
            return 1;
        }
        if(curr>end){
            return 0;
        }
        if (dp[curr] !=0){
            return dp[curr];
        }
        int count=0;
        for (int dice = 1; dice <=6 ; dice++) {
            count+=BPTD(curr+dice,end,dp);
        }
        dp[curr] = count;

        return count;
    }

    public static int BPBU(int end){
        int[] dp = new int[end+6];
        dp[end] = 1;
        for(int i=end-1;i>=0;i--){
            int c=0;
            for (int j = 1; j <=6 ; j++) {
                c += dp[i+j];
            }
            dp[i] = c;
        }
        return dp[0];
    }


}
