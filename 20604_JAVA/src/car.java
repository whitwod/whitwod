
public class Car { //何葛

	 {
		//加己
		String color;
		String name;
		int velocity;
		
		//积己磊
		Car(){}
		Car(String color, String name, int velocity){
			this.color = color;
			this.name = name;
			this.velocity = velocity;
		}
		
		//皋家靛
		void speedUp() {
			System.out.println(name + "加档 棵府扁");
		}
		void speedDown() {
			System.out.println(name + "加档 郴府扁");
		}
		void print() {
			System.out.println("[CAR]");
		}
	}

}
