package javasessions;

import java.util.ArrayList;

public class Application {

	public static void main(String[] args) {

		Application a = new Application();
		double d4=a.getNumber(10.11,20.20);//call by value/arguments
		System.out.println(d4);
		
		Application a1 = new Application();
		ArrayList devices= a1.getDevicesList("Vijay");
		System.out.println(devices);
		System.out.println("total devices :" +devices.size());
	}

	public double getNumber(double d1, double d2)//parameters
	{
		double d3 = d1 + d2;
		return d3;
	}
	
	//WAF: getDevicesList(empName)
	//parameter: empName(String)
	//return: list of devices==> ArrayList
	public ArrayList<String> getDevicesList(String empName) {
		System.out.println("getting devices list for :"+empName);
		ArrayList<String> deviceList = new ArrayList<String>();
		if(empName.equals("Vijay")) {
			deviceList.add("MI");
			deviceList.add("Apple");
			deviceList.add("Lenovo");
		}else if(empName.equals("Jaya")) {
			
			deviceList.add("MI");
			deviceList.add("Apple");
			deviceList.add("Lenovo");
		}else {
			System.out.println("emp name is not found :"+empName);
		}
		return deviceList;
	}
	
}
