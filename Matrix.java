import java.io.*;
import java.util.Scanner;
class Matrix{
	public static void main(String ar[]){
		Scanner read = new Scanner(System.in);
		int r1,r2,c1,c2;
		System.out.println("Enter row of matrix 1 ");
		r1 = read.nextInt();
		System.out.println("Enter column of matrix 1");
		c1 = read.nextInt();

		System.out.println("Enter row of matrix 2 ");
		r2 = read.nextInt();
		System.out.println("Enter column of matrix 2 ");
		c2 = read.nextInt();

		if (c1 != r2){
			System.out.println("Cannot perform multiplication ");
		}else{
			int m1[][] = new int[r1][c1];
			int m2[][] = new int[r2][c2];
			int res[][] = new int[r1][c2];
			
			System.out.println("Enter Matrix 1 elements ");
			for (int i = 0; i < r1; i++){
				for (int j = 0; j < c1; j++){
					System.out.print("("+i+","+j+")  ");
					m1[i][j] = read.nextInt();
				}
			}

			System.out.println("Enter matrix 2 elements ");
			for (int i = 0; i < r2; i++){
				for (int j = 0; j < c2; j++){
					System.out.print("("+i+","+j+")  ");
					m2[i][j] = read.nextInt();
				}
			}


			for(int i = 0; i < r1; i++){
				for (int j = 0; j < c2; j++){
					for (int k = 0; k < c2; k++){
						res[i][j] += m1[i][k] * m2[k][j];
					}
				}
			}


			for (int i = 0; i < r1; i++){
				for (int j = 0; j < c2; j++){
					System.out.print(res[i][j]+"\t");
				}
				System.out.println("\n");
			}

		}
	}
}