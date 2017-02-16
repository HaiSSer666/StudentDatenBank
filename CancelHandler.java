package Main;

import java.awt.event.*;
import javax.swing.*;

class CancelHandler implements ActionListener{
	private JTextField fieldName, fieldAge;
	private JComboBox<Integer> combo;
	
	public CancelHandler(JTextField fieldAge, JTextField fieldName, JComboBox<Integer> combo){
		this.fieldAge=fieldAge;
		this.fieldName=fieldName;
		this.combo=combo;
	}
	
	public void actionPerformed(ActionEvent e) {
		this.fieldName.setText(null);
		this.fieldAge.setText(null);
		this.combo.setSelectedIndex(0);
	}
}
