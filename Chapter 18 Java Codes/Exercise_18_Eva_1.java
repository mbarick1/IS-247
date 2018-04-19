import java.util.*;
public class Exercise_18_Eva_1 {

	/** Making Public class for this program. 
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			//Enter numbers here 
			
			System.out.print("Enter any number");
			Scanner input =new Scanner(System.in);
			String str =input.next();
			int num = Integer.parseInt(str);
			// Please enter the reverse number
			System.out.print("The reverse number");
			reverse(num);
		}
		
		//Used this command to handle the errors
		catch(Exception e){ System.out.println("Exception occueeed");
		System.exit(0);}

	}
public static void reverse(int value){
	
	if(value > 0) {
		System.out.print(value%10);
		reverse(value/10);
		
		
	}
	
	
}
}
