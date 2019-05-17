package hw6;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  keyboard = new Scanner(System.in);

		Document document;
		Email    email = new Email();
		File     file = new File();
		
		String []input = new String[7];
		
		for( int i=0; i < 7; ++i )
			input[i] = "";
		
		input[1] = keyboard.nextLine();
		input[2] = keyboard.nextLine();
		
		if( input[2].indexOf("Document") != -1 ) {
			document = new Document();
			input[3] = keyboard.nextLine();
			document.setText( input[3] );
		}
		else if( input[2].indexOf("Email") != -1 ) {
			document = email;
			input[3] = keyboard.nextLine();
			input[4] = keyboard.nextLine();
			input[5] = keyboard.nextLine();
			input[6] += keyboard.nextLine();
			email.setSender(input[3] );
			email.setRecipient(input[4]);
			email.setTitle(input[5]);
			email.setText(input[6]);
		}
		else {
			document = file;
			file.setPathname(keyboard.nextLine());
			file.setText(keyboard.nextLine());
		}
		
		if( input[1].indexOf("A") != -1) {
			System.out.println(document.toString());
		}
		else if( input[1].indexOf("B") != -1) {
			String temp = keyboard.nextLine();
			if( document.toString().indexOf(temp) == -1 )
				System.out.println("false");
			else 
				System.out.println("true");
		}
		else {
			input[3] = keyboard.nextLine();
			input[4] = keyboard.nextLine();
			if( input[2].indexOf("Document") != -1 ) {
				if(input[3].indexOf("text") != -1) 
					document.setText(input[4]);
			}
			else if( input[2].indexOf("Email") != -1 ) {
				if( input[3].indexOf("sender") != -1)
					email.setSender(input[4] );
				else if( input[3].indexOf("recipient") != -1 )
					email.setRecipient(input[4]);
				else if( input[3].indexOf("title") != -1 )
					email.setTitle(input[4]);
				else
					email.setText(input[4]);
			}
			else {
				if( input[3].indexOf("path") != -1)
					file.setPathname(input[4]);
				else
					file.setText(input[4]);
			} 
			System.out.println(document.toString());
		}
		
		
		keyboard.close();
	}

}
