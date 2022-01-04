/**
 *  Creates a whole mess of Shakespearean insults, two adjectives followed by a noun.
 *  Precondition:
 *    Three files exist, holding NUM_WORDS words.  
 *      File Names: 
 *        shakespeare-1.txt  (adjectives)
 *        shakespeare-2.txt  (adjectives)
 *        shakespeare-3.txt  (nouns)
 */

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.util.Scanner;
import java.io.*;


public class ShakespeareWindowNext extends JFrame
    implements ActionListener
{
  private JTextField display;
  private static ShakespeareInsult insult;
  
  // Constructor opens a window with a JTextField and a "Next" button
  public ShakespeareWindowNext()
  {
    super("Insult");

    display = new JTextField("  Press \"Next\" to get the next insult...", 35);
    display.setBackground(Color.WHITE);
    display.setEditable(false);

    JButton go = new JButton("Next");
    go.addActionListener(this);

    Container c = getContentPane();
    c.setLayout(new FlowLayout());
    c.add(display);
    c.add(go);
    

  }


  
  public void actionPerformed(ActionEvent e)
  {
    // Pick and display a random insult:
    display.setText("  " + insult.getInsult() );
  }
  
  /**  Main program.
    *  Loads the word lists; asks the user how many insults to generate.
    */
  public static void main (String[] args)
  {
    insult = new ShakespeareInsult();
    
    JFrame window = new ShakespeareWindowNext();
    window.setBounds(300, 300, 500, 100);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setResizable(false);
    window.setVisible(true);
  }
}