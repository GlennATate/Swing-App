import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.ListIterator;

public class Main
{
  public static void main (String args[])
  {
    System.out.println("Glenn Tate - Swing App");
    System.out.println("P.S. Click the fullscreen button on the app if nothing appears :)");


    //Array List
    ArrayList<String> sports = new ArrayList<>();
    sports.add("Basketball - Michael Jordan/Bulls");
    sports.add("Basketball - Anthony Davis/Lakers");
    sports.add("Basketball - Lebron James/Lakers");
    sports.add("Basketball - Kobe Bryant/Lakers");
    sports.add("Basketball - Zion Williamson/Pelicans");
    sports.add("Basketball - Lamelo Ball/Hornets");

    JFrame frame1 = new JFrame ("Tate Swing App");
    frame1.setDefaultCloseOperation
    (JFrame.EXIT_ON_CLOSE);
    //MUST HAVE THIS LINE
    frame1.setSize(500,500);
    frame1.setVisible(true);

    //Panel to hold the buttons
    JPanel panel1 = new JPanel(new GridLayout(2,2,20,20));

    //Label 1
    JLabel label1 = new JLabel("Welcome!");
    JTextField textfield1 = new JTextField("change the text", 16);

    //Label 2
    JLabel label2 = new JLabel("Hello There!");
    JTextField textfield2 = new JTextField("change the text", 16);

    //Button 1
    JButton button1 = new JButton("Submit Text Field 1");

    button1.addActionListener(new ActionListener()
    {
      public void actionPerformed
      (ActionEvent e)
      {
        String s = e.getActionCommand(); 
        if (s.equals("Submit Text Field 1")) 
        { 
          label1.setText(textfield1.getText()); 
          textfield1.setText("  ");
        }
      }    
    });

    //Button 2
    JButton button2 = new JButton ("List");

    button2.addActionListener(new ActionListener()
    {
      public void actionPerformed
      (ActionEvent e)
      {
        System.out.println("\nThis is a list of my favorite basketball players");
        for(int i = 0; i < sports.size(); i++) //to print out the array list
        {
          System.out.println(sports.get(i));
        }
      }
    });

    //Button 3
    JButton button3 = new JButton("Submit Text Field 2");

    button3.addActionListener(new ActionListener()
    {
      public void actionPerformed
      (ActionEvent e)
      {
        String s = e.getActionCommand(); 
        if (s.equals("Submit Text Field 2")) 
        { 
          label2.setText(textfield2.getText()); 
          textfield2.setText("  ");
        }
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
    JPanel panel2 = new JPanel (new BorderLayout(50,50));

    //Image 1 - the space Image
    ImageIcon spaceImg = new ImageIcon ("space.jpg", "Just Space");
    JLabel spaceLabelPic = new JLabel (spaceImg);
    panel2.add(spaceLabelPic);

    frame1.getContentPane().add(BorderLayout.NORTH, panel1);
    frame1.getContentPane().add(BorderLayout.CENTER, panel2);

  }//end main method
}//end class Main