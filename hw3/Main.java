package hw3;
import java.util.*;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		
		String input = keyboard.next();
		int num = Integer.parseInt(input.substring(2));
		
		switch(input.charAt(0) ) {
		
		case 'X':
			
			while( num % 2 == 0 )
				num /= 2;
			while( num % 3 == 0 )
				num /= 3;
			while( num % 5 == 0 )
				num /= 5;
			
			System.out.println((num == 1)? "true":"false");
			
			break;
			
		case 'Y':
			
			int temp = 0, count = 1, number = 2;
			
			while( count < num ) {
				temp = number;
				
				while( temp % 2 == 0 )
					temp /= 2;
				while( temp % 3 == 0 )
					temp /= 3;
				while( temp % 5 == 0 )
					temp /= 5;
				
				if( temp == 1 ) 
					++count;
		
				number += 1;
			}
			
			System.out.println(number - 1);
			break;
		}
		
		keyboard.close();
		
	}

}
