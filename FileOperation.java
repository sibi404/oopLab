import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
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



	}
}