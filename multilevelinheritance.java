package inheritance;
import java.util.Scanner;
class Student{
	String name;
	int m1,m2,m3,total;
	Scanner sc=new Scanner(System.in);
	void acceptname() {
	System.out.println("Enter the name");
	name=sc.nextLine();
	System.out.println("Name of the student is"+name);
	}
}
class Studentmark extends Student{
	void Setmark(){
		System.out.println("Enter the mark one by one");
		m1=sc.nextInt();
		m2=sc.nextInt();
		m3=sc.nextInt();
	}
}
class Studenttotal extends Studentmark{
	void displaytotal() {
		total=m1+m2+m3;
		System.out.println("Total mark os the student is"+total);
	}
}
public class multilevelinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Studenttotal s=new Studenttotal();
		s.acceptname();
		s.Setmark();
		s.displaytotal();
	}

}
