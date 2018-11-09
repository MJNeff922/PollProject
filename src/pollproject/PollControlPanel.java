/**
 * The control panel for the Poll program
 */

package pollproject;

import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.JButton;

public class PollControlPanel extends JPanel
                          implements ActionListener
{
  private JButton button1, button2, button3, button4;
  private PollDisplayPanel chartPanel;

  public PollControlPanel(PollDisplayPanel chart)
  {
    chartPanel = chart;

    button1 = new JButton(chartPanel.getName1());
    button1.setPreferredSize(new Dimension(80, 30));
    button1.setToolTipText("Vote for " + chartPanel.getName1());
    button1.addActionListener(this);

    button2 = new JButton(chartPanel.getName2());
    button2.setPreferredSize(new Dimension(80, 30));
    button2.setToolTipText("Vote for " + chartPanel.getName2());
    button2.addActionListener(this);

    button3 = new JButton(chartPanel.getName3());
    button3.setPreferredSize(new Dimension(80, 30));
    button3.setToolTipText("Vote for " + chartPanel.getName3());
    button3.addActionListener(this);
    
    button4 = new JButton(chartPanel.getName4());
    button4.setPreferredSize(new Dimension(80, 30));
    button4.setToolTipText("Vote for " + chartPanel.getName4());
    button4.addActionListener(this);

    add(button1);
    add(button2);
    add(button3);
    add(button4);
  }

  /**
   * Processes button events
   */
  public void actionPerformed(ActionEvent e)
  {
    JButton button = (JButton)e.getSource();

    if (button == button1)
      chartPanel.vote1();
    else if (button == button2)
      chartPanel.vote2();
    else if (button == button3)
      chartPanel.vote3();
    else if (button == button4)
      chartPanel.vote4();
    chartPanel.repaint();
  }
}
