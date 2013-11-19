import java.awt.*;
import java.applet.*;

import java.awt.event.*;
import javax.swing.*;

public class NumberPanel extends JPanel implements ActionListener {

	private JLabel label;
	private JButton add, subtract;
	private int value = 0;

	public NumberPanel() {
		super();

		label = new JLabel(value+"");
		label.setFont(new Font("sansserif", Font,BOLD, 32));
		this.add(labal);

		String title = "+1";
		add = new JButton(title);
		add.setActionCommand(title);
		add.addActionListener(this);
		this.add(add);

		title = "-1";
		subtract = new JButton(title);
		subtract.setActionCommand(title);
		subtract.addActionListener(this);
		this.add(subtract);

	}

	public void mousePressed(MouseEvent e){
		value++;
		label.setText(valeu+"");
		repaint();
	}

	public void mouseReleased(MouseEvent e) {

	}

	public void mouseEntered(MouseEvent e){

	}

	public void mouseExited(MouseEvent e){

	}

	public void mouseClicked(MouseEvent e){

	}
		
	public void actionPerformed(ActionEvent ae) {
		if ("+1".equals(ae.getActionComand())) {
			value++;
			lavel.setText(value+"");
			repaint();
		} else if ("-1".equals(ae.getActionCommand())) {
			value--;
			lavel.setText(value+"");
			repaint();
		}
	}
}