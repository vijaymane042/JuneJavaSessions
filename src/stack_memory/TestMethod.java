package stack_memory;

public class TestMethod {

	
	
	public void m1() {
		System.out.println("M1");
		m2();
	}
	public void m2() {
		System.out.println("M2");
		m3();
	}
	public void m3() {
		System.out.println("M3");
		//m1();
	}
	
	public static void main(String[] args) {

		TestMethod t = new TestMethod();
		t.m1();

	}

}
