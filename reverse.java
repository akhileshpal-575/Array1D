public class reverse {
    public static void reverseArray(int arr[]){
        int s = arr.length;
        for (int i = 0; i < (arr.length)/2; i++) {
            int temp = arr[i];
            arr[i] = arr[s-1-i];
            arr[s-1-i] = temp;
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,4,56,3,5};
        reverseArray(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
