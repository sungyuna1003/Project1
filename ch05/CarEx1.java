package ch05;

/*1. 클래스 정의 : 필드와 메소드 선언
 * 필드 : 객체의 속성(명사)
 * 메소드 : 객체의 반복적인 기능(동사)
 */
class Car1 {
	// 필드 선언 : 반드시 클래스 안에 선언된 변수
	String carName;
	int velocity;
	String CarColor;

	// 메소드 선언 : 리턴타입 선언 메소드명(){}
	void speedUp() {
		velocity++;
	}
	void speedDown() {
		velocity--;
		if (velocity<0) {
			velocity=0;
	}
}

	void stop() {
		velocity=0;
	}
	
}
public class CarEx1 {
	
	public static void main(String[] args) {
		
  //객체: 잘 만들어진 클래스를 가지고 생성한 결과물
		Car1 c1; // Car1 타입의 변수를 선언
	     //레퍼런스 변수:
		c1 = new Car1(); //new 키워드가 생성한다.
	    //생성된 객체의 필드와 메소드 사용방법:레퍼런스변수.필드/메소드
		c1.carName ="BMW 5시리즈";
		c1.CarColor ="흰색";
		c1.speedUp();
		System.out.println(c1.carName);
		System.out.println(c1.CarColor);
		System.out.println(c1.velocity);
	   //String 클래스 통해서 객체를 생성
		String s = new String("abcdef");
	   //s의 문자를 대문자로 출력
		System.out.println(s.toUpperCase());
	   //s의 문자의 길이 출력
		System.out.println(s.length());
 }
}