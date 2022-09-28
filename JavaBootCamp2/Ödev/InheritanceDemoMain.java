package dersIkiOdev;

public class InheritanceDemoMain {


	public static void main(String[] args) {
		BaseCreditManager[] credits = {new TeacherCreditManager(), new FarmerCreditManager(),new SoldierCreditManager()};
		for(BaseCreditManager credit:credits) {
			credit.calculate();
		}
		
		
	}

	

}
