package encapsulation;

import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

/*
 * @ Date : 2015.07.14
 * @ Author : me
 * @ Story : 카우푸지수 프로그램을 객체화 하는 예제
 * */

public class KaupBean2 {
	/*
	 public은 은닉화가 되어 있지 않는 상태임
	 은닉화를 하려면 private을 넣어야 함
	 그런데, 데이터 값은 private을 넣어야(은닉화)하고
	 기능-메소드는 public을 넣어야함
	 * */
	
	/*
	 자바의 계층 구조
	 프로젝트(어플리케이션) > 패키지 > 클래스 > 멤버
	 멤버는 두 가지로 구성
	 -> private으로 선언된 (감춰진) 속성 : 멤버필드
	 -> public으로 선언된 (오픈된) 속성 : 멤버메소드
	 
	 
	 * */
	private String name, msg;
	private double height, weight;
	private int idx;
	
	public void getIndex() { // 메소드(동사)
		/*
		 * 문제
		 카우푸 지수는 키와 몸무게를 입력하면
		 저체중...정상...비만 이런식의 결과값을
		 알려주는 프로그램.
		 콘솔에 출력되는 문장은
		 "[홍길동]님의 키는 180cm, 몸무게 : 70kg, 카우푸지수 : 정상 "이고
		 카우푸 공식은
		 (몸무게 / (키*키))*10000 결과값이
		 30 초과 비만 
		 24 초과 과체중
		 20 초과 정상
		 15 초과 저체중
		 13 초과 마름
		 10 초과 영양실조
		 *
		 * */
		//선언부
		String name = "", msg ="";
		double height = 0.0d, weight = 0.0d;
		int idx = 0; //카우푸 인덱스
		
		Scanner scanner = new Scanner(System.in);
	
		//연산부
		System.out.println("이름을 입력하세요 : ");
		name = scanner.next();
		System.out.println("키 : ");
		height = scanner.nextDouble();
		System.out.println("몸무게 : ");
		weight = scanner.nextDouble();
		
		idx = (int) ((weight / (height*height))*10000);
		if (idx>30) {
			msg = "비만";
			
		}
		else if (idx>24) {
			msg = "과체중";
		}
		else if (idx>20) {
			msg = "정상";
		}
		else if (idx>15) {
			msg = "저체중";
		}
		else if (idx>13) {
			msg = "마름";
		}
		else {
			msg = "영양실조";
		}
		
		//출력부
		System.out.println("["+name +"] 키 : "+height+"cm,\t" 
				+"몸무게 : "+weight+ "kg,\t"
				+"카우푸지수 : "+msg );		
	}
	

}
