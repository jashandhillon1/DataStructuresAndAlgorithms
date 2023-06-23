//Given an array arr[] of length N and an integer X, the task is to find the number of subsets with a sum equal to X.
//
//        Examples:
//
//        Input: arr[] = {1, 2, 3, 3}, X = 6
//        Output: 3
//        All the possible subsets are {1, 2, 3},
//        {1, 2, 3} and {3, 3}
//
//        Input: arr[] = {1, 1, 1, 1}, X = 1
//        Output: 4
//



package Leetcode.dynamicprogramming;

public class CountOfSubsetWithGivenSum {
    public static void main(String[] args){


    }

    public int helper(int[] arr, int sum){
        int[][] dp=new int[arr.length+1][sum+1];
        for(int i=0;i<arr.length+1;i++){
            dp[i][0]=0;
        }
        for(int j=0lj<sum+1;j++){
            dp[0][j]=1;
        }
        for(int i=1;i<arr.length+1;i++){
            for(int j=1;j<sum+1;j++){
                if(j<arr[i-1]){
                    dp[i][j]=dp[i-1][j]+dp[i-1][j-arr[i-1]];
                }
                else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
    }

}
