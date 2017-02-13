package main;

import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

class SHOWALL implements ActionListener{
	public static String s = " ";
	ArrayList<Student> list;
	
	public SHOWALL(ArrayList<Student> list){
		this.list=list;
	}
	
	public void actionPerformed(ActionEvent e) {
		if (list.size() == 0){
			JOptionPane.showMessageDialog(null, "Your history is empty!");
		}
		else{
			for(Student t : list){
				s += "Student " + Integer.toString(list.indexOf(t)+1) + ": " + t +"\n";
				JOptionPane.showMessageDialog(null, s + "\n" + "Total number of students: " + list.size());
				}	
			}	
		}
	}
