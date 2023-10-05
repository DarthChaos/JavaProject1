package JScrollPane;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class JScrollPane extends JFrame {
  private JTextField textField;
  private javax.swing.JScrollPane scrollPanel;
  private javax.swing.JTextArea textArea;

  public JScrollPane() {
    setLayout(null);

    textField = new JTextField("");
    textField.setBounds(10, 20, 100, 30);
    add(textField);

    textArea = new javax.swing.JTextArea("");
    scrollPanel = new javax.swing.JScrollPane(textArea);
    scrollPanel.setBounds(10, 70, 400, 300);
    add(scrollPanel);
  }

  public static void main(String[] args) {
    JScrollPane form = new JScrollPane();

    form.setBounds(0, 0, 450, 450);
    form.setVisible(true);
    form.setLocationRelativeTo(null);
    form.setResizable(false);
  }
}
