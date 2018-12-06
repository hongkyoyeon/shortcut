import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Stroke;


public class DrawLabelObject extends DrawObject{
	private String text;
	public static class Label extends GameDrawComponent
	{
		Font font = new Font("Arial", Font.PLAIN, 40);
		public DrawLabelObject DrawLabelObject;
		public void paintComponent(Graphics g)
		{
			super.paintComponent(g);
			g2 = (Graphics2D) g;
			g.setColor(Color.BLACK);
			g.setColor(Color.WHITE);
		    g.setFont(font); 
			g.drawString("ASDFASwergwrgoirg werj weogjweooiwei wergj erweoigrg werg werg reDF", 555,555);
			System.out.println("DG");
		}
			
	}
	public DrawLabelObject()
	{
		super(new Label());
		((Label)cp).DrawLabelObject = this;
		SetSize(new mpoint(100,100));
		SetPosition(new mpoint(500, 500));
		SetZ(1231231231);
		
	};
	public void SetText(String Text)
	{
		this.text =Text;
	}

}
