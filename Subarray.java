 // printing subarray and maxsum subarray.
public class Subarray {
    public static void subarray(int a[]) {
      int count = 0;
      int maxsum = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
        for (int j = i; j < a.length; j++) {
            int sum = 0;
            for (int k = i; k <= j; k++) {
                System.out.print(a[k]+" "); //........print subarray.
                sum += a[k];
            }       
              maxsum = Math.max(maxsum, sum);//getting maxsum of subarray ;

            // .......counting subarray
            count++; 
            System.out.println();
        }
        System.out.println();
       } 
       System.out.println("total subarray :"+count);
       System.out.println("Maxsum of subarray:"+maxsum);
    }
    public static void main(String[] args) {
        int a[] = {1,-2,6,-1,3};
        subarray(a);
    }
}
