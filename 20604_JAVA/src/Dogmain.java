
public class Dogmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog a = new Dog("푸들", 3 , "초코색");
		Dog b = new Dog("불독", 5 , "검정색");
		
		//푸들을 짖게
		a.barking();
		//푸들배고파
		a.hungry();
		//불독졸려
		b.sleeping();
		//불독배고파
		b.hungry();
		
		String str = b.toPrint();
		System.out.println(str);
		System.out.println(a.toPrint());

	}

}
