
public class Taxi extends Car {//자식
	
	int pay = 3000;
	
	void payUp() {
		pay += 100;
		System.out.println("현재요금: + pay");
	}
	
	void print() {
		System.out.println("[Taxi]");
	}
	
	
	
	
	

}
