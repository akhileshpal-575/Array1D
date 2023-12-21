public class smallest {
    public static int smallestElement(int arr[]){
        int small = Integer.MAX_VALUE;
        for (int j = 0; j < arr.length; j++) {
            if(small>arr[j]){
                small = arr[j];
            }
        }
        return small;
    }
    public static void main(String[] args) {
        int arr[] = {3,5,64,2,7};
        int small = smallestElement(arr);
        System.out.println("smallest element is "+ small);
    }
}
