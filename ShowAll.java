package Main;

import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

class ShowAll implements ActionListener{
	public static String s = " ";
	ArrayList<Student> list;
	
	public ShowAll(ArrayList<Student> list){
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
