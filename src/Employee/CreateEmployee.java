package Employee;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CreateEmployee {
	private int Employee_Id;
	private int age;
	private String Employee_Name,project;
	private String Designation,Address,branch;
	private String Skills,mailId,Gender;
	private int Salary;

	@SuppressWarnings("resource")
	public void PersonalDetails() throws IOException  {
		Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub
		FileWriter fw=new FileWriter("C:\\Users\\ajith.periyasamy\\Desktop\\Ajith\\Database.txt",true);     
			try {
				System.out.println("Enter the employee Id");
				Employee_Id=sc.nextInt();
				
				System.out.println("Enter the Employee_name:");
				Employee_Name=sc.next();
				
				try {
				System.out.println("Enter the Employee_age:");
				age=sc.nextInt();
				if(age<=0) {
					throw new CustomException();
				}
				}
				catch(CustomException e){
				System.out.println("aga is not negative or zero");
				}
				
				System.out.println("Enter the mailId of Employee:");
				mailId=sc.next();
				
				System.out.println("Enter the Address of Employee:");
				Address=sc.next();
				
				System.out.println("Enter the Gender of Employee:");
				Gender=sc.next();
				
				System.out.println("Enter the Professional Details of Employee");
				System.out.println("Enter the Designation:");
				Designation=sc.next();
				
				System.out.println("Enter the Skills of Employee:");
				Skills=sc.next();
				
				System.out.println("Enter the Project Employee is Working On:");
				project=sc.next();
				
				System.out.println("Enter the Salary of Employee:");
				Salary=sc.nextInt();
				
				fw.write("\n"+Employee_Id+",");
				fw.write(Employee_Name+",");
				fw.write(age+",");
				fw.write(mailId+",");
				fw.write( Address+",");
				fw.write(Gender+",");
				fw.write( Designation+",");
				fw.write(Skills+",");
				fw.write(project+",");
				fw.write(Salary+",");
				
			}
			catch(InputMismatchException e)
			{
				System.out.println(" Wrong datatype! Enter the integers");
				System.out.println("Employee is not Created");
				CreateEmployee createEmp=new CreateEmployee();
				createEmp.PersonalDetails();
			}
			System.out.println("Successfully Created");
			 fw.close();
			 
	}
		
}
