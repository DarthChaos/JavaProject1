package TF2TA;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TF2TA extends JFrame implements ActionListener {
  private JTextField textField;
  private JButton button;
  private JScrollPane scrollPane;
  private JTextArea textArea;
  private String text;

  public TF2TA() {
    setLayout(null);

    textField = new JTextField("");
    textField.setBounds(10, 10, 150, 30);
    add(textField);

    button = new JButton("Add");
    button.setBounds(190, 10, 60, 30);
    add(button);
    button.addActionListener(this);

    textArea = new JTextArea();
    scrollPane = new JScrollPane(textArea);
    scrollPane.setBounds(10, 60, 250, 300);
    add(scrollPane);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == button) {
      textArea.setText(textArea.getText() + "\n" + textField.getText());
      textField.setText("");
    }
  }

  public static void main(String[] args) {
    TF2TA form = new TF2TA();

    form.setBounds(0, 0, 300, 420);
    form.setVisible(true);
    form.setLocationRelativeTo(null);
    form.setResizable(false);
  }
}
