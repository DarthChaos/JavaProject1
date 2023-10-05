package JButton;

import java.awt.event.ActionEvent;

import javax.swing.Action;
import javax.swing.JFrame;

public class JButton extends JFrame implements Action {
  javax.swing.JButton closeButton;
  
  public JButton() {
    setLayout(null);

    closeButton = new javax.swing.JButton("Close");
    closeButton.setBounds(300, 250, 100, 30);
    add(closeButton);
    closeButton.addActionListener(this);
  }

  public static void main(String[] args) {
    JButton form = new JButton();

    form.setBounds(0, 0, 500, 400);
    form.setLocationRelativeTo(null);
    form.setVisible(true);
    form.setResizable(false);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    // TODO Auto-generated method stub
    // throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    if (e.getSource() == closeButton) {
      System.exit(0);
    }
  }

  @Override
  public Object getValue(String key) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getValue'");
  }

  @Override
  public void putValue(String key, Object value) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'putValue'");
  }
}
