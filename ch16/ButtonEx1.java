package ch16;

import java.awt.Button;

public class ButtonEx1 extends MFrame{ 
	
	Button btn1, btn2, btn3, btn4;
	
	public ButtonEx1() {
		super(250,250);
		setTitle("Button Example");
		/*btn1 = new Button("추가");
		add(btn1);*/
		add(btn1 = new Button("추가"));
		add(btn2 = new Button("삭제"));
		add(btn3 = new Button("전체삭제"));
		add(btn4 = new Button("종료"));
		
		setResizable(false);//크기는 고정
		validate();
	}

	public static void main(String[] args) {
		new ButtonEx1();
	}
}




