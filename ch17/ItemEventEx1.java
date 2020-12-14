package ch17;
//체크박스를 누르기
import java.awt.Checkbox;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ItemEventEx1 extends MFrame 
implements ItemListener{
	
	Label label;
	Checkbox cb1, cb2, cb3;
	
	public ItemEventEx1() {
		super(300, 200);
		setLayout(new FlowLayout());
		add(cb1=new Checkbox("수박"));
		add(cb2=new Checkbox("바나나"));
		add(cb3=new Checkbox("멜론"));
		add(label = new Label("현재 상태 :            "));
		cb1.addItemListener(this);
		cb2.addItemListener(this);
		cb3.addItemListener(this);
		validate();
	}
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		//객체를 발생시킨 이벤트 소스(컴포넌트)를 리턴
		Checkbox cb = (Checkbox)e.getSource();
		String str = cb.getLabel() + " : " + cb.getState(); //겟라벨은 수박(체크되어있을시)
		label.setText(str);
		setTitle(str);
	}

	public static void main(String[] args) {
		new ItemEventEx1();
	}
}









