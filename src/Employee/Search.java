package Employee;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Search {
	public void search() throws FileNotFoundException {
		Scanner scan=new Scanner(System.in);
		// TODO Auto-generated method stub

		FileReader filereader=new FileReader("C:\\Users\\ajith.periyasamy\\Desktop\\Ajith\\Database.txt");
		Scanner sc = new Scanner(filereader);
		System.out.println("Enter the Employee Name");
		String EmpName=scan.next();
		//if(filereader.)
        while(sc.hasNextLine()){
        	String[] str=sc.nextLine().split(",");
        	if(str[1].equals(EmpName))
        		{
        			for(String y: str)
                	{
        				System.out.println(y);
                	}
        			System.out.println("==*==*==*==*==*==*==*==*==*==*==");
        		}
        	}
		}
	public void search(String position) throws FileNotFoundException {
		Scanner scan=new Scanner(System.in);
		// TODO Auto-generated method stub
		FileReader filereader=new FileReader("C:\\Users\\ajith.periyasamy\\Desktop\\Ajith\\Database.txt");
		Scanner sc = new Scanner(filereader);
		//if(filereader.)
        while(sc.hasNextLine()){
        	String[] str=sc.nextLine().split(",");
        		if(str[6].equals(position))
        		{
        			for(String y: str)
                	{
        				System.out.println(y);
                	}
        			System.out.println("==*==*==*==*==*==*==*==*==*==*==");
        		}
        	}
}
	}

