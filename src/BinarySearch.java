public class BinarySearch {


    int binarySearch(int[] data, int left, int right, int x){

               if(right>=left) {

                   int mid =    left + (right - left) / 2;
                   System.out.println(mid);
                   if (data[mid] == x)
                           return mid;
                   else if (data[mid]>x)
                           return binarySearch(data, left, mid-1, x);

                   return binarySearch(data, mid+1, right,x);

               }
        return -1;
    }

    public static void main(String[] args) {
        BinarySearch ob = new BinarySearch();
        int arr[] = {2,3,4,10,40};
        int n = arr.length;
        int x = 10;
        int result = ob.binarySearch(arr,0,n-1,x);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " +
                    result);
    }
}
