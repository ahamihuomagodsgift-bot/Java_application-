import java.util.scanner;

public class UserInput{ 
   public static void main(String[] args){ 
     Scanner input = new Scanner(System.in);
	
	 System.out.print("Enter your firstname: ");
	 String firstName =input.nextLine();
	 
	 System.out.printf("Hello %s",firstName);
	
	}
}   



