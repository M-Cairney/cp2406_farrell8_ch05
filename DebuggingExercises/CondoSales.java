import javax.swing.*;

/**
 * Created by jc260799 on 21/08/17.
 */
public class CondoSales {
    public static void main(String[] args) {

        String usersChoiceString;
        int usersChoice;
        usersChoiceString = JOptionPane.showInputDialog(null,
                "What View\n1 - Park View\n2 - Gold Course" +
                        "\n3 - Lake View");
        usersChoice = Integer.parseInt(usersChoiceString);
        if (usersChoice == 1)
            JOptionPane.showMessageDialog(null,"The Park View Condos are $150,000");
        else
            if (usersChoice == 2)
                JOptionPane.showMessageDialog(null,"The Golf Course View Condos are $170,000");
            else
                if(usersChoice == 3)
                    JOptionPane.showMessageDialog(null,"The Lake View Condos are $210,000");
                else
                    JOptionPane.showMessageDialog(null,"Invalid Selection");
    }
}
