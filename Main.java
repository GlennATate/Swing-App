import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Main
{
  public static void main (String args[])
  {
    JFrame frame1 = new JFrame ("Tate Swing App");
    frame1.setDefaultCloseOperation
    (JFrame.EXIT_ON_CLOSE);
    //MUST HAVE THIS LINE
    frame1.setSize(500,500);
    frame1.setVisible(true);

    //Panel to hold the buttons
    JPanel panel1 = new JPanel(new GridLayout(2,2,20,20));

    //Label 1
    JLabel label1 = new JLabel("Press A Button");
    JTextField textfield1 = new JTextField(10);

    //Label 2
    JLabel label2 = new JLabel("Press A Button");
    JTextField textfield2 = new JTextField(50);

    //Button 1
    JButton button1 = new JButton("Change Label");

    button1.addActionListener(new ActionListener()
    {
        public void actionPerformed
        (ActionEvent e)
        {
          String[] phrases = {"Space is HUGE!", "That's a pretty star", "That's a big space ship", "Everything is so different here"};
          String newText = phrases[(int)(Math.random() * phrases.length)];
          label1.setText(newText);
        }
    });

    //Button 2
    JButton button2 = new JButton ("Don't Touch Me");
    button2.addActionListener(new ActionListener()
    {
      public void actionPerformed
      (ActionEvent e)
      {
        System.out.println("No No, Don't Touch Me There This Is My No No Sqaure. No No, Don't Touch Me There This Is My No No Sqaure.");
      }
    });

    //Button 3
    JButton button3 = new JButton("Touch Me");

    button3.addActionListener(new ActionListener()
    {
        public void actionPerformed
        (ActionEvent e)
        {
          String[] phrases = {"This pretty fun!", "Nice One", "You Touched Me!", "You can follow instructions :)"};
          String newText = phrases[(int)(Math.random() * phrases.length)];
          label2.setText(newText);
        }
    });

    panel1.add(button1);
    panel1.add(button2);
    panel1.add(button3);
    panel1.add(label1);
    panel1.add(label2);
    panel1.add(textfield1);
    panel1.add(textfield2);

    //Panel 2
    JPanel panel2 = new JPanel (new BorderLayout(10,10));

    //Image 1 - the space Image
    ImageIcon spaceImg = new ImageIcon ("space.jpg", "Just Space");
    JLabel spaceLabelPic = new JLabel (spaceImg);
    panel2.add(spaceLabelPic);

    frame1.getContentPane().add(BorderLayout.NORTH, panel1);
    frame1.getContentPane().add(BorderLayout.CENTER, panel2);

  }//end main method
}//end class Main