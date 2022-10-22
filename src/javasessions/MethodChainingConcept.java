package javasessions;

public class MethodChainingConcept {

	//1
	public void m1() {
		System.out.println("It's M1");
		m2();//method chaining
	}
	public void m2() {
		System.out.println("It's M2");
		m3();
	}
	public void m3() {
		System.out.println("It's M3");
		
	}
	//2
	public void m4(int i) {
		System.out.println("It's M4");
		m5(i);//method chaining
	}
	public void m5(int j) {
		System.out.println("It's M5");
		m6(j);
	}
	public void m6(int k) {
		System.out.println("It's M6"+k);
		
	}
	public static void main(String[] args) {
	
		MethodChainingConcept mc = new MethodChainingConcept();
		mc.m1();
		mc.m4(10);
		//System.out.println(mc.m2());
	
	}

}
