import java.awt.event.ActionListener;
import javax.swing.*;

public class RestartButton extends JButton {
    
    public RestartButton(String text, ActionListener listener) {
        super(text);
        setBounds(250, 400, 200, 50); // Set the position and size of the button
        addActionListener(listener); // Add the action listener for restart
    }
}