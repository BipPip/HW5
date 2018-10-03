
public class Two {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		powersOfTwo();
		
		
	}
	
	public static void powersOfTwo() {
		int result = 0;
		for(int i = 2; i <= 10; i++) {
		
			result = (int) Math.pow(2, i);
			System.out.println(result);
		
		
		}
		
	}
	

}
