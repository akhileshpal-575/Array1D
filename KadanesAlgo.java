public class KadanesAlgo {
    public static void kadanes(int a[]){
        int maxsum = Integer.MIN_VALUE;
        int checkMax = Integer.MIN_VALUE;
        // finding max element to check whether all elements negative or not.
        for (int i = 0; i < a.length; i++) {
            checkMax = Math.max(checkMax, a[i]);
        }
        // if all elements are negative then it will work.
        if(checkMax<0){
            //greatest negative number become maxsubarray sum.
            maxsum = checkMax;
            System.out.println("maxsum is:"+maxsum);
        }
        // work when all elements not negative.
        else{
        int cs = 0;
        for (int i = 0; i < a.length; i++) {
            cs += a[i];
            if(cs<0){
                cs = 0;
            }
           maxsum = Math.max(maxsum, cs); 
        }
        System.out.println("maxsum : "+maxsum);
    }
}
public static void main(String[] args) {
 int a[] = {-2,-3,4,-1,-2,1,5,-3};
// int a[] = {-1,-3,-5,-6,-2}; 
 kadanes(a);   
 }    
}
