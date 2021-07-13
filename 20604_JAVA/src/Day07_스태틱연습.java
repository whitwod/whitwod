
public class Day07_스태틱연습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student a = new Student();
		a.name = "홍길동";  a.age = 10;
		a.print();
		
		Student b = new Student();
		b.name = "박찬호";   b.age = 12;
		b.print();
		
		Student c = new Student("권태원 , 18", 0);
		c.print();
		
		//a.school = "서울고";
		a.print();
		b.print();
		b.print(10);
		b.print("박찬호");
		
		//프라이빗 멤버 변수 접근
		c.setPhone("010-5608-6265");
		System.out.println(c.getPhone());
	}

}
