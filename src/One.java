import java.util.Random;


public class One {
	
	public static void main(String[] args) {
		
				
		System.out.println(random100());
		
		
	  }
	
	
	

	public static int random100() {
		Random rand = new Random();
		return rand.nextInt(100) + 1;
		
	}
	
	
	
}
