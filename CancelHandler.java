package Main;

import java.awt.event.*;
import javax.swing.*;

class CancelHandler implements ActionListener{
	private JTextField fieldName, fieldAge;
	private JComboBox<Integer> yearsCombo;
	
	public CancelHandler(JTextField fieldAge, JTextField fieldName, JComboBox<Integer> yearsCombo){
		this.fieldAge=fieldAge;
		this.fieldName=fieldName;
		this.yearsCombo=yearsCombo;
	}
	
	public void actionPerformed(ActionEvent e) {
		this.fieldName.setText(null);
		this.fieldAge.setText(null);
		this.yearsCombo.setSelectedIndex(0);
	}
}
