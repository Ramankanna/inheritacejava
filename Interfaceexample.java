package inheritance;
import java.util.Scanner;
interface employeename{
	void setname();
}
interface employeedetails{
	void setdetails();
}
class Employeedisplay implements employeename,employeedetails{
	Scanner sc=new Scanner(System.in);
	String name;
	String address;
	public void setname() {
		System.out.println("Enter the name:");
		name=sc.nextLine();
	}
	public void setdetails() {
		System.out.println("Enter the Employee address");
		address=sc.nextLine();
	}
	public void displaydetails() {
		System.out.println("Name of the employee is"+name);
		System.out.println("Address of the employee is"+address);
	}
}
class interfaceexample{
	public static void main(String[] args) {
		Employeedisplay e=new Employeedisplay();
		e.setname();
		e.setdetails();
		e.displaydetails();
	}
}
