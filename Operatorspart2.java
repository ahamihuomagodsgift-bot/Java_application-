public class Operatorspart2{
	public static void main(String[] args){
		int num1 = 15;
		int num2 = 25;
		int num3 = 17;
		
		//AND logical operator 
		boolean results = (num1> num2) && (num1 > num3);
		System.out.printf("The result is %b",results);
		
		//OR logical operator
		boolean results2 = (num1> num2) || (num1 > num3);
		System.out.printf("The result is %b",results2);
		
		//Not logical operator
		boolean result3 = !((num1> num2) && (num1 > num3));
		System.out.printf("The result is %b",result3);
		
		//pre increment unary operator
		int num4 = 10;
		System.out.printf("%d%n",num4);
		System.out.printf("%d%n",++num4);
		
		//post-increment unary operator		
		int num5 = 10;
		System.out.printf("%d%n",num5);
		System.out.printf("%d%n",num5++);
		
		//pre decrement unary operator
	    System.out.printf("%d%n",num4);
		System.out.printf("%d%n",--num4);
		
		
		//post-decrement unary operator		
		System.out.printf("%d%n",num5);
		System.out.printf("%d%n",num5--);
		System.out.printf("%d%n",num5);

	}
} 