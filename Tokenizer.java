import java.util.StringTokenizer;
import java.util.Scanner;
class Tokenizer{
	public static void main(String ar[]){
		Scanner read = new Scanner(System.in);
		System.out.println("Enter a line of integers ");
		String message = read.nextLine();
		StringTokenizer st = new StringTokenizer(message);
		int sum = 0;
		while (st.hasMoreTokens()){
			int num = Integer.parseInt(st.nextToken());
			System.out.println(num);
			sum += num;
		}
		System.out.println("Sum is : "+sum);
	}
}