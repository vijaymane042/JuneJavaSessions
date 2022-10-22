package javasessions;

public class SwitchCaseStatement {

	public static void main(String[] args) {
//take a browser one browser value...IE/CHROME/FF/SAFARI
//if the condition matched...launch the browser
//else print a message: please pass the right browser
  String browser = "Chrome";
  byte a=10;

  switch (browser) {
case "Chrome":
	System.out.println("lounch chrome");
	break;
case "IE":
	System.out.println("lounch IE");
	break;

default:
	System.out.println("please pass the right browser");
	break;
}

  char a1= 'o';
  switch (a1) {
case 'a':System.out.println("a");
case 'e':System.out.println("e");
case 'i':System.out.println("i");
case 'o':System.out.println("o");
case 'u':System.out.println("u");
	break;

default:
	break;
}
  
}
  //we can use switch on on multiple environment DEV/QA/PROD/UAT
  //cross browser
  //locator
  //byte/short/int/string allowed in switch
  //switch is not allowed for boolean/double/long/float data types


	}
	


