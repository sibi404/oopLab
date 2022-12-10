import java.io.Writer;
import java.io.FileWriter;
import java.io.IOException;
class WriterClass{
	public static void main(String ar[]) throws IOException{
		String message = "All good!!";
		Writer output = new FileWriter("output.txt");
		output.write(message);
		output.close();
	}
}