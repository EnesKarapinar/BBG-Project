import java.util.Scanner;

public class PlateReview {
	public static void main(String[] args) {
		
		String [] cities = {"Adana", "Adiyaman", "Afyon", "Agri", "Amasya", "Ankara", "Antalya", "Artvin", "Aydin", "Balikesir", "Bilecik", "Bingol", "Bitlis", "Bolu",
							"Burdur", "Bursa", "Canakkale", "Cankiri", "Corum", "Denizli", "Diyarbakir", "Edirne", "Elazig", "Erzincan", "Erzurum", "Eskisehir", 
							"Gaziantep", "Giresun", "Gumushane", "Hakkari", "Hatay", "Isparta", "Mesin", "Istanbul", "Izmir", "Kars", "Kastamonu", "Kayseri", "Kirklareli",
						    "Kirsehir", "Kocaeli", "Konya", "Kutahya", "Malatya", "Manisa", "Kahramanmaras", "Mardin", "Mugla", "Mus", "Nevsehir", "Nigde", "Ordu", "Rize",
							"Sakarya", "Samsun", "Siirt", "Sinop", "Sivas", "Tekirdag", "Tokat", "Trabzon", "Tunceli", "Sanliurfa", "Usak", "Van", "Yozgat", "Zonguldak",
							"Aksaray", "Bayburt", "Karaman", "Kirikkale", "Batman", "Sirnak", "Bartin", "Ardahan", "Igdir", "Yalova", "Karabuk", "Kilis", "Osmaniye",
						    "Duzce"};
		
		String [] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "r", "s", "t", "u", "v", "y", "z"};
		
		String input;
		int firstCharacter;
		boolean isTrue = true;
		String middle = "";
		String end = "";
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Plaka Giriniz : ");
		input = scan.nextLine();
		
		
		for (int k = 0; k < alphabet.length; k++) {
			if (input.substring(1, 2).equals(alphabet[k])) {
				System.err.println("Hatali giris!!");
				isTrue = false;
			}
		}
		
		for (int l = 2; l < input.length(); l++) {
				for (int m = 0; m < alphabet.length; m++) {
					if (input.substring(l, l + 1).equals(alphabet[m])) {
						middle += input.substring(l, l + 1);
						
					}
				}
		}
		
		if (middle.length() <= 1 || middle.length() > 3) {
			System.err.println("Hatali giris!!");
			isTrue = false;
		}
		
		for (int n = 3; n < input.length(); n++) {
				for (int o = 0; o <= 9; o++) {
					String oStr = Integer.toString(o);
					if (input.substring(n, n + 1).equals(oStr)) {
						end += input.substring(n, n + 1);
					}
				}
			}
		
		if (end.length() <= 2 || end.length() > 4) {
			System.err.println("Hatali giris!!");
			isTrue = false;
		}
	
		if (isTrue == true) {
			
			firstCharacter = input.charAt(0);
		
			int firstCharacterInt = Integer.parseInt(input.substring(0, 2));
			
			
			if (firstCharacter == 48) {
				for (int i = 1; i <= 9; i++) {
					String iStr = Integer.toString(i);
				
					if (input.substring(1, 2).equals(iStr)) {
						System.out.println("Sehir = " + cities[i - 1]);
					}
				}
			}
		
			if (firstCharacterInt >= 10) {
				for (int j = 1; j <= cities.length; j++) {
			
					String jStr = Integer.toString(j);
			
					if (input.substring(0, 2).equals(jStr)) {
						System.out.println("Sehir = " + cities[j - 1]);
					}
			
				}
			}
			
			
			
			System.out.println("Harf Kismi = " + middle.toUpperCase());
			System.out.println("Numara Kismi = " + end);
			
		}
		
		
	}
}