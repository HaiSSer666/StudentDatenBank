package Main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;

class ClearHistoryHandler implements ActionListener{
	ArrayList<Student> list;

	public ClearHistoryHandler(ArrayList<Student> list){
		this.list=list;
	}
	
	public void actionPerformed(ActionEvent e) {	
		int k = JOptionPane.showConfirmDialog(null, "Are U sure???");
		switch (k) 
		{ 
		case 0: 
			list.removeAll(list);
			JOptionPane.showMessageDialog(null, "History deleted!");
			break; 			
		case 1: 
			JOptionPane.showMessageDialog(null, "History not deleted!");
			break; 				
		case 2: 
			break; 	
		default: 
		}
	}
}