package test;

interface Test{
	void m1();
}

public class Main implements Test {
	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("This is interface");
	}
public static void main(String[] args) {
	//System.out.println("this is main class");
	Test ob = new Main();
	ob.m1();
		}
}
