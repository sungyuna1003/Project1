package ch08;

import java.awt.Dialog;
import java.awt.Frame;
import java.util.Vector;

class Person { // 문법적으로 public 붙일 수 없음
	String name;

	public Person(String name) {
		this.name = name;
	}
}

class Student extends Person {
	String grade;

	public Student(String name) {
		super(name);
	}
}

//Ex.5.java. :동일한 자바파일에 저장하는 클래스는  .java 파일로 선언된 클래스만 public 가능
//"class Person"과"public class Ex5"완전 다른 개념(java에 같이 저장만 되어있음)
public class Ex5 {
	public static void main(String[] args) {
		Frame f = new Frame();
		Dialog d = new Dialog(f);
		////////////////////////////////////////
		Person p;
		Student s = new Student("홍길동");
		p = s; // 업캐스팅(UPCasting)
		////////////////////////////////////////
		Vector v = new Vector(); //객체를 저장하는 주머니 역활 클래스
		String str = new String("하하");
		v.add(str); //add의 매개변수 타입은 Object이다.
		String str1=(String)v.get(0);
		////////////////////////////////////////
		Student s1;
		Person p1 = new Person("강호동");
//		컴파일 에러나지 않지만 실행 시점에 캐스팅 예외가 발생.
		s1 = (Student) p1;// 다운캐스팅
		s1.grade = "A";
		System.out.println(s1.grade);
	}
}
