package test;
class B{
	void m1(int a, int b) {
//		a = 10;
//		b = 29;
		System.out.println(a+b);
	}
	void m1(int b) {
		//b = 90;
		System.out.println(b);
	}
}
class C extends B{
	void m1(int a, int b) {
//		a = 20;.
//		b = 39;
		System.out.println(a+b);
	}
}
abstract class D{
	abstract void me();
}
interface F{
	int m2();
}
class E extends D implements F{

	@Override
	void me() {
		// TODO Auto-generated method stub
		System.out.println("jhgj");
	}

	@Override
	public int m2() {
		// TODO Auto-generated method stub
		System.out.println("This is interface");
		return 0;
	}
	
}
public class Main3 {
	public static void main(String[] args) {
		D ob = new E();
		ob.me();
		F ob2 = new E();
		ob2.m2();
		B ob3 = new B();
		ob3.m1(10);
		ob3.m1(20, 30);
		C ob4  = new C();
		ob4.m1(10, 20);
	}
}
