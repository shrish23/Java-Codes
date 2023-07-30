package Dynamic_Programming;

public class LCS {
    public static void main(String[] args) {

    }

    public static int LCSRecursion(String s1,String s2){
        char ch1 = s1.charAt(0);
        char ch2 = s2.charAt(0);

        String ros1 = s1.substring(1);
        String ros2 = s2.substring(1);
        int ans=0;
        if(ch1==ch2){
            ans = LCSRecursion(ros1,ros2)+1;
        }else{
            int o1 = LCSRecursion(s1,ros2);
            int o2 = LCSRecursion(ros1,s2);

            ans = Math.max(o1,o2);
        }
        return ans;
    }

    public static int LCSRecursionVIdx(String s1,String s2){
        char ch1 = s1.charAt(0);
        char ch2 = s2.charAt(0);

        String ros1 = s1.substring(1);
        String ros2 = s2.substring(1);
        int ans=0;
        if(ch1==ch2){
            ans = LCSRecursionVIdx(ros1,ros2)+1;
        }else{
            int o1 = LCSRecursionVIdx(s1,ros2);
            int o2 = LCSRecursionVIdx(ros1,s2);

            ans = Math.max(o1,o2);
        }
        return ans;
    }
}
