import java.util.Scanner;

public class MailReview {
	public static void main (String[] args) {
	
		String mail;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Mail Adresini Giriniz : ");
		mail = scan.nextLine();
		
		if (mail.contains("@") == false || (mail.substring(mail.length() - 1, mail.length())).equals("@")) {
			System.out.println("Mail adresi gecersiz");
		}
		else {
			System.out.println("Gecerli mail adresi");
		}
		
	}
}