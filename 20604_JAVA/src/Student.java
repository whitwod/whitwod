
public class Student {
	
	//������
	Student(){
		count++;
		printCount();
	}
	Student(String name , int age  ){
		this();
		this.name = name;
		this.age = age;
		
		
	}
	
	//�������
	final static String school = "�κ���";
	String name;
	int age;
	private String phone ;
	static int count=0; //�л���
	
	//�޼ҵ�
	void print() { //�����ε�
		System.out.println(name + ":" + age);
		this.printCount();
	}
	
	void print(int age) {//�����ε�
		System.out.println("����:" + age);
		
	}
	
	void print(String name) {
		System.out.println("�̸�:" + name );
	}
	
	void printCount() {
		System.out.println("���� ��ϵ� �л���" + count + "���Դϴ�.");
	}
	
	//�����̺� ��� ���� ���� ���� �޼ҵ�
//et : �о��
//et : ���� , �����ϱ�
	
	void setPhone( String phone ) {
		this.phone= phone;
	}
	
	String getPhone() {
		return this.phone;
	}
	
	
	

}

