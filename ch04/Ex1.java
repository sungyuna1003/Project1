package ch04;

/*제어문: 선택문(조건문) + 반복문
 * 조건문: if=else, switch
 * 반복문 : while, for
 * 제어문 사용되는 예약어 : continue, break 
 * continue, break : while 사용 가능, break : switch 사용 가능
 */
public class Ex1 {
	public static void main(String[] args) {
		int a = 10;
		if (a > 0) {
			System.out.println("a는 양수입니다");
		} // if
		if (a > 0) // if 절에 실행문이 1줄이면 중괄호 생략 가능.
			System.out.println("a는 양수입니다");
		if (a > 20)
			System.out.println("중괄호 테스트1");
		    System.out.println("중괄호 테스트2");
		    
	}
}
