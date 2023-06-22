//Given a set of non-negative integers and a value sum, the task is to check if there is a subset of the given set whose sum is equal to the given sum.
//
//        Examples:
//
//        Input: set[] = {3, 34, 4, 12, 5, 2}, sum = 9
//        Output: True
//        Explanation: There is a subset (4, 5) with sum 9.
//
//        Input: set[] = {3, 34, 4, 12, 5, 2}, sum = 30
//        Output: False
//        Explanation: There is no subset that add up to 30.


package Leetcode.dynamicprogramming;



public class subsetsum {

    public static boolean solution(int[] array, int cap){
        boolean result[][]=new boolean[array.length+1][cap+1];
        for(int i=0;i<array.length+1;i++){
            result[i][0]=true;
        }
        for(int j=0;j<cap+1;j++){
            result[0][j]=false;
        }
        result[0][0]=true;

        for(int i=1;i<array.length;i++) {
            for (int j = 1; j < cap + 1; j++) {


            if (array[i - 1] < j) {
                result[i][j] = result[i][j - array[i - 1]] || result[i - 1][j];
            } else {
                result[i][j] = result[i - 1][j];
            }
        }
        }


    }
    public static void main(String[] args){
        int set[] = { 3, 34, 4, 12, 5, 2 };
        int sum = 9;
        solution(set,sum);
    }
}
