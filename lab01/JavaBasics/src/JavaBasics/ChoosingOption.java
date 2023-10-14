package JavaBasics;

import javax.swing.JOptionPane;

public class ChoosingOption {
    public static void main(String[] args) {
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
