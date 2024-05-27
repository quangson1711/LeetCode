package easy;

public class ClimbingStairs {

    // Recursion
    public int climbStairsRecursion(int n) {
        if (n <= 1) {
            return n;
        }

        return climbStairsRecursion(n - 1) + climbStairsRecursion(n - 2);
    }

    public int countWayRecursion(int n) {
        return climbStairsRecursion(n + 1);
    }

    ///////////////////////////
    // Dynamic Programer
    public int countWayDP(int n, int[] dp) {
        if (n <= 1) {
            return dp[n] = 1;
        }
        if (dp[n] != -1) {
            return dp[n];
        }
        dp[n] = countWayDP(n - 1, dp) + countWayDP(n - 2, dp);
        return dp[n];
    }

    public int climbStairsDP(int n) {
        int[] dp = new int[n + 1];
        for (int i = 0; i < dp.length; i++) {
            dp[i] = -1;
        }
        return countWayDP(n, dp);
    }

    public static void main(String[] args) {
        // Recursion
        int n = 4;
        ClimbingStairs climbingStairs = new ClimbingStairs();
        System.out.println("Recursion : " + climbingStairs.countWayRecursion(4));

        // Dynamic Programer
        System.out.println("DP : " + climbingStairs.countWayDP(4));
    }
}
