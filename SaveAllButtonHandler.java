package Main;

import java.awt.event.*;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.*;

class SaveAllButtonHandler implements ActionListener {
	ArrayList<Student> list;

	public SaveAllButtonHandler(ArrayList<Student> list) {
		this.list = list;
	}

	public void actionPerformed(ActionEvent e) {
		if (list.size() == 0) {
			JOptionPane.showMessageDialog(null, "Your history is empty!");
			return;
		}
		try (FileWriter writer = new FileWriter("D:\\FullListOfStudents.txt", true)) {
			writer.write(ShowAllButtonHandler.s);
			writer.flush();
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}
		JOptionPane.showMessageDialog(null, "List of students was saved!");
	}
}