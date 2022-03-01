package view.subpanel.button;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class SubPanelButton extends JPanel {

	private static final long serialVersionUID = 6763448939340214899L;

	private final int SUBPANEL_X = 93;
	private final int SUBPANEL_Y = 190;
	private final int SUBPANEL_WIDTH = 90;
	private final int SUBPANEL_HEIGHT = 30;
	
	public SubPanelButton() {
		super();
		initialize();
	}
	
	private void initialize() {
		
		/* SUBPANEL */
		
		this.setLayout(new BorderLayout());
		this.setBounds(SUBPANEL_X, SUBPANEL_Y, SUBPANEL_WIDTH, SUBPANEL_HEIGHT);
		
		/* BUTTON */
		
		JButton buttonRoll = new JButton("Jogar");
		buttonRoll.setFocusable(false);
		this.add(buttonRoll);
	}
}
