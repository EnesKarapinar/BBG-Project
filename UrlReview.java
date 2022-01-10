import java.util.Scanner;

public class UrlReview {
	public static void main (String[] args) {

		String url;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("URL Giriniz : ");
		url = scan.nextLine();
		
		if (url.contains(".com")) {
			System.out.println("Standart domain uzantisi");
		}
		else if (url.contains(".net")) {
			System.out.println("Internet ile ilgili işlem yapan kişi veya kurumlar için yaratılmış sitedir.");
		}
		else if (url.contains(".org")) {
			System.out.println("Vakif sitesidir");
		}
		else if (url.contains(".biz")) {
			System.out.println("Ticari bir sitedir");
		}
		else if (url.contains(".info")) {
			System.out.println("Enformasyon konularında hizmet sunan sitedir");
		}
		else if (url.contains(".pro")) {
			System.out.println("Profesyonel bir sirketin sitesidir.");
		}
		else if (url.contains(".edu")) {
			System.out.println("Egitim alaninda hizmet veren bir sitedir");
		}
		else if (url.contains(".gov")) {
			System.out.println("Devlet kurulusu olan bir sitedir");
		}
		else {
			System.out.println("Hatali");
		}
		
		if (url.contains(".tr")) {
			System.out.println("Turkiye icin olusturulan bir site");
		}
		else if (url.contains(".us")) {
			System.out.println("Amerika icin olusturulan bir site");
		}
		else if (url.contains(".de")) {
			System.out.println("Almanya icin olusturulan bir site");
		}
		
	}
}
