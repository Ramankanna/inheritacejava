package inheritance;
class dog{
	void Dogsound(){
	System.out.println("Dog barks");
	}
}
class tiger extends dog{
	void tigersound() {
		System.out.println("Tiger Roars");
	}
}
class cat extends dog{
	void catsound(){
		System.out.println("Meeeowwww");
	}
}
public class Hierarchicalinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cat c=new cat();
		tiger t=new tiger();
		c.Dogsound();
		c.catsound();
		t.tigersound();

	}

}
