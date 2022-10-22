package javasessions;

public class IncrementalAndDecremental {

	public static void main(String[] args) {
		//1. post increment: a++
		
		int x =1;
		int k1= x++ + ++x + x++ + ++x + ++x;
		System.out.println(k1);
		int a = 2;
		int b = a++;
		System.out.println(a);//3
		System.out.println(b);//2
		
		int k2 = -9;
		int j = k2++;
		System.out.println(k2);//-8
		System.out.println(j);//-9
		
		int total = 1;
		System.out.println(total++);//1
		System.out.println(total);//2
		
		//2. pre increment: ++a
		
		int m = 5;
		int n = ++m;
		System.out.println(m);//6
		System.out.println(n);//6
		
		int sum = -100;
		int add = ++sum;
		System.out.println(sum);//-99
		System.out.println(add);//-99
		
		int count = 55;
		System.out.println(++count);//56
		
		//3. post decrement: a--
		int a1 = 1;
		int a2 = a1--;
		System.out.println(a1);//0
		System.out.println(a2);//1

		int a3 = -44;
		int a4 = a3--;
		System.out.println(a3);//-45
		System.out.println(a4);//-44
		
		int food = -55;
		System.out.println(food--);//-55
		System.out.println(food);//-56
		
		//4. pre decrement --a
		int a5 = 3;
		int a6 = --a5;
		System.out.println(a5);//2
		System.out.println(a6);//2
		
		int a7 = -7;
		int a8 = --a7;
		System.out.println(a7);//-8
		System.out.println(a8);//-8
		
		int gmail = -1000;
		System.out.println(--gmail);//-1001
		System.out.println(gmail);//-1001
		System.out.println(gmail++);//-1001
		System.out.println(gmail);//-1000
		
		int bal =400;
		int totalBal= ++bal + 10;
		System.out.println(totalBal);//411
		System.out.println(bal);//401
		
		int bal1 =400;
		int totalBal1= bal1++ + 10;
		System.out.println(totalBal1);//410
		System.out.println(bal1);//401
		
		int le = 2;
		int re = le++ +le++;
		System.out.println(re);
		
		
	}

}
