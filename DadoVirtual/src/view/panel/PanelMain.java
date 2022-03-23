package view.panel;

import javax.swing.JPanel;
import javax.swing.border.EtchedBorder;

public class PanelMain extends JPanel {

	private static final long serialVersionUID = 7347144160692399552L;

	private final int PANEL_X      = 10;
	private final int PANEL_Y      = 10;
	private final int PANEL_WIDTH  = 276;
	private final int PANEL_HEIGHT = 240;
	
	public PanelMain() {
		super();
		initialize();
	}
	
	private void initialize() {
		this.setLayout(null);
		this.setBorder(new EtchedBorder());
		this.setBounds(PANEL_X, PANEL_Y, PANEL_WIDTH, PANEL_HEIGHT);
	}
}
