package innerClass;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.Timer;

/**
 * The example of inner class
 * @version 1.0.0 2020-08-09
 * @author Mark Chern
 */
public class InnerClassTest
{
	public static void main(String[] args)
	{
		TalkingClock clock = new TalkingClock(1000, true);
		clock.start();
		
		JOptionPane.showMessageDialog(null, "Quit program?");
		System.exit(0);
	}
}

/**
 * A clock prints time in regular intervals.
 */
class TalkingClock
{
	private int interval;
	private boolean beep;
	
	/**
	 * Constructor a TalkingClock
	 * @param interval the interval between two messages in milliseconds.
	 * @param beep true if the clock should beep.
	 */
	TalkingClock(int interval, boolean beep)
	{
		this.interval = interval;
		this.beep = beep;
	}
	
	/**
	 * starts the clock.
	 */
	public void start()
	{
		ActionListener listener = new TimePrinter();
		Timer t = new Timer(interval, listener);
		t.start();
	}
	
	/**
	 * Timeprinter is inner class
	 */
	 public class TimePrinter implements ActionListener
	 {
		 public void actionPerformed(ActionEvent event)
		 {
			 System.out.println("At the stone, the time is " + new Date());
			 if (beep)
			 {
				 Toolkit.getDefaultToolkit().beep();
			 }
		 }
	 }
}