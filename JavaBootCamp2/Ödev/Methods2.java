package dersIkiOdev;

public class Methods2 {

	public static void main(String[] args) {
		String mesaj = sehirVer();
		System.out.println(mesaj);
		System.out.println(topla(1, 2));
		
		ekle();
		sil();
		güncelle();

	}

	public static void ekle() {

		System.out.println("Eklendi.");

	}

	public static void sil() {

		System.out.println("Silindi.");

	}

	public static void güncelle() {

		System.err.println("Güncellendi.");

	}

	public static int topla(int sayi1, int sayi2) {
		return sayi1 + sayi2;
	}

	public static String sehirVer() {

		return "Ankara";
	}

}
