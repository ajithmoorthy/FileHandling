package Employee;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DeleteEmployee 
{
	 String path="C:\\Users\\ajith.periyasamy\\Desktop\\Ajith\\Database.txt";
	 File file=new File(path); 
	 File file1=new File("C:\\Users\\ajith.periyasamy\\Desktop\\Ajith\\Temp.txt"); 
	 Scanner scan=new Scanner(System.in);
	public void Deleteemployee() throws IOException,ArrayIndexOutOfBoundsException {
		// TODO Auto-generated method stub
		FileReader filereader=new FileReader(file);
		FileWriter filewriter=new FileWriter(file1);
		Scanner sc = new Scanner(filereader);
		System.out.println("Enter the Employee Id");
		int Empid=scan.nextInt();
        while(sc.hasNextLine()){
        	 String[] str=sc.nextLine().split(",");
        	if(!str[0].equals(Integer.toString(Empid)))
        	{
        		for(String x:str)
        		{
        			filewriter.write(x+",");
        		}
        		filewriter.write("\n");
        	}
}
        System.out.println("Successfully Deleted:"+Empid);
        sc.close();
        filereader.close();
        filewriter.close();
        rename();
	}
 public void rename() throws IOException,ArrayIndexOutOfBoundsException
 {
        FileReader filereader1=new FileReader(file1);
        FileWriter filewriter1=new FileWriter(file);
        Scanner sc1 = new Scanner(filereader1);
   while(sc1.hasNextLine())
{
	String[] str1=sc1.nextLine().split(",");
		for(String x:str1)
		{
			filewriter1.write(x+",");
		}
		filewriter1.write("\n");
}
sc1.close();
filereader1.close();
filewriter1.close();

}
}

