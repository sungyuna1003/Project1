package ch08;

class A6 {}
class B6 extends A6 {}

public class Ex6 {
	public static void main(String[] args) {
		B6 b = new B6();
		if (b instanceof A6) {
			System.out.println("b객체는 A6타입입니다.");
		}
		if (b instanceof Object) {
			System.out.println("b객체는 Object타입입니다.");
		}
		A6 a = new A6();
		if (a instanceof B6) {
			System.out.println("a객체는 B6타입입니다.");
		}
	}

}
