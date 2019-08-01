package Employee;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class FetchEmployee extends CreateEmployee {
 
	public void fetchemployee() throws FileNotFoundException {
		Scanner scan=new Scanner(System.in);
		// TODO Auto-generated method stub
		int count=0;
		FileReader filereader=new FileReader("C:\\Users\\ajith.periyasamy\\Desktop\\Ajith\\Database.txt");
		Scanner sc = new Scanner(filereader);
		System.out.println("Enter the Employee Id");
		int Empid=scan.nextInt();
        while(sc.hasNextLine()){
        	String[] str=sc.nextLine().split(",");
        	if(str[0].equals(Integer.toString(Empid)))
        	{
        		count++;
        	for(String x: str)
        	{
        		System.out.println(x);
        	}
        	System.out.println("==*==*==*==*==*==*==*==*==*==*==");
        	}
}
        if(count==0) {
        	System.out.println("Employee is not available");
        }
       
        
}
}

