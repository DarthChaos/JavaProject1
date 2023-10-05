package ButtonsLabels;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class ButtonsLabels extends JFrame implements ActionListener {
  private JLabel initialLabel;
  private JButton button1;
  private JButton button2;
  private JButton button3;

  public ButtonsLabels() {
    setLayout(null);

    initialLabel = new JLabel("Waiting...");
    initialLabel.setBounds(10, 20, 300, 30);
    add(initialLabel);

    button1 = new JButton("1");
    button1.setBounds(10, 100, 100, 40);
    add(button1);
    button1.addActionListener(this);

    button2 = new JButton("2");
    button2.setBounds(120, 100, 100, 40);
    add(button2);
    button2.addActionListener(this);

    button3 = new JButton("3");
    button3.setBounds(230, 100, 100, 40);
    add(button3);
    button3.addActionListener(this);
  }

  public static void main(String[] args) {
    ButtonsLabels form = new ButtonsLabels();

    form.setBounds(0, 0, 500, 200);
    form.setLocationRelativeTo(null);
    form.setVisible(true);
    form.setResizable(false);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    // TODO Auto-generated method stub
    // throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    if (e.getSource() == button1) {
      initialLabel.setText("Clicked Button 1.");
    } else if (e.getSource() == button2) {
      initialLabel.setText("Clicked Button 2.");
    } else {
      initialLabel.setText("Clicked Button 3.");
    }
  }
  
}
