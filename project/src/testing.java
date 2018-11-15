import javax.swing.JFrame;
import java.awt.*;
public class testing

{
	public static void main(String[] args)
	{
		JFrame frame =new JFrame();
		final int width =300;
		final int height =400;
		frame.setSize(width,height);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		new edge(new mpoint(0, 0),new mpoint(40, 91),25);
		new edge(new mpoint(40, 91),new mpoint(64,173),25);
		new edge(new mpoint(93, 6),new mpoint(113, 77),25);
		new edge(new mpoint(40, 91),new mpoint(113, 77),25);
		new edge(new mpoint(64, 173),new mpoint(136,154),25);
		new edge(new mpoint(113,77),new mpoint(136,154),25);
		
		new edge(new mpoint(328, 253),new mpoint(401,265),25);
		new edge(new mpoint(401, 265),new mpoint(481,267),25);
		new edge(new mpoint(481, 267),new mpoint(475,305),25);
		new edge(new mpoint(352,323),new mpoint(475,305),25);
		new edge(new mpoint(401, 265),new mpoint(441,360),25);
		
		new edge(new mpoint(136, 154),new mpoint(164,280),25);
		new edge(new mpoint(164, 280),new mpoint(236,264),25);
		new edge(new mpoint(236, 264),new mpoint(328,253),25);
		new edge(new mpoint(64, 173),new mpoint(136,154),10);
		//new edge(new mpoint(64, 173),new mpoint(136,154),10);
		//new edge(new mpoint(64, 173),new mpoint(136,154),10);
		new edge(new mpoint(40,91),new mpoint(183,59),25);
		new edge(new mpoint(183,59),new mpoint(258,39),25);
		new edge(new mpoint(183,59),new mpoint(167,4),25);
		new edge(new mpoint(264,6),new mpoint(258,39),25);
		new edge(new mpoint(178,29),new mpoint(264,6),15);
		new edge(new mpoint(258,39),new mpoint(330,39),25);
		new edge(new mpoint(330,39),new mpoint(420,39),25);
		new edge(new mpoint(420,39),new mpoint(480,30),25);
		
		
		System.out.println(edge_point.allitem.size());
		new edge(new mpoint(0, 0),new mpoint(40, 91),10);
		new edge(new mpoint(0, 0),new mpoint(40, 91),10);
		
	
		PaintToolFrame component = new PaintToolFrame(1,new Color(255,255,255));
		
		frame.add(component);
		frame.setVisible(true);
		
	}
}