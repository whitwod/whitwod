
public class Day04_��Ʈ�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "robot";
		String b = "robot";
		
		if(a==b)
			System.out.println("�ּҰ� ����.");
		else
			System.out.println("�ּҰ� �ٸ���.");
		
		if(a.equals(b))
			System.out.println("���� ����.");
		else
			System.out.println("���� �ٸ���.");
		
		System.out.println("===============");
		String c = new String("robot");
		if(a==c)
			System.out.println("�ּҰ� ����.");
		else
			System.out.println("�ּҰ� �ٸ���.");
		c = "test";
		System.out.println(c);
		if(a.equals(c))
			System.out.println("�ּҰ� ����.");
		else
			System.out.println("�ּҰ� �ٸ���.");
			

	}

}
