package view;

import view.frame.Frame;
import view.panel.PanelMain;
import view.subpanel.button.SubPanelButton;
import view.subpanel.image.SubPanelImage;

public class Window {

	private Frame frame;
	private PanelMain panelMain;
	private SubPanelImage subPanelImage;
	private SubPanelButton subPanelButton;
	
	public Window() {
		initialize();
	}

	public void show() {
		frame.setVisible(true);
	}
	
	private void initialize() {
		frame = new Frame();
		
		panelMain = new PanelMain();
		frame.getContentPane().add(panelMain);
		
		subPanelImage = new SubPanelImage();
		panelMain.add(subPanelImage);
		
		subPanelButton = new SubPanelButton();
		panelMain.add(subPanelButton);
	}
}
