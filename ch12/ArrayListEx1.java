package ch12;

import java.util.ArrayList;

public class ArrayListEx1 {
	public static void main(String[] args) {
		//객체를 저장하는 클래스:배열에 약점을 보완해서 나온 클래스
        //배열: 동일한 Date Type 이고 크기가 고정
		//ArrayList / Vector 는 타입 및 크기가 유동적
         ArrayList list = new ArrayList();
         list.add("Java");
         list.add("Jsp");
         list.add("Database");
         System.out.println(list.size());
         for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
         list.remove(0);
         System.out.println("==============");
         for (int i = 0; i < list.size(); i++) {
        System.out.println(list.get(i));			
		}
	}
}
