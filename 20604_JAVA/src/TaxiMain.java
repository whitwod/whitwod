
public class TaxiMain {

	public static void main(String[] args) {
		Taxi t1 = new Taxi();
		t1.name = "īī���ý�";
		t1.color = "Red";
		t1.velocity = 50;
		
		t1.speedUp();
		t1.payUp();
		t1.payUp();
		
		Truck t2 = new Truck("�Ķ�" , "����" , 100);
		t2.print();

	}

}
