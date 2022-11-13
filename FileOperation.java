import java.io.*;
import java.util.Scanner;
class FileOperation{
	public static void main(String ar[]){
		Scanner read = new Scanner(System.in);
		File file = new File("sampleFile.txt");
		try{
			file.createNewFile();
			
		}catch(IOException e){
			System.out.println("Error occured");
		}
		System.out.println("Enter text to file ");
		String message = read.nextLine();
		try{
			FileWriter myWriter = new FileWriter("sampleFile.txt");
			myWriter.write(message);
			myWriter.close();
		}catch(Exception e){
			System.out.println("Error occured");
		}

		try{
			Reader fileRead = new FileReader("sampleFile.txt");
			int data = fileRead.read();
			while(data != -1){
				System.out.print((char)data);
				data = fileRead.read();
			}
			fileRead.close();
		}catch(Exception b){
			System.out.println("Error occured");
		}
		



	}
}