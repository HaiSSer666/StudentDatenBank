package main;

import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

class OK implements ActionListener{
	private JTextField FieldName, FieldAge;
	private JComboBox<Integer> Combo;
	ArrayList<Student> list;
	
	public OK(JTextField fieldAge, JTextField fieldName, JComboBox<Integer> combo, ArrayList<Student> list){
		this.FieldAge=fieldAge;
		this.FieldName=fieldName;
		this.Combo=combo;
		this.list=list;
	}
	
	public void actionPerformed(ActionEvent e){	
		try{
			if (FieldName.getText().length()==0 || FieldAge.getText().length()==0){
				JOptionPane.showMessageDialog(null, "Empty fields!");
			}
			else{
				list.add(new Student((int) Combo.getSelectedItem(), FieldName.getText(), Integer.parseInt(FieldAge.getText())));
				FieldName.setText(null);
				FieldAge.setText(null);
				Combo.setSelectedIndex(0);
				JOptionPane.showMessageDialog(null, "Student was added!");
			}	
		}
		catch (NumberFormatException e1){
			JOptionPane.showMessageDialog(null, "Wrong number!");
		}	
	}
}