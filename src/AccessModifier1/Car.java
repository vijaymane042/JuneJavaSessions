package AccessModifier1;

public class Car {

	protected int protectdPrice;
	public String pblicName;
	private String prvateColor;
	int deefalutMileage;//by default
	
	protected void checkProtectedMethod() {
		System.out.println("Protected Method and access protected modifier :" +protectdPrice);

	}
	
	 public void checkPublicMethod() {
		System.out.println("Public Method and access public modifier :" +pblicName);
	}
	
	private void checkPrivateMethod() {
		System.out.println("Private Method and access private modifier :" +prvateColor);
	}
	
	 void checkDefaultMethod() {
		System.out.println("Default Method and access default modifier :" +deefalutMileage);
	}
	
	public static void main(String[] args) {
     //final int i =10;
     Car c = new Car();
     System.out.println(c.protectdPrice);
     c.protectdPrice = 10;
     c.pblicName = "Vijay";
     c.prvateColor = "red";
     c.deefalutMileage = 99;
     
     c.checkProtectedMethod();
     c.checkPublicMethod();
     c.checkPrivateMethod();
     c.checkDefaultMethod();
	}

}
