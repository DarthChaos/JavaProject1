package JLabel;

import javax.swing.JFrame;

public class JLabel extends JFrame{
  private javax.swing.JLabel label;
  private javax.swing.JLabel label2;

  public JLabel() {
    setLayout(null);

    label = new javax.swing.JLabel("Graphic Interface");
    label.setBounds(10, 20, 300, 30);
    add(label);

    label2 = new javax.swing.JLabel("Version 1.0");
    label2.setBounds(10, 100, 100, 30);
    add(label2);
  }

  public static void main(String[] args) {
    JLabel form1 = new JLabel();

    form1.setBounds(0, 0, 300, 200);
    form1.setLocationRelativeTo(null);
    form1.setVisible(true);
    form1.setResizable(false);
  }
}
