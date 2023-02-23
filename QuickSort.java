import java.util.Scanner;
class QuickSort{
	private static void swap(int[] ar,int index1,int index2){
		int temp = ar[index1];
		ar[index1] = ar[index2];
		ar[index2] = temp;
	}
	static void quickSort(int[] ar,int lowIndex,int highIndex){
		if (lowIndex >= highIndex){
			return;
		}

		int pivot = ar[highIndex];

		int leftPointer = lowIndex;
		int rightPointer = highIndex;

		while(leftPointer < rightPointer){
			while(ar[leftPointer] <= pivot && leftPointer < rightPointer){
				leftPointer++;
			}
			while (ar[rightPointer] >= pivot && leftPointer < rightPointer){
				rightPointer--;
			}
			swap(ar,leftPointer,rightPointer);
		}
		swap(ar,leftPointer,highIndex);

		quickSort(ar,lowIndex,leftPointer - 1);
		quickSort(ar,leftPointer + 1, highIndex);
	}

	static void printList(int[] ar){
		for (int i = 0; i < ar.length;i++){
			System.out.print(ar[i]+"\t");
		}
		System.out.println("\n");
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements ");
		int elementNumber = sc.nextInt();
 		int[] ar = new int[elementNumber];
		System.out.println("Enter array elements");
		for (int i = 0; i < elementNumber; i++){
			ar[i] = sc.nextInt();
		}
		System.out.println("Array before sorting is");
		printList(ar);
		quickSort(ar,0,ar.length - 1);
		System.out.println("Array after sorting is");
		printList(ar);

	}
}