package AccessModifier2;

import AccessModifier1.Car;

public class HondaDiffPkgSubClass extends Car{

	public static void main(String[] args) {
		
		HondaDiffPkgSubClass h = new HondaDiffPkgSubClass();
		System.out.println("Honda Diff Pkg Sub Class");
		h.protectdPrice = 89;
		h.pblicName = "jay";
		
		h.checkProtectedMethod();
		h.checkPublicMethod();
	}

}
