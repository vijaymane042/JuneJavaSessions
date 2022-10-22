package AccessModifier1;

public class BMWsubClass extends Car {

	@Override
	protected void checkProtectedMethod() //allow to make only public instead of protected
	{
		System.out.println("Protected Method and access protected modifier :" +protectdPrice);
	}
	@Override
	 public void checkPublicMethod() 
	{
		System.out.println("Public Method and access public modifier :" +pblicName);
	}

	private void checkPrivateMethod() ////allow to make  public/default/protected instead of private
	{
		System.out.println("Private Method and access private modifier :");
	}
	@Override
	  void checkDefaultMethod() //allow to make  public/protected instead of default
	{
		System.out.println("Default Method and access default modifier :" +deefalutMileage);
	}
	public static void main(String[] args) {

		BMWsubClass b = new BMWsubClass();
		System.out.println("BMW class methods :");
		b.protectdPrice = 55;
		b.pblicName = "jay";
		b.deefalutMileage = 12;

		b.checkProtectedMethod();
		b.checkPublicMethod();
		b.checkDefaultMethod();
	}

}
