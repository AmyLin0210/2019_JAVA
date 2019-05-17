package hw6;

public class Email extends Document {

	private String sender;
	private String recipient;
	private String title;
	
	public void setSender( String s ) {
		sender = s;
	}
	public String getSender() {
		return sender;
	}
	public void setRecipient( String s ) {
		recipient = s;
	}
	public String getRecipient() {
		return recipient;
	}
	public void setTitle( String s ) {
		title = s;
	}
	public String getTitle() {
		return title;
	}
	public String toString() {
		String temp = "";
		temp += "From: " + sender + "\n" ;
		temp += "To: " + recipient + "\n";
		temp += "Title: " + title + "\n";
		temp += text;
		
		return temp;
	}
}
