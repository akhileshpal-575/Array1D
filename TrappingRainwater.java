/**
 * TrappingRainwater
 */
public class TrappingRainwater {
     public static int traphRainwater(int a[]){
       //calculate left max boundary array.
       int leftMax[] = new int [a.length];
       leftMax[0] = a[0];
         for (int i = 1; i < leftMax.length; i++) {
            leftMax[i] = Math.max(leftMax[i-1],a[i]);
         }
        //calculate right max boundary array.
        int rightMax[] = new int [a.length];
        rightMax[a.length-1] = a[a.length-1];
        
        for (int i = a.length-2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i+1],a[i]);
        }
        int trapWater = 0;
        for (int i = 0; i < rightMax.length; i++) {
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
               trapWater += waterLevel - a[i];
        }
        return trapWater;
     }
    public static void main(String[] args) {
        int a[] = {4,2,0,6,3,2,5};
       System.out.println(traphRainwater(a)); 
    }
}