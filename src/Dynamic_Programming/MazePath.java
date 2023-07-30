package Dynamic_Programming;

public class MazePath {
    public static void main(String[] args) {
        int n = 4;
        int[][] dp = new int[n+1][n+1];
        System.out.println(MPBU(n,n));
        System.out.println(MPTD(0,0,n,n,dp));
        System.out.println(MPRecursion(0,0,n,n));
    }

    public static int MPRecursion(int cr,int cc,int er,int ec){
        if(cr==er && cc==ec){
            return 1;
        }

        if(cr>er || cc>ec){
            return 0;
        }

        int ch=MPRecursion(cr,cc+1,er,ec);
        int cv = MPRecursion(cr+1,cc,er,ec);

        return ch+cv;
    }

    public static int MPTD(int cr,int cc,int er,int ec,int[][] dp){
        if(cr==er && cc==ec){
            return 1;
        }

        if(cr>er || cc>ec){
            return 0;
        }

        if(dp[cr][cc] !=0){
            return dp[cr][cc];
        }

        int ch=MPTD(cr,cc+1,er,ec,dp);
        int cv = MPTD(cr+1,cc,er,ec,dp);

        dp[cr][cc] = ch+cv;

        return ch+cv;
    }

    public static int MPBU(int er,int ec){
        int[][] dp = new int[er+2][ec+2];
        for (int row = er; row >=0 ; row--) {
            for (int col = ec; col >=0 ; col--) {
                if(row==er && col==ec){
                    dp[row][col]=1;
                }else{
                    dp[row][col] = dp[row][col+1] + dp[row+1][col];
                }
            }
        }
        return dp[0][0];
    }
}
