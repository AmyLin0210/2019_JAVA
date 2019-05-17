package hw6;

public class File extends Document{
	private String pathname;
	
	public void setPathname( String s ) {
		pathname = s;
	}
	public String getPathname( ) {
		return pathname;
	}
	public String toString() {
		String temp = "";
		temp += "Path: " + this.getPathname() + "\n";
		temp += text;
		
		return temp;
	}

}
