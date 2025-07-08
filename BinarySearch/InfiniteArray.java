package BinarySearch;

public class InfiniteArray {
    public static int ans(int[] arr, int target) {

        //first find the range
        //first start with a box of size 2
        int start = 0;
        int end = 1;

        //condition for the target to lie in the range
        while(target > arr[end]) {
            int newStart = end + 1; //new start will be the next element
            //double the box size - (end = previousend + sizeofbox*2)
            end = end + (end - start + 1) * 2; //end will be double the size of the box
            start = newStart; //update start to new start
        }
        return binerySearch(arr, target, start, end);
    }

    public static int binerySearch(int[] arr, int target, int start, int end) {

        while (start <= end) {

            int mid = start + (end - start)/2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {//right
                start = mid + 1;
            } else {//left
                end = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        
        int[] arr = {2, 3, 5, 6, 7, 8, 10, 11, 12,15,20, 23, 30};
        int target = 15;
        System.out.println(ans(arr, target));
    }
}
