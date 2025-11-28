package Operator;

public class assignment {
	public static void main (String[] args) {
		//simple assignment operator (=)
		int a= 10;
		System.out.println("the value of a is "+a);
		
		//add and  assign (+=)
		int b = 10;
		 b+=5;
		System.out.println("the value of b is "+b);
		
		//sub and assign (-=)
		int c= 20;
		c-=30;
		System.out.println("the value of c is "+c);
		
		//multipy and assign (*=)
		int d= 20;
		d*=30;
		System.out.println("the value of d is "+d);
		
		//divide and assign (/=)
		int f =30;
		f/=2;
		System.out.println("the value of f is "+f);
		
		//modulus and assign (%=)
		int g=10;
		g %=5;
		System.out.println("the value of g is "+g);
		
		
		
		int h=10;
		System.out.println("initial value:"+h);
		
		h +=4;
		System.out.println("after += :" +h);
		
	   h-=4;
			System.out.println("after -= :" +h);
			
	   h*=4;
	 System.out.println("after *= :" +h);
				
	 h/=4;
	System.out.println("after /= :" +h);
	
	 h%=7;
	 System.out.println("after %= :"+h);
	}

}
