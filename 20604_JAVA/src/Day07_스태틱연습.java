
public class Day07_����ƽ���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student a = new Student();
		a.name = "ȫ�浿";  a.age = 10;
		a.print();
		
		Student b = new Student();
		b.name = "����ȣ";   b.age = 12;
		b.print();
		
		Student c = new Student("���¿� , 18", 0);
		c.print();
		
		//a.school = "�����";
		a.print();
		b.print();
		b.print(10);
		b.print("����ȣ");
		
		//�����̺� ��� ���� ����
		c.setPhone("010-5608-6265");
		System.out.println(c.getPhone());
	}

}
