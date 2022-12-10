import java.util.Scanner;
class BinarySearch{
    static int[] BinarySearch(int[] arr,int element){
        int low = 0,high = arr.length - 1;
        int[] res = new int[2];
        while (low <= high){
            int mid = (low + high) / 2;
            if (arr[mid] == element){
                System.out.println("Inside");
                res[0] = 1;
                res[1] = mid + 1;
                return res;
            }else if (element < arr[mid]){
                high = mid - 1;
            }else if (element > arr[mid]){
                low = mid + 1;
            }
        }
        res[0] = 0;
        return res;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[] array = new int[5];
        System.out.println("Enter array elements : ");
        for (int i = 0; i < array.length; i++){
            array[i] = sc.nextInt();
        }
        System.out.print("Enter element to Search : ");
        int element = sc.nextInt();
        int[] result = BinarySearch(array,element);
        if (result[0] == 1){
            System.out.println(String.format("Found at possition %d",result[1]));
        }else{
            System.out.println("Not found");
        }
    }
}