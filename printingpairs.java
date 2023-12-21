public class printingpairs {
    public static void printPairs(int a[]){
     for (int i = 0; i < a.length-1; i++) {
        System.out.println("all possible pairs of "+a[i]+" are :");
        for (int j = i+1; j < a.length; j++) {
        System.out.print("("+a[i]+","+a[j]+")"+" ");
        }
        System.out.println();
     }
    }
    public static void main(String[] args) {
        int a[] = {2,4,6,8,10};
        printPairs(a);
    }
}
