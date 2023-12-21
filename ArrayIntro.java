/**
 * ArrayIntro
 */
public class ArrayIntro {

    public static void main(String[] args) {
        // array declation.
       // int arr[] = new int [3]; 
       //array declaration with initialization.
        int a[] = {2,4,3,5}; 
        
        //printing array length.
        System.out.println("array size:"+a.length);
        
        //printing value of array.
       for (int i = 0; i < a.length; i++) {
        System.out.print(a[i]+" ");        
       } 
    }
}