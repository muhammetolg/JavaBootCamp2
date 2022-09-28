package dersIkiOdev;

public class ReCapDemo_Classes {
	
	public static void RecapDemo_Classes(String[] args) {
		DortIslem dortIslem = new DortIslem ();
		int toplamaSonucu = dortIslem.Topla2(10, 5,3);
		int cikarmaSonucu = dortIslem.Cikar(10, 5);
		int carpmaSonucu = dortIslem.Carp2(10, 5,4);
		int bölmeSonucu = dortIslem.Bol(10, 5);
		System.out.println(toplamaSonucu);
		System.out.println(cikarmaSonucu);
		System.out.println(carpmaSonucu);
		System.out.println(bölmeSonucu);
	}

}
