package hw1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c;
		String ans;
		for(int i =0; i < args.length; ++i) {
			
			c = args[i].charAt(0);
			if( c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u' )
				args[i] = args[i].substring(1) + args[i].charAt(0);
				
			// let the first char to uppercase and add "ay" in the end
			args[i] =  args[i].substring(0,1).toUpperCase() + args[i].substring(1).toLowerCase() + "ay";
		}
			
		// combine all the substring
		ans = "";
		for( int i = 0; i < args.length - 1; ++i ) {
			ans = ans + args[i] + " ";
		}
		ans = ans + args[args.length-1];
			
		System.out.println(ans);

	}

}
