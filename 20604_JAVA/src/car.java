
public class Car { //�θ�

	 {
		//�Ӽ�
		String color;
		String name;
		int velocity;
		
		//������
		Car(){}
		Car(String color, String name, int velocity){
			this.color = color;
			this.name = name;
			this.velocity = velocity;
		}
		
		//�޼ҵ�
		void speedUp() {
			System.out.println(name + "�ӵ� �ø���");
		}
		void speedDown() {
			System.out.println(name + "�ӵ� ������");
		}
		void print() {
			System.out.println("[CAR]");
		}
	}

}
