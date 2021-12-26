package file_handling;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Alphabets_BufferStream {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedWriter bw=new BufferedWriter(new FileWriter("D:\\jv prac\\class question\\src\\alphabet.txt"));
		//to write all alphabet
		for(int i=65;i<91;i++) {
			bw.write(i);
		}
		
		//read and write from console
		bw.newLine(); // change line
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter letters");
		String letter=reader.readLine();
		bw.write(letter);
		bw.flush();
		bw.close();
	}

}
