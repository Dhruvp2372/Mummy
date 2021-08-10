package Mother;

public class fibonacci {

	//public static void main(String[] args) {
	public void l(){// TODO Auto-generated method stub
		int a = 0;
		int b = 1;
		int c = 0;
		int num = 6;
		
		System.out.println("Hi, Today we will show Fibonacci numbers!");
		System.out.print(a + " " + b);
		for (int i = 2; i <= num; ++i) {
			c = a + b;
			System.out.print(" " + c);
			a = b;
			b = c;
		}
		
	}

}
