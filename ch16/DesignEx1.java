package ch16;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.Label;
import java.awt.Panel;

public class DesignEx1 extends MFrame {
	
	Label label;
	Checkbox cb1, cb2, cb3;
	CheckboxGroup cbg;
	Button btn1, btn2;
	Panel p1, p2;
	
	public DesignEx1() {
		
		super(250,150);
		setTitle("������ ����1");
		setLayout(new BorderLayout());
		label = new Label("�����߿� ����", Label.CENTER);
		label.setBackground(Color.GREEN);
		
		p1 = new Panel();
		cbg = new CheckboxGroup();
		p1.add(cb1 = new Checkbox("���",cbg, false));
		p1.add(cb2 = new Checkbox("����",cbg, true));
		p1.add(cb3 = new Checkbox("�޵�",cbg, false));
		
		p2 = new Panel();
		p2.add(btn1 = new Button("Start")); 
		p2.add(btn2 = new Button("End")); 
		
		add(BorderLayout.SOUTH,p2); // ������
		add(label,BorderLayout.NORTH);
		add(p1);
		
		validate();
	}	

	public static void main(String[] args) {
		new DesignEx1();
	}
}



