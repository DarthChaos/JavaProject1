package SwingInterfaces;

import javax.swing.JFrame;

public class Exercise extends JFrame{
  public Exercise() {
    setLayout(null);


  }

  public static void main(String[] args) {
    Exercise form1 = new Exercise();

    form1.setBounds(350, 0, 400, 550);
    form1.setVisible(true);
    form1.setLocationRelativeTo(null);
    form1.setResizable(false);
  }
}
