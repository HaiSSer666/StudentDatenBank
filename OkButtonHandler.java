package Main;

import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

class OkButtonHandler implements ActionListener{
	private JTextField fieldName, fieldAge;
	private JComboBox<Integer> yearsCombo;
	ArrayList<Student> list;
	
	public OkButtonHandler(JTextField fieldAge, JTextField fieldName, JComboBox<Integer> combo, ArrayList<Student> list){
		this.fieldAge=fieldAge;
		this.fieldName=fieldName;
		this.yearsCombo=combo;
		this.list=list;
	}
	
	public void actionPerformed(ActionEvent e){	
		try{
			if (fieldName.getText().length()==0 || fieldAge.getText().length()==0){
				JOptionPane.showMessageDialog(null, "Empty fields!");
			}
			else{
				list.add(new Student((int) yearsCombo.getSelectedItem(), fieldName.getText(), Integer.parseInt(fieldAge.getText())));
				fieldName.setText(null);
				fieldAge.setText(null);
				yearsCombo.setSelectedIndex(0);
				JOptionPane.showMessageDialog(null, "Student was added!");
			}	
		}
		catch (NumberFormatException e1){
			JOptionPane.showMessageDialog(null, "Wrong number!");
		}	
	}
}