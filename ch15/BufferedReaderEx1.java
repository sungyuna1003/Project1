package ch15;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class BufferedReaderEx1 {
	public static void main(String[] args) {
        InputStream is = System.in;
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        //////////////////////////////////
        BufferedReader br1 =
        		new BufferedReader(
        				new InputStreamReader(System.in));
        String s ="";
        while(true) {
        	try {
				s= br1.readLine(); //한줄 단위로 나타낼때
				System.out.println("출력 : "+s);
			} catch (Exception e) {
				e.printStackTrace();
			}
        }
	}

}
