import java.util.Random;

public class passGenerator {

	public static void main(String[] args) {
		
		// project generates passwords
		// using random number generator and array of strings
		
		String[] alpha = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","!","@","#","$","%","^","&"};
		
		getArr(alpha);
	}
	
	// method gets the array
	
	public static void getArr(String[] arr) {
		
		// creates random numbers
		Random r = new Random();
		
		int min = 6;
		int max = 25;
		
		// random number using inclusive 6 - 32
		int rand = r.nextInt(max) + min; 
		
		int passGen = r.nextInt(11) + 5; // inclusive [5, 15]
		
		System.out.println(rand + " randon characters to create password");
		System.out.println(passGen + " lines of passwords generated\n");
		
		for(int i = 0; i < passGen; i++) { // creates rows of passwords
			for (int j = 0; j <= rand; j++) { // creates characters of each password
				
				int passrand = r.nextInt(33);
				System.out.print(arr[passrand]+ "");
			}
			
			System.out.print("\n");
		}	
	}
}