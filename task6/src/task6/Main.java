package task6;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
	        Employee[] e=new Employee[3];
	        for (int i = 0; i < 3; i++) {
	            System.out.println("Employee id");
	            int id=sc.nextInt();
	            sc.nextLine();
	            System.out.println("Employee name");
	            String name=sc.nextLine();
	            Employee emp=new Employee(id,name);
	            e[i]=emp;
	        }
	        EmployeeBO bo=new EmployeeBO();
	        bo.topThree(e);
	}
}

