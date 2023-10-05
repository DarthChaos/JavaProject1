package JTextArea;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class JTextArea extends JFrame {
  private JTextField textField;
  private javax.swing.JTextArea textArea;

  public JTextArea() {
    setLayout(null);

    textField = new JTextField("");
    textField.setBounds(10, 20, 100, 30);
    add(textField);

    textArea = new javax.swing.JTextArea("");
    textArea.setBounds(10, 70, 400, 300);
    add(textArea);
  }

  public static void main(String[] args) {
    JTextArea form = new JTextArea();

    form.setBounds(0, 0, 450, 450);
    form.setVisible(true);
    form.setLocationRelativeTo(null);
    form.setResizable(false);
  }
}
