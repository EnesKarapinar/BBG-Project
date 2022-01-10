import java.util.Scanner;

public class StudentNumberReview {
	public static void main (String[] args) {
		
		String studentNumber, result = "";
		int year, stuedentOrder;
		Boolean isCorrect = true;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Ogrenci Numaranizi Giriniz : ");
		studentNumber = scan.nextLine();
		
		
		
		if (studentNumber.length() > 9 || studentNumber.length() < 9) {
			isCorrect = false;
			System.out.println("Ogrenci Numarasini Yanlis Girdiniz!!");
		}
		
		if (isCorrect == true) {
			
			year = Integer.parseInt(studentNumber.substring(0, 2));
			stuedentOrder = Integer.parseInt(studentNumber.substring(6, studentNumber.length()));
				
			if (year > 22) {
				System.out.println("Giris Yiliniz : " + "19" + year);
			}
			else if (year <= 22) {
				System.out.println("Giris Yiliniz : " + "20" + year);
			}
			
			System.out.println("Giris siraniz : " + stuedentOrder);
			
		}
		
	}
}