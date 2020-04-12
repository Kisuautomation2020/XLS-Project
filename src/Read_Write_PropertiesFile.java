import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Read_Write_PropertiesFile {

	public static void main(String[] args) throws IOException {
		
		//Read Properties file
		FileInputStream fs=new FileInputStream("C:\\testing\\prop.properties"); // you have to import java.io.Inputstream package and add throw IOException 
		Properties prop=new Properties(); //import java.util.properties
		prop.load(fs);
		
		String s=prop.getProperty("browser");
		System.out.println(s);
		
		System.out.println(prop.getProperty("url"));
		System.out.println(prop.getProperty("environment"));
		
		//to write data in prop file
		prop.setProperty("name", "shweta");
		System.out.println(prop.getProperty("name"));
		
		prop.setProperty("tool", "selenium");
		System.out.println(prop.getProperty("tool"));
		
		// all above data will store in temp file..it will not write in file
		// so use following class for store data in file
		
		FileOutputStream fo=new FileOutputStream("C:\\testing\\prop.properties"); // this is to write data permanently // import package java.io.OutputStream
		prop.store(fo, "Adding to File");
		
		
		
	}

}
