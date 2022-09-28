package dersIkiOdev;

public class Methods {

	public static void main(String[] args) {
		sayiBulmaca();
		sayiBulmaca();
		sayiBulmaca();
		sayiBulmaca();
		
	}
	
	public static void sayiBulmaca() {
		int[] sayilar = {1,3,4,5,2,7,8,9};
		int bulunacak = 3;
		boolean varMi = false;
		
		for(int sayi:sayilar) {
			if(sayi==bulunacak) {
				varMi=true;
				
				if(varMi){
					mesajVer("Sayı mevcuttur: " + bulunacak);
				} else {
					mesajVer("Sayı mevcut değildir: " + bulunacak);
				}
			}
		}
		
		
	}
	
	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
		
	}
	
	
}
