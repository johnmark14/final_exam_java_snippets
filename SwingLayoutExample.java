import javax.swing.*;
import java.awt.*;

public class SwingLayoutExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing Layout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a panel and set the layout manager
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        // Create buttons and add them to the panel
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");

        panel.add(button1);
        panel.add(button2);
        panel.add(button3);

        // Add the panel to the frame
        frame.getContentPane().add(panel);

        // Set the size and make the frame visible
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
