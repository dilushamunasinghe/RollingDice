import java.util.Random;

public class Roll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random num = new Random();
		int x = num.nextInt(6) +1;
		
		
		System.out.println("You Rolled : " +x);

	}

}
