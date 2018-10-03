
public class Three {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Alarm(0);
		Alarm(3);
		
		
	}

	
	
	
	public static void Alarm(int times) {
		
		if (times >= 1) {
		for (int i = 1; i <= times; i++) {
			System.out.println("Alarm!");
			
		}
		}
		else {
			System.out.println("Error");
		}
		
	}
	
	
}
