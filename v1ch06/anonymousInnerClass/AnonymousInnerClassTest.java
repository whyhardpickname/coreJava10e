package anonymousInnerClass;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.Timer;

public class AnonymousInnerClassTest
{
	public static void main(String[] args)
	{
		
		TalkingClock clock = new TalkingClock();
		clock.start(1000, true);
		
		JOptionPane.showMessageDialog(null, "Quit program?");
		System.exit(0);
	}
}

class TalkingClock
{
	private int interval;
	private boolean beep;
	
	public void start(int interval, boolean beep)
	{
		ActionListener listener = new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{
				System.out.println("the time is" + new Date());
				if (beep)
				{
					Toolkit.getDefaultToolkit().beep();
				}
			}
		};
		Timer t = new Timer(interval, listener);
		t.start();
	}
}
