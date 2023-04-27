package test;

import java.util.Iterator;

//import java.util.Iterator;

class M extends Thread{
	public void run() {
		try {
			for (int i = 0; i < 5; i++) {
				System.out.println("jhjh");
				Thread.sleep(3000);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
class N extends Thread{
	public void run() {
		try {
			for (int i = 0; i < 5; i++) {
			System.out.println("This is thread");
			Thread.sleep(1000);
		}
			}
		catch (Exception e) {
			// TODO: handle exception
		}
		}
}
class Main4 extends Thread{
		
public static void main(String[] args) {
	N ob = new N();
	M ob1 = new M();
	ob1.start();
	ob.start();
}
}
