package JavaBasics;
// Phạm Công Hào_20215045

import javax.swing.JOptionPane;

public class ChoosingOption {
    public static void main(String[] args) {
    	
    	// tạo biến lưu 2 giá trị Yes và No
        Object[] options = {"Yes", "No"};
        
        int option = JOptionPane.showOptionDialog(
            null,
            "Do you want to change to the first class ticket?",
            "Choose an option",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            options,
            options[0]
        );

        if (option == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "You've chosen 'Yes'");
        } else if (option == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "You've chosen 'No'");
        }
        System.exit(0);
    }
}
