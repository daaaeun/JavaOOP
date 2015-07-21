package abstraction;

/*
 @ Date : 2015.07.21
 @ Author : me
 @ Story : 추상화 + 다양성의 결합형태 보는 예제
 * */

public interface FruitsInterface {
	/*
	 객체 지향 언어에서 다양성의 핵심 원리
	 - 인터페이스를 구형하는 클래스들은 그 인터페이스 타입에 포함이 된다.
	 - 아래와 같은 상속의 예에서
	 class Child extends parent가 있다고 하면
	 Child가 Parent의 타입에 포합(상속)됩니다.
	 이처럼 인터페이스도 그를 구현(implements)한 인터페이스 타입에 포함이 된다.
	 * */

	public void display(String str);
	
}