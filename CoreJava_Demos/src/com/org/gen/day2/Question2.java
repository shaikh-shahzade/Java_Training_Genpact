package com.org.gen.day2;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee2 emp1 = new Employee2();
		Manager mg = new Manager();
		emp1.name = "John";
		emp1.age = 25;
		emp1.phoneNum = 123456789;
		emp1.address = "Varanasi";
		emp1.Salary = 2000000;
		emp1.specialization = "JAVA";

		mg.name = "Brandon";
		mg.age = 26;
		mg.phoneNum = 564646457;
		mg.address = "Delhi";
		mg.Salary = 3400000;
		mg.department = "Technical";

		System.out.println("Employees Details: " + emp1.name + "\n" + "Age:" + emp1.age + "\n" + "Phone:"
				+ emp1.phoneNum + "\n" + "Address:" + emp1.address + "\n" + "specialization" + emp1.specialization);

		emp1.printSalary();

		System.out.println("\nManagers Details: " + mg.name + "\n" + "Age: " + mg.age + "\n" + "Phone:" + mg.phoneNum
				+ "\n" + "Address: " + mg.address + "\n" + "department" + mg.department);

		mg.printSalary();

	}

}
