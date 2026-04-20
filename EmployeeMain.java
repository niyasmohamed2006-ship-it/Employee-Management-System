package ems;

import java.util.Scanner;

public class EmployeeMain {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	EmployeeSerivce service = new EmployeeSerivce();
	while(true) {
		System.out.println("\n1. Add\n2. View\n3. Search\n4. Update\n5. Delete\n6. Exit");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			System.out.print("Enter ID: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.print("Enter Name: ");
			String name = sc.nextLine();
			System.out.print("Enter Salary: ");
			double salary = sc.nextDouble();
			service.addEmployee(new Employee(id ,name, salary));
			break;
		case 2:
			service.viewEmployees();
			break;
		case 3:
			System.out.print("Enter ID: ");
			Employee e = service.searchEmployee(sc.nextInt());
			if(e != null) e.display();
			else System.out.println("Not Found");
			break;
		case 4:
			System.out.print("Enter ID: ");
			int uid = sc.nextInt();
			sc.nextLine();
			System.out.print("Enter New Name: ");
			String uname = sc.nextLine();
			System.out.print("Enter New Salary: ");
			double usal = sc.nextDouble();
			service.updateEmployee(uid,uname,usal);
			break;
		case 5:
			System.out.print("Enter ID: ");
			service.deleteEmployee(sc.nextInt());
			break;
		case 6:
			System.exit(0);
			}
		}
	}
}
