import java.util.Scanner;

public class Day03_제어문2 {

	public static void main(String[] args) {
		//입력
		//출생년도 : 2004
		//성별 : 남 - M
		//------------
		//나이계산 : age = 2021 - 2004/
		//입력받은 성별을  if문으로 처리하여
		//최종 출력 :당신은 18세 남자
		
		int year;
		String MF;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("출생년도:");
		year = sc.nextInt();
		int age = 2021 - year +1 ;
		
		System.out.println("성별");
		MF = sc.next();
		if(MF.equals("M"))
			System.out.println("당신은 "+ age + "세 남자입니다." );
		else if(MF.equals("F"))
			System.out.println("당신은 "+ age + "세 여자입니다.");
		else
			System.out.print("잘못 입력하셨습니다.");
	
	}}
