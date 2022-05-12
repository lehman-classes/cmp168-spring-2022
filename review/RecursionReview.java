import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class RecursionReview extends JFrame {
  
  public RecursionReview() {
    setSize(400, 400);
    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }


  // recursive method
  public void countDown(int n) {
    if ( n == 0 ) /* base case */ {
      //System.out.println("Hooray!");
      JOptionPane.showMessageDialog(this, "Hooray!");
    } else {
      //System.out.println(n);
      /* tail recursion - countDown is the last statement */
      JOptionPane.showMessageDialog(this, n);
      countDown(n-1); // call itself
      /* head recursion - countDown is NOT the last statement */
      //JOptionPane.showMessageDialog(this, n);
    }
  }

  public static void main(String[] args) {
    RecursionReview rr = new RecursionReview();
    rr.countDown(3);
  }
}
