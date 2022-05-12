import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.BorderFactory;
import java.awt.Color;
import javax.swing.plaf.basic.BasicPanelUI;

public class PanelReview extends JFrame {

  public PanelReview() {
    JPanel panel = new JPanel();
    panel.setBorder(BorderFactory.createLineBorder(Color.red));
    
    JButton button = new JButton();

    // adding stuff to the JPanel
    panel.add(button);
  
    // adding the JPanel to JFrame
    add(panel);

    // default stuff to make window visible and close on exit
    setSize(400, 400);
    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  public static void main(String[] args) {

    PanelReview pr = new PanelReview();

  }
}
