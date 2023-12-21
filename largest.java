public class largest {
    public static int largestElement(int arr[]){
      int large = Integer.MIN_VALUE;
      for (int i = 0; i < arr.length; i++) {
        if(large < arr[i]){
            large = arr[i];
        }
      }
      return large;
    }
    public static void main(String[] args) {
        int arr[] = {3,4,5,3,7,9};
        int max = largestElement(arr);
        System.out.println("largest element is "+ max);
    }
}
