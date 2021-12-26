package file_handling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.OutputStream;


public class DataReverse_FileinputStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(
				//InputStream fis=new FileInputStream("D:\\jv prac\\class question\\src\\data.txt"); // used in [while 1]
				InputStream fic=new FileInputStream("D:\\jv prac\\class question\\src\\data.txt");
				//OutputStream fos=new FileOutputStream("D:\\jv prac\\class question\\src\\data1.txt"); // used in [while 2]
				FileWriter writer=new FileWriter("D:\\jv prac\\class question\\src\\data1.txt");
			)
		{
			int c,d;
			StringBuilder data=new StringBuilder(); 
			// byte[] buffer=new byte[4096];
			// while((c=fis.read(buffer))!=-1) { //to write in file [while 1]
			//	 fos.write(buffer,0,c);
			// }
			
			while((d=fic.read())!=-1) { //to print on console in reverse [while 2]
				data.append((char)d);
			}
			String e=new String(data.reverse());
			System.out.println(e);
			writer.write(e); // write in reverse in file
		}
		catch(Exception e) 
		{
			System.out.println(e);
		}
	}

}
