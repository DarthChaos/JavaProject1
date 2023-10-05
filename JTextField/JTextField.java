package JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JTextField extends JFrame implements ActionListener {
  private JLabel user;
  private JLabel response;
  private JButton next;
  private javax.swing.JTextField userInput;

  public JTextField() {
    setLayout(null);

    user = new JLabel("Usuario");
    user.setBounds(10, 30, 100, 30);
    add(user);

    userInput = new javax.swing.JTextField("");
    userInput.setBounds(120, 30, 200, 30);
    add(userInput);

    next = new JButton("Accept");
    next.setBounds(10, 80, 100, 30);
    add(next);
    next.addActionListener(this);

    response = new JLabel("");
    response.setBounds(10, 120, 300, 30);
    add(response);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    // TODO Auto-generated method stub
    // throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    if (e.getSource() == next) {
      response.setText("Hola " + userInput.getText() + "!");
    }
  }

  public static void main(String[] args) {
    JTextField form = new JTextField();

    form.setBounds(0, 0, 350, 200);
    form.setVisible(true);
    form.setLocationRelativeTo(null);
    form.setResizable(false);
  }
}
