

import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author MaeCroft22
 * Created on 03/07/2020
 */
public class MyWindow extends Frame{

	public MyWindow(String title) {
		super(title);
		setSize(500,140); 
		addWindowListener(new WindowAdapter() {
			@Override 
			public void windowClosing(WindowEvent e) {
				System.exit(0); 
			}
		});
		
	}
	
	@Override 
	public void paint(Graphics g) {
		super.paint(g);
		Font sansSerifLarge = new Font("SansSerif", Font.BOLD, 18); 
		Font sansSerifSmall = new Font("SansSerif", Font.BOLD, 12); 
		g.setFont(sansSerifLarge);
		g.drawString("The Complete Java Developer", 60, 60);
		g.setFont(sansSerifSmall);
		g.drawString("Spencer Mae-Croft", 60, 100);
	}
}
