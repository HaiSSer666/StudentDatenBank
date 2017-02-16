package Main;

import java.awt.event.*;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.*;

class Save implements ActionListener{
	ArrayList<Student> list;

	public Save(ArrayList<Student> list){
		this.list=list;
	}
	
	public void actionPerformed(ActionEvent e) {
		
		if (list.size() == 0){
			JOptionPane.showMessageDialog(null, "Your history is empty!");
		}
		else{
			if (list.size()<0){
				JOptionPane.showMessageDialog(null, "List is empty!");
			}
			else{
				try(FileWriter writer = new FileWriter("D:\\ListOfStudents.txt", false))
		        {
		            writer.write(ShowAll.s);   
		            writer.flush();
		        }
		        catch(IOException ex){
		            System.out.println(ex.getMessage());
		        }
				JOptionPane.showMessageDialog(null, "List of students was saved!");
			}		
		}
	}
}