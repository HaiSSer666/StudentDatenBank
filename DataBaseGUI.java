/*
JCheckBox - ������-������; 
JComboBox - ���������� ������;
JLabel - �����, �������;
JList - ������;
JPasswordField - ��������� ���� ��� �������� �����;
JProgressBar - ��������� ��� ����������� ����� � ��������� ���������;
JRadioButton - ������������, �����-������, ������ ������������ � ����������� ButtonGroup;
JSlider - ��������� ����������� ������� �������� �� ��������� ���������;
JSpinner - ��������� ����������� ������� �������� �� ��������� ������������������;
JTable - �������;
JTextField - ������������ ��������� ����;
JTextArea - ������������� ��������� ����;
JTree - ������.
 */

package main;

import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

public class DataBaseGUI extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = -5292619009088841443L;
	public static String s = "";
	ArrayList<Student> list = new ArrayList<>();
	private JButton OK, CANCEL, SHOWALL, CLEARHISTORY, SAVE, SAVEALL; 	
	private JTextField FieldName, FieldAge;
	private JLabel LabelName, LabelAge, LabelCombo;
	private JComboBox<Integer> Combo;
	
	public DataBaseGUI (){
	super ("Student Database");
	setBounds(400, 380, 450, 100);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setResizable(false);
	
	OK = new JButton("OK");
	CANCEL = new JButton("Cancle");
	SHOWALL = new JButton("Show history");
	CLEARHISTORY = new JButton("Clear history");
	SAVE = new JButton("SAVE");
	SAVEALL = new JButton("Save all");
	
	FieldName = new JTextField();
	FieldAge = new JTextField();
	
	LabelName = new JLabel("Enter name: ");
	LabelAge = new JLabel("Enter age: ");
	LabelCombo = new JLabel("Year of studing: ");
	
	Integer[] year = {1, 2, 3, 4, 5};
	Combo = new JComboBox<Integer>(year);
	//Combo.setEnabled(false);
	
	setLayout(new GridLayout(3, 2));
	
	add(LabelName);
	add(FieldName);
	add(LabelAge);
	add(FieldAge);
	add(LabelCombo);
	add(Combo);
	add(CANCEL);
	add(OK);
	add(CLEARHISTORY);
	add(SHOWALL);
	add(SAVE);
	add(SAVEALL);
	
	OK.addActionListener(new OK(FieldAge, FieldName, Combo, list));
	CANCEL.addActionListener(new CANCEL(FieldAge, FieldName, Combo));
	SHOWALL.addActionListener(new SHOWALL(list));
	CLEARHISTORY.addActionListener(new CLEARHISTORY(list));
	SAVE.addActionListener(new SAVE(list));
	SAVEALL.addActionListener(new SAVEALL(list));
	}	
}


