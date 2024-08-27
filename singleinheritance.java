package inheritance;
class employee{
	String name;
	int id;
	public void SetName(String name) {
		this.name=name;
		System.out.println(name);
		}
	public void SetID(int id) {
		this.id=id;
		System.out.println(id);
	}
}
class Manager extends employee{
	public void SetName(String name) {
		this.name=name;
		System.out.println(name);
	}
	public void SetID(int id) {
		this.id=id;
		System.out.println(id);
	}
}

public class singleinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager m=new Manager();
		m.SetName("kannan");
		m.SetID(101);
		m.SetName("Rajesh");
		m.SetID(104);

	}

}
