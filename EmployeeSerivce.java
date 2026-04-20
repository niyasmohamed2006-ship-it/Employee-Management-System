package ems;

import java.util.*;
public class EmployeeSerivce {
	private List<Employee> empList = new ArrayList<>();
	public void addEmployee(Employee emp) {
		empList.add(emp);
		System.out.println("Employee Added");
		}
	public void viewEmployees() {
		for(Employee e : empList) {
			e.display();
		}
	}
	public Employee searchEmployee(int id) {
		for(Employee e : empList) {
			if(e.getId() == id) {
				return e;
			}
		}
		return null;
	}
	public void deleteEmployee(int id) {
		Employee emp = searchEmployee(id);
		if(emp != null) {
			empList.remove(emp);
			System.out.println("Employee Deleted!");
		}else {
			System.out.println("Employee Not Found!");
		}
	}
	public void updateEmployee(int id,String name, double salary) {
		Employee emp = searchEmployee(id);
		if(emp != null) {
			emp.setName(name);
			emp.setSalary(salary);
			System.out.println("Employee Updated!");
		}else {
			System.out.println("Employee Not Found!");
		}
	}
}