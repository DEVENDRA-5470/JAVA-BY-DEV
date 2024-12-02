public class Main {
	public static void main(String[] args) {
		hello();
		add();
		int res=sub();
		System.out.println(res);
		System.out.println("--------- Swapping Programming --------");
		swap();
		System.out.println("------ One to Ten ---------");
		one_ten();
		System.out.println("------- Odd Even --------");
		odd_even();
		System.out.println("------ Factorial --------");
		factorial();
		System.out.println("------ END --------");
		
	}

	public static void hello() {
		System.out.println("Hello Eclipse");

	}
	
	public static void add() {
		int a = 80;
		int b = 90;
		int c= a+b ;
		
		System.out.println(c);
		
	}
	
	public static int sub() {
		int a = 80;
		int b = 90;
		int c= a-b ;
		return c;
		
	}
	
	public static void swap() {
		int a = 20;
		int b = 30;
		
		System.out.println("BEFORE SWAPPING : " + a +" and " + b);
		
		int temp =  a;
		a = b;
		b = temp;
		
		System.out.println("AFTER SWAPPING : " + a +" and " + b);
		
	}
	
	
	public static void one_ten() {
		
		for (int i=0 ; i<=10 ;i++) {
			System.out.println("This is dev :"+i);
		}
		
	}
	
	public static void odd_even() {
		for (int i=0 ; i<20 ; i++) {
			
			if(i%2==0) {
				System.out.println("This is even :" + i);
			}
			else if (i%4==0) {
				System.out.println("This by 4 :" +i);
			}
			else {
				System.out.println("This is odd :"+ i);
			}
			
		}
	}
	
	public static void factorial() {
		
		int fact = 1;
		for (int i = 1 ; i <= 5 ; i++) {
			fact *= i;
		}
		System.out.println(fact);
	}
}
