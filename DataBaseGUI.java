package Main;

import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

public class DataBaseGUI extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static String s = "";
	ArrayList<Student> list = new ArrayList<>();
	private JButton okButton, cancelButton, showAllButton, clearHistoryButton, saveButton, saveAllButton; 	
	private JTextField fieldName, fieldAge;
	private JLabel labelName, labelAge, labelCombo;
	private JComboBox<Integer> yearCombo;
	public final static Integer[] yearsDataSource = {1, 2, 3, 4, 5};
	
	public DataBaseGUI (){
	super ("Student Database");
	setBounds(400, 380, 450, 100);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setResizable(false);
	
	okButton = new JButton("OK");
	cancelButton = new JButton("Cancle");
	showAllButton = new JButton("Show history");
	clearHistoryButton = new JButton("Clear history");
	saveButton = new JButton("SAVE");
	saveAllButton = new JButton("Save all");
	
	fieldName = new JTextField();
	fieldAge = new JTextField();
	
	labelName = new JLabel("Enter name: ");
	labelAge = new JLabel("Enter age: ");
	labelCombo = new JLabel("Year of studing: ");
	
	yearCombo = new JComboBox<Integer>(yearsDataSource);
	//combo.setEnabled(false);
	
	setLayout(new GridLayout(3, 2));
	
	add(labelName);
	add(fieldName);
	add(labelAge);
	add(fieldAge);
	add(labelCombo);
	add(yearCombo);
	add(cancelButton);
	add(okButton);
	add(clearHistoryButton);
	add(showAllButton);
	add(saveButton);
	add(saveAllButton);
	
	okButton.addActionListener(new OkButtonHandler(fieldAge, fieldName, yearCombo, list));
	cancelButton.addActionListener(new CancelHandler(fieldAge, fieldName, yearCombo));
	showAllButton.addActionListener(new ShowAllButtonHandler(list));
	clearHistoryButton.addActionListener(new ClearHistoryHandler(list));
	saveButton.addActionListener(new SaveButtonHandler(list));
	saveAllButton.addActionListener(new SaveAllButtonHandler(list));
	}	
}
