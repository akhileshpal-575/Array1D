public class MaxSumSubarray {
    public static void maxSum(int a[]){
       int maxsum = Integer.MIN_VALUE;
       int prefix[] = new int [a.length];
       prefix[0] = a[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = a[i]+prefix[i-1]; 
        }
        int sum = 0;
        for (int i = 0; i < prefix.length; i++) {
            int start = i;
            for (int j = i; j < prefix.length; j++) {
                int end = j;
                sum = start==0?prefix[end]:prefix[end]-prefix[start-1];
                if(maxsum<sum){
                    maxsum = sum;
                }
            }
        }
        System.out.println("maxsum : "+maxsum);
    }
    public static void main(String[] args) {
        int a[] = {1,-2,6,-1,3};
        maxSum(a);
    }
}
