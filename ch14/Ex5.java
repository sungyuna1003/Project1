package ch14;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Ex5 {

	public static void main(String[] args) {
		try {
			FileReader fr = myRead("aaa.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	// throw: 이 메소드를 호출한 곳에 예외 객체를 던지겠다.
	public static FileReader myRead(String name) throws FileNotFoundException {
		FileReader fr = new FileReader(name);
		return fr;
	}
}
