package main;

import java.awt.event.*;
import javax.swing.*;

class CANCEL implements ActionListener{
	private JTextField FieldName, FieldAge;
	private JComboBox<Integer> Combo;
	
	public CANCEL(JTextField fieldAge, JTextField fieldName, JComboBox<Integer> combo){
		this.FieldAge=fieldAge;
		this.FieldName=fieldName;
		this.Combo=combo;
	}
	
	public void actionPerformed(ActionEvent e) {
		FieldName.setText(null);
		FieldAge.setText(null);
		Combo.setSelectedIndex(0);
	}
}
