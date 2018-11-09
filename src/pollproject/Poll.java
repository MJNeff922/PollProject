/**
 * Implements a program with a pie chart
 * that shows interactive polling results for three candidates
 */

package pollproject;

import java.awt.Color;
import java.awt.Container;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import java.util.Scanner;

public class Poll extends JFrame
{
  public Poll(String nm1, String nm2, String nm3, String nm4)
  {
    super("Vote for " + nm1 + ", " + nm2 + ", " + nm3 + ", or" + nm4 + ".");

    Container c = getContentPane();
    c.setBackground(Color.WHITE);
    PollDisplayPanel chart = new PollDisplayPanel(nm1, nm2, nm3, nm4);
    PollControlPanel controls = new PollControlPanel(chart);
    c.add(chart, BorderLayout.CENTER);
    c.add(controls, BorderLayout.SOUTH);
  }

  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Input four names: ");
    String nm1 = sc.nextLine();
    String nm2 = sc.nextLine();
    String nm3 = sc.nextLine();
    String nm4 = sc.nextLine();
    Poll w = new Poll(nm1, nm2, nm3, nm4);
    w.setBounds(300, 300, 400, 400);
    w.setDefaultCloseOperation(EXIT_ON_CLOSE);
    w.setAlwaysOnTop(true);
    w.setVisible(true);
  }
}

