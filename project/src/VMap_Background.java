import java.awt.*;
import javax.swing.JComponent;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.geom.*;
import java.util.*;
public class VMap_Background extends DrawObject{
	public VMap_Background()
	{
		super(new GameDrawComponent(){
			public void paintComponent(Graphics g)
			{
				g2 = (Graphics2D) g;
				g.setColor(color); 
				g.fillRect(340,145,170,120);
				g.fillRect(217,137,123,120);
				g.fillRect(135,150,90,120);
				g.fillRect(68,174,90,120);
				g.fillRect(0,180,90,120);
				g.fillRect(0,250,90,85);
				g.fillRect(0,315,40,40);
				g.fillRect(455,160,90,125);
				g.fillRect(540,170,60,125);
				g.fillRect(560,197,80,125);
				g.fillRect(600,197,200,150);
				g.fillRect(780,180,90,160);
				g.fillRect(842,170,80,130);
				g.fillRect(880,150,75,130);
				g.fillRect(900,130,75,130);
				g.fillRect(930,120,75,130);
			}
		});

		cp.color = new Color(0,200,255);
		SetZ(-15);
	}
	int i = 0;
	public void Update()
	{
		i++;
		cp.color = new Color(0,200  - (i % 55),255  - (i % 55));
	}
}