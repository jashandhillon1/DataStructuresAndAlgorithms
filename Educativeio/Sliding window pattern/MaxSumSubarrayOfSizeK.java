class MaxSumSubarrayOfSizeK{
    public static int solution(int k ,int[] arr){
        int result=0;
        int max=0;
        int WindowSize=k;
        int WindowStart=0;
        for(int WindowEnd=0;WindowEnd<arr.length;WindowEnd++) {
            result += arr[WindowEnd];
            if (WindowEnd >= k - 1) {
                max = Math.max(max, result);
                result -= arr[WindowStart];
                WindowStart++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        system.out.println(MaxSumSubarrayOfSizeK.solution(3,new int[] {1,2,3,4,5}));
    }
}
