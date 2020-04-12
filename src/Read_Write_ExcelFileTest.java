
public class Read_Write_ExcelFileTest {

	public static void main(String[] args) {
		
		 Xls_Reader d=new  Xls_Reader("C:\\testing\\NikulTest.xlsx"); // because there is constructor in that class
		 
		 System.out.println(d.getCellData("Data1", "Name", 3));
		 
		 System.out.println(d.getCellData("Data1", 1, 2));
		 
		 String correctEmail=d.getCellData("Data1", 1, 2);
		 System.out.println(correctEmail);
		 
		 System.out.println(d.getRowCount("Data1")); //row count
		 System.out.println(d.getColumnCount("Data1")); //column count
		 
		 d.setCellData("Data1", "Name", 11, "testing");
		 System.out.println(d.getRowCount("Data1"));
		 
		 d.addColumn("Data1", "Shweta");
		 

	}

}
