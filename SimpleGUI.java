import javax.swing.JFrame;
import javax.swing.JLabel;

public class SimpleGUI {
    public static void main(String[] args) {
        // Create a JFrame object
        JFrame frame = new JFrame("Simple GUI Example");

        // Set the size and close operation of the frame
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a JLabel with some text
        JLabel label = new JLabel("Hello, World!");

        // Add the label to the content pane of the frame
        frame.getContentPane().add(label);

        // Set the frame to be visible
        frame.setVisible(true);
    }
}
