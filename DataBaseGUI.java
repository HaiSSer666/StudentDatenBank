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
	private JButton ok, cancel, showAll, clearHistory, save, saveAll; 	
	private JTextField fieldName, fieldAge;
	private JLabel labelName, labelAge, labelCombo;
	private JComboBox<Integer> combo;
	public final static Integer[] yearsDataSource = {1, 2, 3, 4, 5};
	
	public DataBaseGUI (){
	super ("Student Database");
	setBounds(400, 380, 450, 100);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setResizable(false);
	
	ok = new JButton("OK");
	cancel = new JButton("Cancle");
	showAll = new JButton("Show history");
	clearHistory = new JButton("Clear history");
	save = new JButton("SAVE");
	saveAll = new JButton("Save all");
	
	fieldName = new JTextField();
	fieldAge = new JTextField();
	
	labelName = new JLabel("Enter name: ");
	labelAge = new JLabel("Enter age: ");
	labelCombo = new JLabel("Year of studing: ");
	
	combo = new JComboBox<Integer>(yearsDataSource);
	//combo.setEnabled(false);
	
	setLayout(new GridLayout(3, 2));
	
	add(labelName);
	add(fieldName);
	add(labelAge);
	add(fieldAge);
	add(labelCombo);
	add(combo);
	add(cancel);
	add(ok);
	add(clearHistory);
	add(showAll);
	add(save);
	add(saveAll);
	
	ok.addActionListener(new Ok(fieldAge, fieldName, combo, list));
	cancel.addActionListener(new CancelHandler(fieldAge, fieldName, combo));
	showAll.addActionListener(new ShowAll(list));
	clearHistory.addActionListener(new ClearHistoryHandler(list));
	save.addActionListener(new Save(list));
	saveAll.addActionListener(new SaveAll(list));
	}	
}
