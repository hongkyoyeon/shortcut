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
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;


public class Main extends GameObject{
	JLabel label;
	double time = 0;
	public static final int TimeSpeed = 4; // 실제시간 1분이 게임의 몇분인가
	public static final int MovePixel = 25; // 게임시간 1분에 얼만큼 이동하는가 (버스)
	public static final int MovePixel_Person = 6;  
	public String GetTime()
	{
		return (int)(time /  900 % 24) + "시 " +(int)(time /  15 % 60) + "분 ";
	}
	public static String ConvertString(double time)
	{
		return (int)(time /  900 % 24) + "시 " +(int)(time /  15 % 60) + "분 ";
	}
	public static double ConvertTime(int h, int m)
	{
		return h * 900 +m * 15;
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
