package hw2;
import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		double a, b, c, ans1, ans2;
		String outFormat;
		
		a = keyboard.nextDouble();
		b = keyboard.nextDouble();
		c = keyboard.nextDouble();
		outFormat = keyboard.next();
		DecimalFormat df = new DecimalFormat(outFormat);

		ans1 = ( -b + Math.sqrt( b*b - 4*a*c ))/ (2*a);
		ans2 = ( -b - Math.sqrt( b*b - 4*a*c ))/ (2*a);
		
		if( a > 0 ) {
			System.out.print( df.format(Math.max(ans1, ans2)) + "\n");
			System.out.println( df.format(Math.min(ans1, ans2)));
		}
		else {
			System.out.print( df.format(Math.min(ans1, ans2)) + "\n");
			System.out.println( df.format(Math.max(ans1, ans2)));
		}
		
		keyboard.close();
	}

}
