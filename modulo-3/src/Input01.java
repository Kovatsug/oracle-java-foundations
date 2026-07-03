import javax.swing.*;

public class Input01 {
    public static void main(String[] args) {
        //Create a JOptionPane.
        //Store the input as a String and print it.
        String input = JOptionPane.showInputDialog("Input a number");
        
        
        //Parse the input as an int.
        int intInput = Integer.parseInt(input);
        //Print its value +1
        System.out.println(intInput+1);
        
        
        //Try creating a dialog, parsing it, and initializing an int in a single line.
        //You should have only one semicolon (;) in this line.
        int number = Integer.parseInt(JOptionPane.showInputDialog("Input a numer"));

        
    }
}
