import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Read_Write_TextFileTest {

	public static void main(String[] args) throws IOException {

		//creating file 
		File f=new File("C:\\testing\\temp.txt");
		f.createNewFile();

		// Writing into text file
		FileWriter w= new FileWriter("C:\\testing\\temp.txt");
		BufferedWriter out =new BufferedWriter(w);
		out.write("hello we are  writing in a file");
		out.newLine();
		out.write("This is new line 1");
		out.newLine();

		out.write("This is new line 2 ");
		out.newLine();
 
		out.write("This is new line 3");
		out.newLine();

		out.write("This is new line 4");
		out.newLine();

		out.flush();
		//out.close();

	
			FileReader r=new FileReader("C:\\testing\\temp.txt");
			BufferedReader rd=new BufferedReader(r);
			
		// for reading all lines and print it:
			
		/*System.out.println(rd.readLine());
		System.out.println(rd.readLine());
		System.out.println(rd.readLine());
		System.out.println(rd.readLine());
		System.out.println(rd.readLine());
		System.out.println(rd.readLine());
		System.out.println(rd.readLine());*/
			
	// for check : using while loop count how many lines we read and then print it		
			String x;
			int count=0;
			while((x=rd.readLine())!=null)
			{
			
				count++;
				System.out.println(x);
				
			}
				System.out.println(count);
		
			//System.out.println(String.format("There are %s lines in the document", count));
			
			
		}
		



}


