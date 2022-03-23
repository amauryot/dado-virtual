package view.subpanel.image;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SubPanelImage extends JPanel {

	private static final long serialVersionUID = -6867136418021465059L;
	
	private final int SUBPANEL_X      = 68;
	private final int SUBPANEL_Y      = 20;
	private final int SUBPANEL_WIDTH  = 140;
	private final int SUBPANEL_HEIGHT = 140;
	
	private final String IMAGE_FILE = "dice.png";
	
	private JLabel labelImage;
	
	public SubPanelImage() {
		super();
		initialize();
	}
	
	public JLabel labelImage() {
		return labelImage;
	}
	
	private void initialize() {
		
		/* SUBPANEL */
		
		this.setLayout(new BorderLayout());
		this.setBounds(SUBPANEL_X, SUBPANEL_Y, SUBPANEL_WIDTH, SUBPANEL_HEIGHT);
		
		/* LABEL */
		
		labelImage = new JLabel();
		labelImage.setHorizontalAlignment(JLabel.CENTER);
		this.add(labelImage);
		
		ImageIcon dice = new ImageIcon(ClassLoader.getSystemResource(IMAGE_FILE));
		labelImage.setIcon(dice);
	}
}
