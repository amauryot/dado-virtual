package view.subpanel.button;

import java.awt.BorderLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;

public class SubPanelButton extends JPanel {

	private static final long serialVersionUID = 6763448939340214899L;

	private final int SUBPANEL_X = 93;
	private final int SUBPANEL_Y = 190;
	private final int SUBPANEL_WIDTH = 90;
	private final int SUBPANEL_HEIGHT = 30;
	
	private ArrayList<JButton> buttonList;
	
	public SubPanelButton() {
		super();
		initialize();
	}
	
	public ArrayList<JButton> buttonList() {
		return buttonList;
	}
	
	private void initialize() {
		
		/* SUBPANEL */
		
		this.setLayout(new BorderLayout());
		this.setBounds(SUBPANEL_X, SUBPANEL_Y, SUBPANEL_WIDTH, SUBPANEL_HEIGHT);
		
		/* BUTTON */
		
		buttonList = new ArrayList<JButton>();
		
		for (Button buttonEnum : Button.values()) {
			JButton button = new JButton(buttonEnum.title());
			button.setFocusable(false);
			this.add(button);
			buttonList.add(button);
		}
	}
}
