package SwingInterfaces;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class SwingInterfaces extends JFrame {
  private JLabel label;

  public SwingInterfaces() {
    setLayout(null);
    
    label = new JLabel("Hello Label!");
    label.setBounds(10, 20, 200, 400);

    add(label);
  }

  public static void main(String[] args) {
    SwingInterfaces form = new SwingInterfaces();

    form.setBounds(0, 0, 400, 300);
    form.setVisible(true);
    form.setLocationRelativeTo(null);
  }
}
