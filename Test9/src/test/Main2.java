package test;
class A{
	static String name;
	int sal;
	int a,b;
	public A(int sal, int a, int b) {
		super();
		this.sal = sal;
		this.a = a;
		this.b = b;
	}
	public A() {
		// TODO Auto-generated constructor stub
		name = "kajal";
		sal = 28980;
	}
}
public class Main2 {
public static void main(String[] args) {
	System.out.println("Hello world");
	A ob = new A(10, 2, 30);
	System.out.println(ob.sal);
	System.out.println(A.name);
	System.out.println(ob.a+" "+ob.b);
	System.out.println(ob.name);
	System.out.println(ob.sal);
}
}
