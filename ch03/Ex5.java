package ch03;

public class Ex5 {

	public static void main(String[] args) {
		//영어, 숫자, 특수문자 : 1 byte, 한글 : 2 byte
		//A, 가 
		//80 byte 
       //System.out.println(Integer.toBinaryString(a));
      //System.out.println(Integer.toBinaryString(b));
		 int a = 5; //00000101 <- 1 byte (8bit)
	     int b = 10; //0001010
	     int c = a&b;
	     int d = a|b;
	     System.out.println("c :"+c);
	     System.out.println("d :"+d);
	     int e = a^b; //^ (XOR) 두 비트가 다른 값이면 1, 같은값 0
	     int f = ~a; //~(반전) ; 비트값을 0 >1 ,1>0 변경
	     System.out.println("e:"+e);
	     System.out.println("f:"+f);
	}
}
