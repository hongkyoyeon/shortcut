import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
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


public class Main extends DrawObject{
	JLabel label;
	public static double time = 0;
	public static int next_time = 1;
	public static final int TimeSpeed = 4; // 실제시간 1분이 게임의 몇분인가
	public static final int MovePixel = 50; // 게임시간 1분에 얼만큼 이동하는가 (버스)
	public static final int MovePixel_Person = 12;  
	public String GetTime()
	{
		return (int)(time /  900 % 24) + "시 " +(int)(time /  15 % 60) + "분 ";
	}
	public static String ConvertString(double time)
	{
		return (int)(time /  900 % 24) + "시 " +(int)(time /  15 % 60) + "분 ";
	}
	public static double ConvertTime(double h, double m)
	{
		return h * 900 +m * 15;
	}
	@Override
	public void Start()
	{
		label = new JLabel();
		label.setVerticalAlignment(SwingConstants.TOP);
		label.setHorizontalAlignment(SwingConstants.RIGHT);
	    testing.aframe.add(label);
	    
		testing.aframe.setVisible(true);
		SetSize(new mpoint(2000,2000));
		SetPosition(new mpoint(1000, 1000));
		SetZ(999999999);

	}
	@Override
	public void mousePressed(MouseEvent e) {
		GameObject.MouseClick(this,e);
	}
	// 1초에 60
	@Override
	public void Update()
	{
		time += 1;
		label.setText(GetTime());
		
		if (next_time == 0)
		{
			next_time = new Random().nextInt(120);
			new CongestObject();
		
		}
		next_time--;
		// 일정 시간마다 랜덤으로 혼잡 구역이 생김
		
	}
}
