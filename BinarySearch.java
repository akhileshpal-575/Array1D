public class BinarySearch {
    /**
     * @param arr
     * @param key
     * @return
     */
    public static int binarySearch(int arr[],int key) {
        int start = 0 ;
        int end = arr.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(key == arr[mid]){
               return mid;
            }
            else if(key>arr[mid]){
               start = mid+1;
            }
               else{
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int a[] = {2,4,6,8,10,12};
        int key = 10;
       int index =  binarySearch(a,key);
       if(index==-1)
       System.out.println("Not found");
       else
       System.out.println("found at index : "+index);
    }
}
