package hw4;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		double  inputNum = keyboard.nextDouble();
		double  guess    = inputNum/2;
		
		while( Math.abs(inputNum - guess*guess ) > 0.005 )
			guess = (guess + inputNum/guess ) / 2;
		
		if( Math.round(guess*100) % 100 == 0 )
			System.out.format("%.0f", guess);
		else if( Math.round(guess*100) % 10 == 0 )
			System.out.format("%.1f", guess);
		else
			System.out.format("%.2f", guess);
		keyboard.close();
		
	}

}
