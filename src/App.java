import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;

public class App extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawString("Hello Java!", 50, 25);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello Java Swing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);
        frame.add(new App());
        frame.setVisible(true);
    }
}
