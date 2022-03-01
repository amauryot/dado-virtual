package view.subpanel.image;

import java.awt.BorderLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EtchedBorder;

public class SubPanelImage extends JPanel {

	private static final long serialVersionUID = -6867136418021465059L;

	private final int SUBPANEL_X = 68;
	private final int SUBPANEL_Y = 20;
	private final int SUBPANEL_WIDTH = 140;
	private final int SUBPANEL_HEIGHT = 140;
	
	public SubPanelImage() {
		super();
		initialize();
	}
	
	private void initialize() {
		
		/* SUBPANEL */
		
		this.setLayout(new BorderLayout());
		this.setBounds(SUBPANEL_X, SUBPANEL_Y, SUBPANEL_WIDTH, SUBPANEL_HEIGHT);
		
		/* LABEL */
		
		JLabel labelImage = new JLabel();
		labelImage.setBorder(new EtchedBorder());
		labelImage.setHorizontalAlignment(JLabel.CENTER);
		this.add(labelImage);
	}
}
