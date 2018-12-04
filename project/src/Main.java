import com.sun.jmx.snmp.Timestamp;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.*;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
public class Main extends GameObject {
	JLabel label;
	float time = 0;
	public String GetTime()
	{
		return (int)(time /  900 % 24) + "시 " +(int)(time /  15 % 60) + "분 " + (int)((time % 4) * 15) + "초 ";
	}
	@Override
	public void Start()
	{
		label = new JLabel();
		testing.aframe.add(label);
		testing.aframe.setVisible(true);
		label.setLocation(1000, 30);
	}
	// 1초에 60
	@Override
	public void Update()
	{
		time += 1;
		label.setText(GetTime());
		
	}
}
