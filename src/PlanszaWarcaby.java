import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Stroke;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JPanel;

public class PlanszaWarcaby extends JPanel {
	private static final long serialVersionUID = 1L;

	public void paint(Graphics g) {
		super.paint(g);
		
		setBackground(Color.WHITE);
		
		Graphics2D g2 = (Graphics2D) g;
		
		Stroke defaultStroke = g2.getStroke();
		
		// linie planszy
		float dash[] = {10.0f};
		Stroke lineStroke = new BasicStroke(3.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER, 10.0f, dash, 15.0f);
		g2.setStroke(lineStroke);
		g2.setColor(Color.BLACK);
		for (int i=0; i<9; i++) {
			g2.draw(new Line2D.Double(10+50*i, 10, 10+50*i, 410));
			g2.draw(new Line2D.Double(10, 10+50*i, 410, 10+50*i));
		}
		for (int i=0; i<4; i++) {
			for (int j=0; j<4; j++) {
				g2.setPaint(Color.black);
				g2.fill(new Rectangle2D.Double(10+100*i, 10+100*j, 50, 50));
				g2.fill(new Rectangle2D.Double(60+100*i, 60+100*j, 50, 50));
			}
		}	
	}
}
